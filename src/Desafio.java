import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "joji";
        String tipoConta = "corrente";
        double saldo = 10500;
        int opcao = 0;

        System.out.println("\nnome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("saldo atual: " + saldo);

        String menu = """
                ** digite sua opcao **
                1. consultar valor
                2. transferir valor
                3. receber valor
                4. sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        }
    }
}