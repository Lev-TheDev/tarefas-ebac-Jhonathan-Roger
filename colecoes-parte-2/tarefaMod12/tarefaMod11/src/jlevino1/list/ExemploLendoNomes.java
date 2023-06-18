package jlevino1.list;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ExemploLendoNomes {
    public static void main(String [] args) {
        lerNomes();
    }

    private static void lerNomes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("  Olá! Digite os nomes da lista seguidos de barra /, sem espaço: ");
        System.out.println("===========================================================");
        String nomes = scanner.next();

        List<String> list1 = Arrays.asList(nomes.split("/"));
        Collections.sort(list1);
        System.out.println(list1);

    }
}
