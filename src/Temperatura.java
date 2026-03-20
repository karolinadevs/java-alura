public class Temperatura {
    public static void main(String [] args){
        double celsius = 23.1;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("a temperatura de %.1f celsius é equivalente a %.1f fahrenheit", celsius, fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteira = (int) fahrenheit;
        System.out.println("a temperatura de fahrenheit inteira é: " + fahrenheitInteira);
    }
}
