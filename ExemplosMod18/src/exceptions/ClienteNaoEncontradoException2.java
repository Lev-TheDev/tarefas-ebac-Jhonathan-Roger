package exceptions;

public class ClienteNaoEncontradoException2 extends Exception{
    private Exception ex;

    public ClienteNaoEncontradoException2(String msg, Throwable e) {

        super(msg, e);
    }
}
