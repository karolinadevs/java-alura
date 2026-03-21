import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        while (nota != -1) {
            System.out.println("diga sua avaliacao para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("media de avaliacoes " + mediaAvaliacao);
    }
}