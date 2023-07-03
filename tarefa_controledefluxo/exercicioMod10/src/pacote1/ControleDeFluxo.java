package pacote1;

import java.util.Scanner;

public class ControleDeFluxo {

    public  static  void  main(String [] args) {

        System.out.println("==============================================");
        System.out.println("\t Programa Cálculo de Notas - Lev_TheDev");
        System.out.println("==============================================");
        String alunoSituacao = getSituacao();
        System.out.println(alunoSituacao);
        System.out.println("==============================================");

    }

    public static String getSituacao() {
        Scanner s = new Scanner(System.in);
        double notaMedia = 0;
        String result;

        System.out.println("Iniciando cadastro de notas bimestrais... ");
        System.out.println("==============================================");

        int contador = 1;
        while (contador <= 4) {
            System.out.println("Digite a nota " + contador + ":");
            double nota = s.nextInt();
            notaMedia = notaMedia + (nota / 4);
            contador++;
        }

        System.out.println("==============================================");

        if (notaMedia >= 7) {
            result = "O aluno está aprovado!";
        } else if (notaMedia >= 5 && notaMedia < 7) {
            result = "O aluno está em recuperação!";
        } else {
            result = "O aluno está reprovado!";
        }

        return result;
    }
}
