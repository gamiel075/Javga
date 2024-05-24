package quarto;

public class principal {
    public static void main(String[] args) {
        // Criação dos líderes
        lider lider1 = new lider(1, "João", "Engenharia");
        lider lider2 = new lider(2, "Ana", "Administração");

        // Criação das equipes
        Equipe equipe1 = new Equipe("Manhã", lider1);
        Equipe equipe2 = new Equipe("Tarde", lider2);

        // Criação dos funcionários para a equipe 1
        funcionario func1_1 = new funcionario(101, "Funcionario1", 123456781, 21, "Masculino");
        funcionario func1_2 = new funcionario(102, "Funcionario2", 123456782, 22, "Feminino");
        funcionario func1_3 = new funcionario(103, "Funcionario3", 123456783, 23, "Masculino");
        funcionario func1_4 = new funcionario(104, "Funcionario4", 123456784, 24, "Feminino");
        funcionario func1_5 = new funcionario(105, "Funcionario5", 123456785, 25, "Masculino");
        funcionario func1_6 = new funcionario(106, "Funcionario6", 123456786, 26, "Feminino");
        funcionario func1_7 = new funcionario(107, "Funcionario7", 123456787, 27, "Masculino");
        funcionario func1_8 = new funcionario(108, "Funcionario8", 123456788, 28, "Feminino");
        funcionario func1_9 = new funcionario(109, "Funcionario9", 123456789, 29, "Masculino");
        funcionario func1_10 = new funcionario(110, "Funcionario10", 123456780, 30, "Feminino");

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
    }
}
