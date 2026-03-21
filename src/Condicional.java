public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2020) {
            System.out.println("lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        } else {
            System.out.println("pagar alocação");
        }
    }
}
