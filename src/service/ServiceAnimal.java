package service;

import helpers.Input;
import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Cliente;

public class ServiceAnimal {

    private static final List<Animal> animais = new ArrayList<>();

    public <T extends Animal> T cadastrar(T animal) {
        System.out.println("=== Cadastro de " + animal.getClass().getSimpleName() + " ===");

        int id = Input.readInt("ID do animal: ");

        boolean existe = animais.stream().anyMatch(a -> a.getId() == id);
        if (existe) {
            System.out.println("Erro: Já existe um animal com esse ID!");
            return null;
        }

        animal.setId(id);

        String nome = Input.readString("Nome: ");
        int idade = Input.readInt("Idade: ");
        float peso = (float) Input.readDouble("Peso: ");

        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setPeso(peso);

        String cpf = Input.readString("CPF do dono: ");
        Cliente dono = ServiceCliente.getListaClientes()
                .stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (dono == null) {
            System.out.println("Erro: Cliente não encontrado!");
            return null;
        }

        animal.setDono(dono);

        animais.add(animal);

        System.out.println("\nAnimal cadastrado com sucesso!");
        System.out.println(animal);

        return animal;
    }

    public List<Animal> listar() {
        return animais;
    }

    //buscar animal por ID

    public Animal buscarPorId(int id) {
        return animais.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //buscar por nome (Gato e Cachorro)

    public Animal buscarPorNome(String nome) {
    for (Animal a : animais) {
        if (a.getNome().equalsIgnoreCase(nome)) {
            return a;
        }
    }
    return null;
}
    public <T extends Animal >T buscarPorNome(String nome, List<T> animais) {
        for (T a : animais) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }


    public <T extends Animal> void remover(List<T> animais){
        System.out.println("Escolha se deseja remover por:" +
                "\n1 - ID" +
                "\n2 - Nome");
        int opc = Input.readInt("Escolha:");
        T encontrado = null;
        switch(opc){
            case 1:
                int id =  Input.readInt("ID do animal: ");
                for (T a : animais){
                    if(a.getId() == id){
                        encontrado = a;
                        break;
                    }
                }
                break;
            case 2:
                String nome =   Input.readString("Nome: ");
                encontrado = buscarPorNome(nome, animais);
                break;
            default:
                System.out.println("OPÇÃO INVALIDA!");
                break;
        }
        if(encontrado != null){
            animais.remove(encontrado);
            System.out.println("Animal removido com sucesso!");
        }else{
            System.out.println("Animal não encontrado!");
        }
    }
}
