package view;

import helpers.Input;
import service.*;

public class MenuCadastro {

    public void open(){
        int option;
        do{
            menuCadastro();
            option = Input.readInt("Digite uma opção: ");

            switch(option){
                case 1:
                    new ServiceCliente().cadastrar();
                    break;
                case 2:
                    new ServiceVeterinario().cadastrar();
                    break;
                case 3:
                    new ServiceGato().cadastrar();                
                    break;
                case 4:
                    new ServiceCachorro().cadastrar();
                    break;
                case 5:
                    new ServiceConsulta().cadastrar();
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
        System.out.println("=== MENU DE CADASTRO ===");
        System.out.println("Digite 1: para cadastrar um Cliente");
        System.out.println("Digite 2: para cadastrar um Veterinario");
        System.out.println("Digite 3: para cadastrar um Gato");
        System.out.println("Digite 4: para cadastrar um Cachorro");
        System.out.println("Digite 5: para cadastrar uma consulta");
        System.out.println("Digite 0: para voltar ao menu anterior");
    }
}
