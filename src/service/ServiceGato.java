package service;

import helpers.Input;
import java.util.ArrayList;
import java.util.List;
import model.Gato;
import model.Cliente;

public class ServiceGato {

    private final static List<Gato> gatos = new ArrayList<>();

    public void cadastrar() {
        System.out.println("=== Cadastro de Gato ===");

        int id = Input.readInt("ID do animal: ");

        boolean existe = gatos.stream()
                .anyMatch(g -> g.getId() == id);

        if (existe) {
            System.out.println("Erro: Já existe um gato com esse ID!");
            return;
        }

        String nome = Input.readString("Nome do gato: ");
        int idade = Input.readInt("Idade: ");
        float peso = (float) Input.readDouble("Peso: ");

        // Escolher o dono já cadastrado
        String cpfDono = Input.readString("CPF do dono: ");

        Cliente dono = ServiceCliente.getListaClientes()
                .stream()
                .filter(c -> c.getCpf().equals(cpfDono))
                .findFirst()
                .orElse(null);

        if (dono == null) {
            System.out.println("Erro: Não existe cliente com esse CPF!");
            return;
        }

        Gato gato = new Gato(id);
        gato.setNome(nome);
        gato.setIdade(idade);
        gato.setPeso(peso);
        gato.setDono(dono);

        gatos.add(gato);

        System.out.println("\nGato cadastrado com sucesso!");
        System.out.println(gato);

    }

    public List<Gato> listar() {
        return gatos;
    }
}