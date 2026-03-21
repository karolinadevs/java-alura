import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.println("digite um numero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("parabens,voce acertou o numero em " + tentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("o numero digitado é menor que o numero gerado.");
            } else {
                System.out.println("o numero digitado é maior que o numero gerado");
            }
        }
        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("voce nao conseguiu acertar o numero em 5 tentativas. o numero era: " + numeroGerado);
        }
    }
}