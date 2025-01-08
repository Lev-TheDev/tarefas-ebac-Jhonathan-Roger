package dao;

import dao.generic.IGenericDAO;
import domain.Cliente;
import java.util.Collection;

public interface IClienteDAO extends IGenericDAO<Cliente> {
    Class<Cliente> getClassType();

    void excluir(Long cpf);

    void atualizarDados(Cliente cliente, Cliente entityCadastrado);
}

