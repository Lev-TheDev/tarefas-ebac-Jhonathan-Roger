package br.com.jlev.singleton;

public class DemoSingletonPropriedade {

    public static void main(String args[]) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singleton1 = SingletonPropriedade.getInstance("Teste 111");

        System.out.println(singleton.getValue());
        System.out.println(singleton1.getValue());

    }
}
