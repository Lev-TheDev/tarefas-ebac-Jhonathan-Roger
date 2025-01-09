package application;

import annotations.Cliente;
import annotations.Tabela;

public class Program {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ayrton", 02198745630d);

        Class<?> clienteClass = cliente.getClass();
        Tabela tabelaAnnotation = clienteClass.getAnnotation(Tabela.class);

        System.out.println("O nome da tabela é: " + tabelaAnnotation.value());
    }
}