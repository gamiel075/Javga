package quarto;

import java.util.ArrayList;

public class Equipe {
    String turno;
    lider lid;
    ArrayList<funcionario>funcionarios;


    public Equipe(String turno,lider lid){
        this.turno = turno;
        this.lid = lid;
        new ArrayList<>();
    }


    public void addfuncionario(funcionario func){
        funcionarios.add(func);
    }


    public  void info() {
        System.out.println("turno:" + turno);
        System.out.println("líder:" + lid.nome + "formação:" + lid.formação);
        System.out.println("funcionarios");
        for(funcionario func : funcionarios) {
            System.out.println("nome:" + func.nome + ",matricula" + func.matricula);
        }


    }









  
}




