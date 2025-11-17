package service;

import helpers.Input;
import model.Veterinario;

import java.util.ArrayList;
import java.util.List;

public class ServiceVeterinario implements CrudService<Veterinario> {
    private final static List<Veterinario> veterinarios = new ArrayList<>();

    public void cadastrar(){
        System.out.println("=== Cadastro de Veterinario ===");

        String nome = Input.readString("Digite o nome do veterinário: ");
        String telefone = Input.readString("Digite o telefone do veterinário: ");
        String cpf = Input.readString("Digite o CPF do veterinário: ");
        String crmv = Input.readString("Digite o CRMV do veterinário: ");

        //cria o objeto Veterinario com os dados coletados
        Veterinario vet = new Veterinario(nome, telefone, cpf, crmv);
        veterinarios.add(vet);

        System.out.println("\nVeterinario cadastrado com sucesso!");
        System.out.println(vet); //usa o toString() pra mostrar as infos

    }
    @Override
    public List<Veterinario> listAll(){
        return veterinarios;
    }
        
}
