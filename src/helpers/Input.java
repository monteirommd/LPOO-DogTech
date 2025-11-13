package helpers;

import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);

    private Input(){};

    public static String readString(String message){
        System.out.println(message);
        return sc.nextLine();
    }

    public static int readInt(String message){
        while (true) {
            try {
                System.out.print(message);
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }
    public static int readInt(){
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static double readDouble(String message){
        while(true){
            try{
                System.out.print(message);
                double value = Double.parseDouble(sc.nextLine());
                return value;
            }catch (NumberFormatException e){
                System.out.println("Entrada inválida. Digite um numero decimal.");
            }
        }
    }
    
    public static boolean readBoolean(String message) {
    while (true) {
        System.out.print(message);
        String input = sc.nextLine().trim().toLowerCase();

        switch (input) {
            case "true", "t", "sim", "s", "1" -> {
                return true;
            }
            case "false", "f", "nao", "não", "n", "0" -> {
                return false;
            }
            default -> System.out.println("Entrada inválida. Digite 'sim' ou 'não'.");
        }
    }
}
    

    public static void close(){
        sc.close();
    }
}
