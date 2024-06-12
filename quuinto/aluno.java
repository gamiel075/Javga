package quuinto;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.Date;

public class aluno {

    private  String nome;
    private  String  dataDeNascimento;
    protected   String cpf;
    public  int matricula;
    public Date dataDeCadastro;



    aluno (String nome, String dataDeNascimento,String cpf,int matricula){

        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataDeCadastro = new Date();


    }


    public aluno (int matricula){
        super();
        this.nome = "sem nome";
        this.dataDeNascimento = "NULO";
        this.cpf = "não cadastrado";
        this.matricula = matricula;


    }

    aluno(){
        System.out.println("dado vazio");
    }











    
}
