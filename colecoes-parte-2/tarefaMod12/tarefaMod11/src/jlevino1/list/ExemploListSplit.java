package jlevino1.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class ExemploListSplit {

    public static void main(String[] args) {
        listaSplit();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome-sexo e separe o próximo nome-sexo por vírgula, sem espaços (Ex.: Caio-M,Amanda-F): ");
        String listagemT = scanner.nextLine();
        //nextLine() aceita espaços, next() não

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        // Usar o método split para dividir a listagemT nas vírgulas, armazenando na variável pessoas
        // método trim remove espaços em branco no início e final da divisão
        // toUpperCase é similar ao IgnoreCase, mas age conforme a tradução do método, e vai servir para não precisar usar o IgnoreCase na seção de baixo
        String[] pessoas = listagemT.split(",");
        for (String pessoaSexo : pessoas) {
            String[] nomeSexoSplit = pessoaSexo.split("-");
            String nome = nomeSexoSplit[0].trim();
            String sexo = nomeSexoSplit[1].trim().toUpperCase();

            if (sexo.equals("M")) {
                homens.add(nome);
            } else if (sexo.equals("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("=======================================");
                System.out.println("****** ALERTA!!! ******");
                System.out.println("Erro 401-Digitação de sexo inválida para o nome: " + nome);
                System.out.println("****** ALERTA!!! ******");
            }
        }

        // ordenar em alfabética
        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("=======================================");
        System.out.println("Lista para o grupo MASCULINO: " + homens);
        System.out.println("Lista para o grupo FEMININO: " + mulheres);
        System.out.println("=======================================");

        scanner.close();
    }

    private static void listaSplit() {
        System.out.println("=======================================");
        System.out.println("  Exemplo Lista com SPLIT");
        System.out.println("=======================================");

    }
}

