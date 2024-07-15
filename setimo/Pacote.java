package setimo;

public abstract class Pacote {
    int ID;
    String nomeContratante;
    int qtdDias;
    
    public Pacote(int ID,String nomeContratante,int qtdDias){
        super();
        this.ID = ID;
        this.nomeContratante= nomeContratante;
        this.qtdDias = qtdDias;


    }

    public  float valorTotal(){

        return 0;



    }

    public void imprimir(){

        System.out.println("ID: " + ID );
        System.out.println("nomeContrante" + nomeContratante);
        System.out.println("valor total" + valorTotal());

    }
  
}
