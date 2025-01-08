package dao;

import dao.generic.GenericDAO;
import domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {

    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

    @Override
    public Boolean cadastrar(Cliente entity) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente entity) {

    }

    @Override
    public Cliente consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());
    }

    public ClienteMapDAO() {
        super();
        Map<Long, Cliente> internMap = this.map.get(getClassType());
        if (internMap == null) {
            internMap = new HashMap<>();
            this.map.put(getClassType(), internMap);
        }
    }
}

    /*private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new TreeMap<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        } else {
            map.put(cliente.getCpf(), cliente);
            return true;
        }
    }

    @Override
    public Cliente excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);

        if (clienteCadastrado != null) {
            map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
        }
        return clienteCadastrado;
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }*/

