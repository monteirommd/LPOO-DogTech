package service;

import helpers.Input;
import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ServiceCliente {
    private final static List<Cliente> clientes = new ArrayList<>();
    
    public Cliente cadastrar(){
        System.out.println("=== Cadastro de Cliente ===");

        String nome = Input.readString("Digite o nome do cliente: ");
        String telefone = Input.readString("Digite o telefone do cliente: ");
        String cpf = Input.readString("Digite o CPF do cliente: ");
        //ja adicionei o reader de booleano na helpers
        boolean plano = Input.readBoolean("Possui plano de saúde? (sim/não): ");

        //cria o objeto Cliente com os dados coletados
        Cliente cliente = new Cliente(nome, telefone, cpf, plano);
        clientes.add(cliente);

        System.out.println("\nCliente cadastrado com sucesso!");
        System.out.println(cliente); //usa o toString() pra mostrar as infos

        return cliente;
    }

    public List<Cliente> listarClientes(){
        return clientes;
    }
}
