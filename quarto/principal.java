package quarto;

public class principal {
    public static void main(String[] args) {
        // Criação dos líderes
        lider lider1 = new lider(1, "Carlos Silva", "Engenharia");
        lider lider2 = new lider(2, "Mariana Almeida", "Administração");

        // Criação das equipes
        Equipe equipe1 = new Equipe("Manhã", lider1);
        Equipe equipe2 = new Equipe("Tarde", lider2);

        // Criação dos funcionários para a equipe 1
        funcionario func1_1 = new funcionario(101, "Ana Paula", 123456781, 21, "Feminino");
        funcionario func1_2 = new funcionario(102, "Bruno Costa", 123456782, 22, "Masculino");
        funcionario func1_3 = new funcionario(103, "Cláudia Souza", 123456783, 23, "Feminino");
        funcionario func1_4 = new funcionario(104, "Daniel Fernandes", 123456784, 24, "Masculino");
        funcionario func1_5 = new funcionario(105, "Eduarda Lima", 123456785, 25, "Feminino");
        funcionario func1_6 = new funcionario(106, "Felipe Pereira", 123456786, 26, "Masculino");
        funcionario func1_7 = new funcionario(107, "Gabriela Oliveira", 123456787, 27, "Feminino");
        funcionario func1_8 = new funcionario(108, "Hugo Martins", 123456788, 28, "Masculino");
        funcionario func1_9 = new funcionario(109, "Isabela Ribeiro", 123456789, 29, "Feminino");
        funcionario func1_10 = new funcionario(110, "Jorge Santos", 123456780, 30, "Masculino");

        // Adicionando funcionários à equipe 1
        equipe1.addfuncionario(func1_1);
        equipe1.addfuncionario(func1_2);
        equipe1.addfuncionario(func1_3);
        equipe1.addfuncionario(func1_4);
        equipe1.addfuncionario(func1_5);
        equipe1.addfuncionario(func1_6);
        equipe1.addfuncionario(func1_7);
        equipe1.addfuncionario(func1_8);
        equipe1.addfuncionario(func1_9);
        equipe1.addfuncionario(func1_10);
        // Criação dos funcionários para a equipe 2
        funcionario func2_1 = new funcionario(201, "Karen Borges", 223456781, 21, "Feminino");
        funcionario func2_2 = new funcionario(202, "Lucas Rocha", 223456782, 22, "Masculino");
        funcionario func2_3 = new funcionario(203, "Mariana Silva", 223456783, 23, "Feminino");
        funcionario func2_4 = new funcionario(204, "Nicolas Carvalho", 223456784, 24, "Masculino");
        funcionario func2_5 = new funcionario(205, "Olivia Ferreira", 223456785, 25, "Feminino");
        funcionario func2_6 = new funcionario(206, "Paulo Almeida", 223456786, 26, "Masculino");
        funcionario func2_7 = new funcionario(207, "Quênia Gomes", 223456787, 27, "Feminino");
        funcionario func2_8 = new funcionario(208, "Rafael Vieira", 223456788, 28, "Masculino");
        funcionario func2_9 = new funcionario(209, "Sofia Andrade", 223456789, 29, "Feminino");
        funcionario func2_10 = new funcionario(210, "Thiago Mendes", 223456780, 30, "Masculino");

        // Adicionando funcionários à equipe 2
        equipe2.addfuncionario(func2_1);
        equipe2.addfuncionario(func2_2);
        equipe2.addfuncionario(func2_3);
        equipe2.addfuncionario(func2_4);
        equipe2.addfuncionario(func2_5);
        equipe2.addfuncionario(func2_6);
        equipe2.addfuncionario(func2_7);
        equipe2.addfuncionario(func2_8);
        equipe2.addfuncionario(func2_9);
        equipe2.addfuncionario(func2_10);

        // Exibir informações das equipes
        System.out.println("Informações da Equipe 1:");
        equipe1.info();
        System.out.println();

        System.out.println("Informações da Equipe 2:");
        equipe2.info();
    }
}
