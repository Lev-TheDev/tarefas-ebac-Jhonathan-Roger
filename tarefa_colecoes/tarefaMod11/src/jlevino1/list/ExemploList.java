package jlevino1.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String [] args) {
        listaAlfabetica();
    }

    private static void listaAlfabetica() {
        System.out.println("=======================================");
        System.out.println("  Exemplo Lista com Ordem Alfabética");
        System.out.println("=======================================");

        List<String> lista = new ArrayList<>();
        lista.add("Isabella Lima");
        lista.add("Germano Caires");
        lista.add("Fernanda Cavalcante");
        lista.add("Caio Camioli");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
