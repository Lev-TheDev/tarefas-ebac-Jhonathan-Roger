package dao.generic;

import domain.Persistencia;

import java.util.Collection;

public interface IGenericDAO <T extends Persistencia>{

    public Boolean cadastrar(T entity);

    public void excluir(Long valor);

    public void alterar(T entity);

    public T consultar(Long valor);

    public Collection<T> buscarTodos();
}
