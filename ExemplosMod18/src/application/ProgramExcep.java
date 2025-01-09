package application;

public class ProgramExcep {

    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Erro, frase nula.");
            frase = "Olá, Mundo!";
            novaFrase = frase.toUpperCase();
        }
        System.out.println(frase);
        System.out.println(novaFrase);

        /*try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Erro, frase nula.");
            frase = "Olá, Mundo!";
        } finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println(frase);
        System.out.println(novaFrase);*/
    }
}
