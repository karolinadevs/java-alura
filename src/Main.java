public class Main {
    public static void main(String[] args) {
        System.out.println("esse é o screen match.");
        System.out.println("filme: toy story 2");

        int anoDeLancamento = 1999;
        System.out.println("ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //media calculada pelas 2 notas da na e do leo
        double media = (10.0 + 10.0)/2;
        System.out.println(media);
        String sinopse;
        String sinopse2;
        sinopse = "filme de ação que retrata a vida de brinquedos que criam vida própria";
        System.out.println(sinopse);
        //text blocks
        sinopse2 = """
                
                toy story 2
                filme de ação que retrata a vida de brinquedos que criam vida própria
                muito bom!
                ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse2);

        //casting (conversao de tipos
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}



