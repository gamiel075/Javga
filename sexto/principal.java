package sexto;

public class principal {
    public static void main(String[] args) {
        serviço servico1 = new serviço(1, "Concluído", "2023-06-15");
        servico1.tipo = "Manutenção";
        servico1.status = "Concluído";
        servico1.tempoEmHoras = 10;
        servico1.contratante = "Google";

        serviço servico2 = new serviço(2, "Em andamento", "2023-06-20");
        servico2.tipo = "Instalação";
        servico2.status = "Em andamento";
        servico2.tempoEmHoras = 15;
        servico2.contratante = "Microsoft";

        serviço servico3 = new serviço(3, "Pendente", "2023-06-25");
        servico3.tipo = "Consultoria";
        servico3.status = "Pendente";
        servico3.tempoEmHoras = 5;
        servico3.contratante = "Amazon";

        servico1.imprimir();
        System.out.println("-------------------------------------------------------------------------------");
        servico2.imprimir();
        System.out.println("-------------------------------------------------------------------------------");
        servico3.imprimir();

        serviçoDigital servicoDigital1 = new serviçoDigital(4, "Concluído", "2023-06-15", "Desenvolvimento de Website", 100.0f, "http://example.com/website1");;
        servicoDigital1.tipo = "Desenvolvimento";
        servicoDigital1.status = "Concluído";
        servicoDigital1.tempoEmHoras = 20;
        servicoDigital1.contratante = "Apple";

        serviçoDigital servicoDigital2 = new serviçoDigital(5, "Em andamento", "2023-06-20", "Manutenção de Servidor", 50.0f, "http://example.com/server2");
        servicoDigital2.tipo = "Manutenção";
        servicoDigital2.status = "Em andamento";
        servicoDigital2.tempoEmHoras = 30;
        servicoDigital2.contratante = "Facebook";

        serviçoDigital servicoDigital3 = new serviçoDigital(6, "Pendente", "2023-06-25", "Consultoria de SEO", 200.0f, "http://example.com/seo3");
        servicoDigital3.tipo = "Consultoria";
        servicoDigital3.status = "Pendente";
        servicoDigital3.tempoEmHoras = 15;
        servicoDigital3.contratante = "Tesla";


        System.out.println("-------------------------------------------------------------------------------");
        servicoDigital1.imprimirSD();
        System.out.println("-------------------------------------------------------------------------------");
        servicoDigital2.imprimirSD();
        System.out.println("-------------------------------------------------------------------------------");
        servicoDigital3.imprimirSD();


        


    }

    
}