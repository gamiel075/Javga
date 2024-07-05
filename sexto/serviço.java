package sexto;


public class serviço {
    public int ID;
    public String tipo;
    public String status;
    public int tempoEmHoras;
    protected  String contratante;
    public String dataServiço;


    public serviço(int ID,String status,String dataServiço){
        this.ID = ID;
        this.status = status;
        this.dataServiço = dataServiço;


    }

    protected  String getContratante(){
        return contratante;
    }

    protected void setContratante () {
        this.contratante = contratante;
    }


    public float lucro(){
        return tempoEmHoras * 5;
    }

    public void imprimir(){

        System.out.println("id:"+ ID);
        System.out.println("status:"+ status);
        System.out.println("data do serviço:"+ dataServiço);
        System.out.println("valor:"  + lucro());
        System.out.println("");




    }



    
}
