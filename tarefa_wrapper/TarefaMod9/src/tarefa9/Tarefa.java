package tarefa9;

/**
 * @author rogerlevino
 */
public class Tarefa {

    public static void main(String args[]) {
        System.out.println("===========================");
        int numeroInscricao = 944950;
        System.out.println(numeroInscricao);
        System.out.println("===========================");
        /*long numeroInscricaol = (long) numeroInscricao;
        System.out.println(numeroInscricaol);
        System.out.println("===========================");*/

        /**
         * Procedimento de Boxing (auto-boxing)
         */
        Integer numeroInscricaoI = 944950;
        System.out.println(numeroInscricaoI);
        System.out.println(((Object)numeroInscricaoI).getClass().getSimpleName());
        System.out.println("===========================");

    }
}
