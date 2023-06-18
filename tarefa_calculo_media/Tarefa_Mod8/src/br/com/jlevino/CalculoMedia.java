package br.com.jlevino;

public class CalculoMedia {

    public static void main(String args[]) {
        textoInicial();
        operacoesMedia();

    }

    private static void textoInicial() {
        System.out.println("=========================================");
        System.out.println("\t PROGRAMA: CALCULADORA DE MÉDIAS");
        System.out.println("=========================================");
        System.out.println("Olá, professor!");
        System.out.println("Vamos calcular a média das 4 notas?");
        System.out.println("Aguarde um minuto...");
        System.out.println("=========================================");
        System.out.println("Pronto!");
        System.out.print("A média das 4 notas é: ");

    }

    public static void operacoesMedia() {
        float nota1 = 7.5f;
        float nota2 = 8.0f;
        float nota3 = 9.5f;
        float nota4 = 10.0f;

        float resultadoOp = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(resultadoOp);
        System.out.println("=========================================");
    }
}
