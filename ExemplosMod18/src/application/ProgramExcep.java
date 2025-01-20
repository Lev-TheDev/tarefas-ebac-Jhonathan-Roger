package application;

public class ProgramExcep {

    public static void main(String[] args) {
        //semTratamentoException();
        //comTratamentoException();
        lancarRuntimeException();
        System.out.println("Teste2");

    }

    private static void semTratamentoException() {
        String frase = null;
        String novaFrase = null;
        novaFrase = frase.toUpperCase();
        System.out.println(frase);
        System.out.println(novaFrase);
    }

    private static void comTratamentoException() {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Erro, frase nula.");
            frase = "Olá, Mundo!";
        } finally {
            novaFrase = frase.toUpperCase();
        }
        System.out.println(frase);
        System.out.println(novaFrase);
    }

    private static void lancarRuntimeException() {
        try {
            String frase = null;
            String novaFrase = null;
            novaFrase = frase.toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException("Parando o sistema...");
        }
        System.out.println("Teste");
    }
}
