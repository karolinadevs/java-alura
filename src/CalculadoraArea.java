import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----menu-----");
            System.out.println("1. calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. sair");
            System.out.print("escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("area do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("area do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("programa encerrado");
            } else {
                System.out.println("opção invalida. tente novamente.");
            }
        }
    }
}