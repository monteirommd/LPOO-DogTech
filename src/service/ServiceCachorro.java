package service;

import helpers.Input;
import java.util.ArrayList;
import java.util.List;
import model.Cachorro;
import model.Cliente;
import model.Gato;


public class ServiceCachorro extends ServiceAnimal {

    private final static List<Cachorro> cachorros = new ArrayList<>();

    public void cadastrar() {
        System.out.println("=== Cadastro de Cachorro ===");

        int id = Input.readInt("ID do animal: ");

        boolean existe = cachorros.stream()
                .anyMatch(c -> c.getId() == id);

        if (existe) {
            System.out.println("Erro: Já existe um cachorro com esse ID!");
            return;
        }

        String nome = Input.readString("Nome do cachorro: ");
        String raca = Input.readString("Raça: ");
        int idade = Input.readInt("Idade: ");
        float peso = (float) Input.readDouble("Peso: ");

        //Escolher o dono já cadastrado
        String cpfDono = Input.readString("CPF do dono: ");

        //Buscar o cliente dono pelo CPF
        Cliente dono = ServiceCliente.getListaClientes()
                .stream()
                .filter(c -> c.getCpf().equals(cpfDono))
                .findFirst()
                .orElse(null);

        if (dono == null) {
            System.out.println("Erro: Não existe cliente com esse CPF!");
            return;
        }

        Cachorro cachorro = new Cachorro(id);
        cachorro.setNome(nome);
        cachorro.setRaca(raca);
        cachorro.setIdade(idade);
        cachorro.setPeso(peso);
        cachorro.setDono(dono);

        cachorros.add(cachorro);

        System.out.println("\nCachorro cadastrado com sucesso!");
        System.out.println(cachorro);

    }
    public void buscarCachorro(){
        String nome = Input.readString("Nome do cachorro: ");
        Cachorro c = null;
        for (Cachorro dog : cachorros) {
            if (dog.getNome().equals(nome)) {
                c = dog;
                break;
            }
        }
        if (c != null) {
            System.out.println(c);
        }else{
            System.out.println("Cachorro não encontrado");
            return;
        }

    }

    
    public static List<Cachorro> listAll() {
        return cachorros;
    }
}
