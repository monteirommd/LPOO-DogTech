package view;

import helpers.Input;

public class MenuCadastro {

    public void open(){
        int option;
        do{
            menuCadastro();
            option = Input.readInt("Digite uma opção: ");

            switch(option){
                case 1:
                    // Método de Cadastrar cliente vindo da Service
                    break;
                case 2:
                    // Método de Cadastrar veterianario vindo da Service
                    break;
                case 3:
                    // Método de Cadastrar Gato vindo da Service
                    break;
                case 4:
                    // Método de Cadastrar Cachorro vindo da Service
                    break;
                case 0:
                    System.out.println("Voltando menu");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }while(option != 0);
    }

    private void menuCadastro(){
        System.out.println("Digite 1 para cadastrar um Cliente");
        System.out.println("Digite 2 para cadastrar um Veterinario");
        System.out.println("Digite 3 para cadastrar um Gato");
        System.out.println("Digite 4 para cadastrar um Cachorro");
        System.out.println("Digite 0 para voltar ao menu anterior");
    }
}
