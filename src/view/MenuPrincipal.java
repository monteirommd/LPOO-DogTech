package view;

import helpers.Input;

public class MenuPrincipal {
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
                    break;
                case 3:
                    break;
                case 4:
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
        System.out.println("------- SISTEMA DOGTECH -------");
        System.out.println("Digite 1: Realizar o cadastro");
        System.out.println("Digite 2: Consultar um cadastro");
        System.out.println("Digite 3: Adicionar um cadastro");
        System.out.println("Digite 4: Remover um cadastro");
        System.out.println("Digite 0: Para sair do menu");
    };



}
