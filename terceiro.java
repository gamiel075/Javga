import java.util.Scanner;

public class terceiro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o id");
        int id = teclado.nextInt();
        System.out.println("digite o nome");
        String nome = teclado.next();
        System.out.println("digite o tipo");
        int tipo = teclado.nextInt();

        terceiro2 obj = new terceiro2();

        switch(tipo){
            case 1 -> System.out.println("boa");
            case 2 -> System.out.println("otimo");
            case 3 -> System.out.println("legal");

        }
    }
        
}
    

