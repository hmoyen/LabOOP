public class Exemplo {
    public static void main(String[] args) throws Exception {
        Endereco daAna = new Endereco("Rua Barão do Bananal", 19, "casa 2", "06786798", "Rio de Janeiro", "RJ",
                "Brasil");
        Endereco show = new Endereco("Rua do Allianz", 18, "Estadio do Palmeiras", "383397", "São Paulo", "SP",
                "Brasil");
        Cliente ana = new Cliente(467866545, 18, "Ana Julia Freitas", daAna, "anafreitas@gmail.com", 1194567658, 1, 1); // Cliente
                                                                                                                        // assiduo
                                                                                                                        // com
                                                                                                                        // mensalidade
                                                                                                                        // paga

        Evento eventoAna = new Evento(123, "Show do Justin Bieber", "2/3/2023 18:00", show, 15000, 12, 400, 0);
        IdentificadorDeIngresso idAna = new IdentificadorDeIngresso(ana, eventoAna, 389);
        Ingresso ingressoAna = new Ingresso(idAna, 0);
        Data data = new Data(2, 30);

        Venda vendaParaAna = new Venda(eventoAna, ingressoAna, data);
        System.out.println(ana.toString());
        System.out.println(ingressoAna.toString());
        System.out.println(vendaParaAna.toString());

    }
}
