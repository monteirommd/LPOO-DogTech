package view;

import helpers.Input;

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
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:

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
        System.out.println("Digite 5: Buscar uma consulta");
        System.out.println("Digite 6: Listar todos os clientes");
        System.out.println("Digite 0: Para sair do menu");
    };



}
