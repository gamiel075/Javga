package sexto;

public  class serviçoDigital extends serviço{
    public String descriçao;
    public float custosAdd;
    public String link;

    public serviçoDigital(int ID,String status,String dataServiço,String descriçao, float custosAdd,String link){
        super(ID, status, dataServiço);
        this.descriçao = descriçao;
        this.custosAdd = custosAdd;
        this.link = link;


    }

    
    public float lucroadd(){
        return super.lucro() + custosAdd;
    }

    public void imprimirSD(){
        imprimir();
        System.out.println("descrição:" + descriçao);
        System.out.println("custo final:" + lucroadd());
        System.out.println("link:" + link);
        System.out.println("");
        
        





    }



    

























}