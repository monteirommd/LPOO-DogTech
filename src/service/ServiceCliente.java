package service;

import helpers.Input;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ServiceCliente {
    private final static List<Cliente> clientes = new ArrayList<>();
    
    public Cliente cadastrar(){
        System.out.println("=== Cadastro de Cliente ===");

        String nome = Input.readString("Digite o nome do cliente: ");
        String telefone = Input.readString("Digite o telefone do cliente: ");
        String cpf = Input.readString("Digite o CPF do cliente: ");
        
        //verifica se o cpf ja existe
        boolean existe = clientes.stream()
            .anyMatch(c -> c.getCpf().equals(cpf));

        if(existe){
            System.out.println("Erro: Já existe um cliente cadastrado com esse CPF!");
            return null;
        }

        //ja adicionei o reader de booleano na helpers
        boolean plano = Input.readBoolean("Possui plano de saúde? (sim/não): ");

        //cria o objeto Cliente com os dados coletados
        Cliente cliente = new Cliente(nome, telefone, cpf, plano);
        clientes.add(cliente);

        System.out.println("\nCliente cadastrado com sucesso!");
        System.out.println(cliente); //usa o toString() pra mostrar as infos

        return cliente;
    }

    //Listar todos os clientes
    public List<Cliente> listarClientes(){
        return clientes;
    }

    //Método de remoção por CPF
    public boolean removerPorCpf(){
        String cpf = Input.readString("Digite o CPF para remover: ");

        boolean removido = clientes.removeIf(c -> c.getCpf().equals(cpf));
        
        if(removido){
            System.err.println("Cliente removido com sucesso!");
        }
        else{
            System.err.println("Nenhum cliente cadastrado com esse CPF.");
        }
        return removido;
    }

    //Método de atualizar o cliente
    public void atualizarCliente(){
        String cpf = Input.readString("Digite o CPF do cliente que deseja atualizr:");

        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if(cliente == null){
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("\n=== Atualizando Cliente ===");

        String novoNome = Input.readString("Novo nome (" + cliente.getNome() + "): ");
        String novoTelefone = Input.readString("Novo telefone (" + cliente.getTelefone() + "): ");
        boolean novoPlano = Input.readBoolean("Possui plano? (sim/não): ");

        cliente.setNome(novoNome);
        cliente.setTelefone(novoTelefone);
        cliente.setPlanoSaude(novoPlano);

        System.out.println("Cliente atualizado com sucesso!");
    }

//Busca com equals mesmo
/*
    public void buscarClienteCPF(){
        String cpfBusca = Input.readString("Digite o CPF do cliente para busca: ");
        for(Cliente c : clientes){
            if(c.getCpf().equals(cpfBusca)){
                c.exibirInfo();
            }
        }
    }*/

   //busca por CPF com stream pra seguir as orientações do trabalho
    public void buscarClienteCPF(){
    String cpfBusca = Input.readString("Digite o CPF do cliente para busca: ");

    Cliente cliente = clientes.stream()
            .filter(c -> c.getCpf().equals(cpfBusca))
            .findFirst()
            .orElse(null);

    if(cliente != null){
        cliente.exibirInfo();
    } 
    else{
        System.out.println("Cliente não encontrado.");
    }
    }

    //busca por Nome com Stream
    public void buscarPorNome(){
        String nomeBusca = Input.readString("Digite o nome: ");

        clientes.stream()
                .filter(c -> c.getNome().toLowerCase().contains(nomeBusca))
                .forEach(Cliente::exibirInfo);
    }

    //Filtrar clientes que tem plano de saúde
    public void listarClientesComPlano(){
        clientes.stream()
                .filter(Cliente::getPlanoSaude)
                .forEach(Cliente::exibirInfo);
    }

    //Filtrar sem plano
    public void listarClientesSemPlano(){
        clientes.stream()
                .filter(c -> !c.getPlanoSaude())
                .forEach(Cliente::exibirInfo);
    }
    public static List<Cliente> getListaClientes() {
        return clientes;
    }
}
