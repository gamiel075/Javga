package primeiro;

import java.util.Scanner;


public class primeiro{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        primeiro2 pessoa1 = new primeiro2();
        pessoa1.nome= "gabriel";
        pessoa1.ID = 111;
        pessoa1.QtdRecebida = 50;

        primeiro2 pessoa2 = new primeiro2();
        pessoa2.nome = "miguel";
        pessoa2.ID = 112;
        pessoa2.QtdRecebida = 43;


        System.out.println(primeiro2.valorRenda(30));
  
        pessoa1.info();
        pessoa2.info();
    }

}