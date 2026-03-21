import java.util.Scanner;

public class DoisInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("digite o segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("os numeros sao iguais");
        } else if (num1 > num2) {
            System.out.println("o primeiro numero é maior");
        } else {
            System.out.println("o segundo numero é maior");
        }
    }
}

