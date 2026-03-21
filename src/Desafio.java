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

            if (opcao == 1) {
                System.out.println("o saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("qual o valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("não saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("novo saldo " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("novo saldo " + saldo);
            } else if (opcao != 4) {
                System.out.println("opcao invalida");
            }
        }
    }
}