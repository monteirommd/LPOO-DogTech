package view;

import helpers.Input;
import service.ServiceCachorro;
import service.ServiceCliente;
import service.ServiceGato;
import service.ServiceVeterinario;

public class MenuConsultaCadastro {

    public void open(){
        int option;

        do{
            exibirMenu();
            option = Input.readInt("Digite sua opção: ");

            switch (option){
                case 1:
                    new ServiceCliente().buscarClienteCPF();
                    break;
                case 2:
                    ServiceVeterinario.buscarVetCPF();
                    break;
                case 3:
                    new ServiceGato().buscarGato();
                    break;
                case 4:
                    new ServiceCachorro().buscarCachorro();
                    break;
                case 0:
                    break;
            }

        }while(option != 0);

    }

    public void exibirMenu(){
        System.out.println("=== Menu Consulta ===");
        System.out.println("1. Cadastrar Cadastro de Cliente");
        System.out.println("2. Consultar Cadastro de Veterinario");
        System.out.println("3. Consultar Cadastro de Gato");
        System.out.println("4. Consultar Cadastro de Cachorro");
        System.out.println("0. Sair do menu");

    }
}
