package setimo;

public class Diario extends Pacote {
    public int valorAdd;
    public int valorDiário;
    public int qtdQuartos;


    public Diario(int ID, String nomeContratante,int qtdDias,int valorAdd,int valorDiário,int qtdQuartos){
        super(ID,nomeContratante,qtdDias);
        this.valorAdd = valorAdd;
        this.valorDiário=valorDiário;
        this.qtdQuartos = qtdQuartos;

    }

    int valorA = valorDiário * qtdQuartos;
    int valorB = valorA + valorAdd;


    
    
    public float valorTotal(){
        

        return valorB;


    }




       
    

}