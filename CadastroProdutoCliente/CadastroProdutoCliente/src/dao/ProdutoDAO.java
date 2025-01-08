package dao;

import domain.Cliente;
import domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO() {
        super();
        Map<Long, Produto> internMap = this.map.get(getClassType());
        if (internMap == null) {
            internMap = new HashMap<>();
            this.map.put(getClassType(), internMap);
        }
    }

    public Class<Produto> getClassType() {
        return Produto.class;
    }

    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }

    @Override
    public Boolean cadastrar(Produto entity) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Produto entity) {

    }

    @Override
    public Produto consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
