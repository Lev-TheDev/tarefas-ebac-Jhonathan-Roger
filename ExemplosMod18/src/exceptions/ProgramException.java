package exceptions;

import javax.swing.*;
import java.util.Scanner;

public class ProgramException {

    public static void main(String[] args) {
        String opcao = JOptionPane.showInputDialog(null, "Digite o código do cliente: ", "título", JOptionPane.INFORMATION_MESSAGE);

        try {
            NewClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoException2 e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
        }

        /*try {
            NewClienteService.consultarCliente(opcao);
        } catch (ClienteNaoEncontradoException2 e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair", JOptionPane.INFORMATION_MESSAGE);
        }*/
    }
}
