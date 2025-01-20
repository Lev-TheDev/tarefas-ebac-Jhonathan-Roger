package exceptions;

public class Conta {
    public static void saque(double valor) throws LimiteSaqueException {
        if (valor > 400) {
            LimiteSaqueException erro = new LimiteSaqueException("Valor maior que limite diário!");
            throw erro;
        } else {
            System.out.println("Valor retirado da conta: R$" + valor);
       }
    }

    public static void saqueRuntimeException(double valor) {
        if (valor > 400) {
            IllegalArgumentException erro = new IllegalArgumentException("Valor maior que limite diário!");
            throw erro;
        } else {
            System.out.println("Valor retirado da conta: R$" + valor);
        }
    }
}
