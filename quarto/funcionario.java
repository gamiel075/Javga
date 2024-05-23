package quarto;

public class funcionario {
    int matricula;
    String nome;
    int cpf;
    int idade;
    String sexo;


    public funcionario( int matricula){
        super();
        this.matricula = matricula;
        this.nome = "não disponível";
        this.cpf = 0;
        this.idade = 20;
        this.sexo = "não cadastrado";

    }

    funcionario(){

        System.out.println("nulo");
    }


    funcionario (int matricula,String nome,int cpf,int idade, String sexo) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;

    }

    


}





    

