package exceptions;

public class NewClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException2 {
        try {
            ClienteDAO.consultarCliente(codigo);
        } catch (ClienteNaoEncontradoException e) {
           throw new ClienteNaoEncontradoException2(e.getMessage(), e);
        }
    }
}
