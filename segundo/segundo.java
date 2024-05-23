package segundo;

import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        segundo2 contaA = new segundo2();
        contaA.ID = 111;
        contaA.nomeTitular = "gabriel";
        contaA.valor = 56.89;
        contaA.status = "pago";
        contaA.diasDeAtraso = 5;

        
        segundo2 contaB = new segundo2();
        contaB.ID =112;
        contaB.nomeTitular = "miguel";
        contaB.valor = 23.78;
        contaB.status = "não pago";
        contaB.diasDeAtraso = 3;

        segundo2 contaC = new segundo2();
        contaC.ID = 113;
        contaC.nomeTitular = "daniel";
        contaC.valor = 23.88;
        contaC.status = "não pago";
        contaC.diasDeAtraso = 7;

        segundo2 contaD = new segundo2();
        contaD.ID = 114;
        contaD.nomeTitular = "Daniel";
        contaD.valor = 43.76;
        contaD.status = "pago";
        contaD.diasDeAtraso = 3;

        
        contaA.info();
        System.out.println(contaA.taxaDolar(4));
        System.out.printf("----------------------------");
        contaB.info();
        System.out.println(contaB.taxaDolar(4));
        System.out.printf("-------------------------");
        contaC.info();
        System.out.println(contaC.taxaDolar(6));
        System.out.printf("--------------------------");
        contaD.info();
        System.out.println(contaD.taxaDolar(7));

    }
    
}
