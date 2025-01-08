import javax.swing.*;

import dao.ClienteSetDAO;
import domain.Cliente;
import dao.IClienteDAO;
import dao.ClienteMapDAO;
import domain.Persistencia;


public class App {
    //Meu primeiro Projeto

    private static IClienteDAO iClienteDAO;

    public static void main(String args []) {
        iClienteDAO = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Seja bem vindo(a)!" + "\n\nDigite 1 para CADASTRAR, 2 para CONSULTAR, 3 para EXCLUIR, 4 para ALTERAR ou 5 para SAIR:",
                "Programa Cadastro de Cliente - NW Soluções em T.I.", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Lamento. Opção inválida!" + "\n\nDigite 1 para CADASTRAR, 2 para CONSULTAR, 3 para EXCLUIR, 4 para ALTERAR ou 5 para SAIR:",
                    "Programa Cadastro de Cliente - NW Soluções em T.I.", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do(a) cliente separados por vírgula, conforme indicado abaixo:" + "\n\nNome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastrando novo(a) cliente...", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite a seguir o CPF do(a) cliente para realizar a consulta: ",
                        "Consultando cliente...", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite a seguir o CPF do(a) cliente que deseja excluir: ",
                        "Excluindo cliente...", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Para atualizar os dados do(a) cliente digite-os no campo correspondente, separados por vírgula, conforme indicado abaixo:" + "\n\nNome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Atualizando cliente...", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Olá, novamente!" + "\n\nDigite 1 para CADASTRAR, 2 para CONSULTAR, 3 para EXCLUIR, 4 para ALTERAR ou 5 para SAIR:",
                    "Programa Cadastro de Cliente - NW Soluções em T.I.", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void excluir(String dados) {
        String elementoCPF = dados;
        if (!(elementoCPF.length() != 11) && !(elementoCPF.matches("\\d+"))) {
            JOptionPane.showMessageDialog(null, "Procedimento não realizado!" + "\n\nExclusão não realizada devido ao campo CPF NÃO ter sido preenchido com todos os dígitos corretamente!", "EXCLUSÃO DE CLIENTE - ERRO 409",JOptionPane.INFORMATION_MESSAGE);
        } else {
            iClienteDAO.excluir(Long.parseLong(dados));
            JOptionPane.showMessageDialog(null, "Procedimento finalizado!" + "\n\nCliente excluído(a) com sucesso.", "EXCLUSÃO DE CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        // validar se foi passado somente digitos do cpf.
        String elementoCPF = dados;
        if ((elementoCPF.length() == 11) && (elementoCPF.matches("\\d+"))) {
            Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Procedimento finalizado!" + "\n\nCliente encontrado(a):  " + cliente.toString(), "CONSULTA DE CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Procedimento finalizado!" + "\n\nLamento. Cliente não encontrado(a)!", "CONSULTA DE CLIENTE - ERRO 407", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Procedimento não realizado!" + "\n\nConsulta não realizada devido ao campo CPF NÃO ter sido preenchido com todos os dígitos corretamente!", "CONSULTA DE CLIENTE - ERRO 409",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        //Tentar validar se todos os campos estão preenchidos.
        //Se não tiver, passar null no construtor onde o valor é nulo
        //Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],null,dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6])
        //
        // EU O FIZ ATRAVÉS DO .LENGTH, CONFERINDO INCLUSIVE OS 11 DÍGITOS DO CPF E SE FORAM PASSADOS SOMENTE NÚMEROS.

        String elementoCPF = dadosSeparados[1];
        if (dadosSeparados.length != 7 || elementoCPF.length() != 11 || !(elementoCPF.matches("\\d+"))) {
            JOptionPane.showMessageDialog(null, "Procedimento não realizado!" + "\n\nCadastro não realizado devido a um ou mais dos 7 (sete) campos NÃO terem sido preenchidos corretamente!", "CADASTRO DE CLIENTE - ERRO 409",JOptionPane.INFORMATION_MESSAGE);
        } else {
            Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);

            Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
            if (isCadastrado) {
                JOptionPane.showMessageDialog(null, "Procedimento finalizado!" + "\n\nCliente cadastrado(a) com sucesso!", "CADASTRO DE CLIENTE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "ERRO!" + "\n\nATENÇÃO! Cliente já se encontra cadastrado(a).", "CADASTRO DE CLIENTE - ERRO 408", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private static boolean isCadastro (String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            clientesCadastrados += cliente.toString() + "\n";
        }
        if (clientesCadastrados != "") {
            JOptionPane.showMessageDialog(null, "Cliente(s) cadastrado(s): \n" + clientesCadastrados + "\nObrigado por escolher a NW Soluções em T.I." + "\n\nAté logo!", "Saindo...", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Obrigado por escolher a NW Soluções em T.I." + "\n\nAté logo!", "Saindo...", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
