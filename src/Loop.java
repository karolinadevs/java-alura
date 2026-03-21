import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("diga sua avaliacao para o filme de 1 a 10: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("media de avaliacoes " + mediaAvaliacao);
    }
}
