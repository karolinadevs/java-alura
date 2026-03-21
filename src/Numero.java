import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("esse numero é positivo");
        } else {
            System.out.println("esse numero é negativo");
        }
    }
}