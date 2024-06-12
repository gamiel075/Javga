package quuinto;

public class principal{
    public static void main(String[] args) {
        // Criando professor
        professor prof1 = new professor(1001, "João Silva", 123456789);

        // Criando turma 1 com o professor criado
        turma turma1 = new turma("Manhã", 1, prof1);

        // Criando alunos para a turma 1
        aluno aluno1 = new aluno("Ana Oliveira", "2000-01-01", "12345678901", 2001);
        aluno aluno2 = new aluno("Pedro Santos", "2000-02-02", "23456789012", 2002);
        aluno aluno3 = new aluno("Mariana Silva", "2000-03-03", "34567890123", 2003);
        aluno aluno4 = new aluno("Lucas Souza", "2000-04-04", "45678901234", 2004);
        aluno aluno5 = new aluno("Juliana Costa", "2000-05-05", "56789012345", 2005);
        aluno aluno6 = new aluno("Mateus Pereira", "2000-06-06", "67890123456", 2006);
        aluno aluno7 = new aluno("Carla Lima", "2000-07-07", "78901234567", 2007);
        aluno aluno8 = new aluno("Bruno Almeida", "2000-08-08", "89012345678", 2008);
        aluno aluno9 = new aluno("Fernanda Oliveira", "2000-09-09", "90123456789", 2009);
        aluno aluno10 = new aluno("Rafael Silva", "2000-10-10", "01234567890", 2010);

        // Adicionando alunos à turma 1
        turma1.addaluno(aluno1);
        turma1.addaluno(aluno2);
        turma1.addaluno(aluno3);
        turma1.addaluno(aluno4);
        turma1.addaluno(aluno5);
        turma1.addaluno(aluno6);
        turma1.addaluno(aluno7);
        turma1.addaluno(aluno8);
        turma1.addaluno(aluno9);
        turma1.addaluno(aluno10);

        // Criando professor
        professor prof2 = new professor(1002, "Maria Oliveira", 987654321);

        // Criando turma 2 com o professor criado
        turma turma2 = new turma("Tarde", 2, prof2);

        // Criando alunos para a turma 2
        aluno aluno11 = new aluno("João Costa", "2000-11-11", "11111111111", 2011);
        aluno aluno12 = new aluno("Ana Pereira", "2000-12-12", "22222222222", 2012);
        aluno aluno13 = new aluno("Pedro Alves", "2001-01-01", "33333333333", 2013);
        aluno aluno14 = new aluno("Mariana Lima", "2001-02-02", "44444444444", 2014);
        aluno aluno15 = new aluno("Lucas Santos", "2001-03-03", "55555555555", 2015);
        aluno aluno16 = new aluno("Juliana Silva", "2001-04-04", "66666666666", 2016);
        aluno aluno17 = new aluno("Mateus Costa", "2001-05-05", "77777777777", 2017);
        aluno aluno18 = new aluno("Carla Almeida", "2001-06-06", "88888888888", 2018);
        aluno aluno19 = new aluno("Bruno Lima", "2001-07-07", "99999999999", 2019);
        aluno aluno20 = new aluno("Fernanda Souza", "2001-08-08", "00000000000", 2020);

        // Adicionando alunos à turma 2
        turma2.addaluno(aluno11);
        turma2.addaluno(aluno12);
        turma2.addaluno(aluno13);
        turma2.addaluno(aluno14);
        turma2.addaluno(aluno15);
        turma2.addaluno(aluno16);
        turma2.addaluno(aluno17);
        turma2.addaluno(aluno18);
        turma2.addaluno(aluno19);
        turma2.addaluno(aluno20);

        // Exibindo informações das turmas
        System.out.println("Turma 1:");
        turma1.info();
        System.out.println("\nTurma 2:");
        turma2.info();
    }

}