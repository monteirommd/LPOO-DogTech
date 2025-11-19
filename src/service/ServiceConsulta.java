package service;

import helpers.Input;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Animal;
import model.Consulta;
import model.Veterinario;

public class ServiceConsulta {

    private static List<Consulta> consultas = new ArrayList<>();

    private ServiceVeterinario serviceVet = new ServiceVeterinario();
    private ServiceCachorro serviceCachorro = new ServiceCachorro();
    private ServiceGato serviceGato = new ServiceGato();


    //Cadastrar Consulta
    public void cadastrar() {
        System.out.println("=== CADASTRAR CONSULTA ===");

        String data = Input.readString("Digite a data da consulta (dd/mm/aaaa): ");
        String hora = Input.readString("Digite o horário (hh:mm): ");
        Double valor = Input.readDouble("Digite o valor da consulta: ");

        // Buscar veterinário
        //String cpfVet = Input.readString("CPF do veterinário: ");
        Veterinario veterinario = serviceVet.buscarVetCPF();

        if (veterinario == null) {
            System.out.println("Veterinário não encontrado. Cancelando cadastro.");
            return;
        }

        //Buscar animal
        System.out.println("O animal é:");
        System.out.println("1 - Gato");
        System.out.println("2 - Cachorro");
        int tipoAnimal = Input.readInt("Digite: ");

        ServiceAnimal serviceAnimal = new ServiceAnimal(); //instancio animal para usar o metodo


        Animal animal = null;

        if (tipoAnimal == 1) {
            String nomeGato = Input.readString("Nome do gato: ");
            animal = serviceAnimal.buscarPorNome(nomeGato);

        } else if (tipoAnimal == 2) {
            String nomeCachorro = Input.readString("Nome do cachorro: ");
            animal = serviceAnimal.buscarPorNome(nomeCachorro);

        } else {
            System.out.println("Tipo inválido. Cancelando.");
            return;
        }

        if (animal == null) {
            System.out.println("Animal não encontrado. Consultas devem ser feitas apenas com animais cadastrados.");
            return;
        }

        //Criando consulta
        Consulta c = new Consulta();
        c.setData(data);
        c.setHora(hora);
        c.setValor(valor);
        c.setVeterinario(veterinario);
        c.setAnimal(animal);

        consultas.add(c);

        System.out.println("Consulta cadastrada com sucesso!");
    }

    //Listar todas
    public void listar() {
        System.out.println("=== LISTA DE CONSULTAS ===");

        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta cadastrada.");
            return;
        }

        consultas.forEach(c -> {
            System.out.println("--------------------------");
            c.exibirInfo();
        });
    }

    //Buscar por data
    public Consulta buscarPorData(String data) {
        Optional<Consulta> consulta = consultas.stream()
                .filter(c -> c.getData().equalsIgnoreCase(data))
                .findFirst();

        return consulta.orElse(null);
    }

    //Buscar por veterinario
    public List<Consulta> buscarPorVeterinario(String cpfVet) {
        return consultas.stream()
                .filter(c -> c.getVeterinario().getCpf().equals(cpfVet))
                .toList();
    }

    //Remover consulta
    public void remover() {
        String data = Input.readString("Data da consulta: ");
        String hora = Input.readString("Hora da consulta: ");

        Optional<Consulta> consultaRemover = consultas.stream()
                .filter(c -> c.getData().equals(data) && c.getHora().equals(hora))
                .findFirst();

        if (consultaRemover.isPresent()) {
            consultas.remove(consultaRemover.get());
            System.out.println("Consulta removida com sucesso.");
        } else {
            System.out.println("Consulta não encontrada.");
        }
    }
}
