package exceptions;

public class AppExemploThrow {
    public static void main(String[] args) {
        exception();
        /*try {
            exception();
        } catch (LimiteSaqueException e){
            System.out.println("ERRO: " + e.getMessage());
        }

         Dessa forma eu precisaria tratar a exceção aqui, pois é o main que chama a exception.*/

        runtimeException();

    }

    private static void exception() {
        //private static void exception() throws LimiteSaqueException{
        // aí eu estou falando "quem chamar este método deve tratá-lo"
        try {
            Conta.saque(500);
        } catch (LimiteSaqueException e){
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            System.out.println("Fechando conexão com banco de dados...");
        }
            //Conta.saque(500);
    }

    private static void runtimeException() {
        Conta.saqueRuntimeException(500);
    }
}
