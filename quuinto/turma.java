package quuinto;

import java.util.ArrayList;

public class turma {

    public String turno;
    public int numeroDaTurma;
    public professor prof;
    ArrayList<aluno>alunos;

    public turma(String turno,int numeroDaTurma,professor prof) {

        this.turno = turno;
        this.numeroDaTurma = numeroDaTurma;
        this.prof = prof;
        this.alunos = new ArrayList<>();

    }

    public void addaluno(aluno alun){
        alunos.add(alun);
    
    }

    public int getnumeroDeAlunos(){
        return alunos.size();
    }



    public void info(){

        System.out.println("turno:" + turno);
        System.out.println("professor:" + prof.nome);
        System.out.println("qtd de alunos" + getnumeroDeAlunos());
        for(aluno alun: alunos) {
            System.out.println("matricula:" + alun.matricula + "cpf" + alun.cpf + "-" + alun.dataDeCadastro);
        }
    }

}

