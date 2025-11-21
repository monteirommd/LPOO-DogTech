package view;

import helpers.Input;
import model.Consulta;
import service.*;

public class MenuPrincipal {
    public MenuPrincipal() {

    }
    public void start(){
        int option;
        do{
            exibirMenu();
            option = Input.readInt("Digite uma opção: ");
            switch(option){
                case 1:
                    new MenuCadastro().open();
                    break;
                case 2:
                    new MenuConsultaCadastro().open();
                    break;
                case 3:
                    removerCadastro();

                    break;
                case 4:
                    ServiceConsulta.remover();
                    break;
                case 5:
                    new ServiceConsulta().listar();
                    break;
                case 6:
                    new ServiceCliente().exibirClientes();
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida, digite uma opção válida");
                    break;

            }


        } while(option != 0);

    }

    private void exibirMenu(){
        System.out.println("=== SISTEMA DOGTECH ===");
        System.out.println("Digite 1: Realizar o cadastro");
        System.out.println("Digite 2: Consultar um cadastro");
        System.out.println("Digite 3: Remover um cadastro");
        System.out.println("Digite 4: Remover uma consulta");
        System.out.println("Digite 5: Lista todas consultas");
        System.out.println("Digite 6: Listar todos os clientes");
        System.out.println("Digite 0: Para sair do menu");
    };

    private void removerCadastro(){
        System.out.println("=== REMOVER CADASTRO ===");
        System.out.println("Digite 1: Remover um cliente");
        System.out.println("Digite 2: Remover um animal");
        System.out.println("Digite 3: Remover um Veterinario");

        int opt = Input.readInt("Digite sua opção");
        switch (opt){
            case 1:
                new ServiceCliente().removerPorCpf();
                break;
            case 2:
                System.out.println("1 - Remover Gato");
                System.out.println("2 - Remover Cachorro");
                int a = Input.readInt("Digite a opção");
                if(a == 1){
                    new ServiceGato().remover(ServiceGato.listAll());
                } else if(a == 2){
                    new ServiceCachorro().remover(ServiceCachorro.listAll());
                } else{
                    System.out.println("OPÇÃO INVALIDA!");
                }
                break;
            case 3:
                ServiceVeterinario.remover();
                break;
        }
    }



}
