package segundo;
public class segundo2 {
    int ID;
    String nomeTitular;
    double valor;
    String status;
    int diasDeAtraso;
    static final double juros = 2.5;

    static float  taxaDolar(int valortaxa){
        return valortaxa * 5;

    }


    double valorFinal(){

        return diasDeAtraso * juros + valor;
    }

    void info() {
        System.out.println("id:" + ID);
        System.out.println("nome:" + nomeTitular);
        System.out.println("valor:" + valor);
        System.out.println("status:" + status);
        System.out.println("valor final:" + valorFinal());


    }

    
    
}
