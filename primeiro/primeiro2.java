package primeiro;
public class primeiro2 {

    String nome;
    int ID;
    double QtdRecebida;

    void info(){

        System.out.println("nome:" + nome);
        System.out.println("id:" + ID);
        System.out.println("qtdrecebida:" + QtdRecebida);

    }



    static float valorRenda(float qtdVendida){
        return qtdVendida * 5;
    }



    
}
