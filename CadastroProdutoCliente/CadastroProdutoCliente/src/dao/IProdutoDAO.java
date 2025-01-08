package dao;

import dao.generic.IGenericDAO;
import domain.Produto;

import java.util.Collection;

public interface IProdutoDAO extends IGenericDAO<Produto> {
    void excluir(Long cpf);

}
