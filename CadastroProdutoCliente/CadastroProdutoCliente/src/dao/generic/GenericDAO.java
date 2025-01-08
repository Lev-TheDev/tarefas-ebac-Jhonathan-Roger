package dao.generic;

import domain.Persistencia;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class GenericDAO<T extends Persistencia> implements IGenericDAO<T>{

    protected Map<Class, Map<Long, T>> map;

    public abstract Class<T> getClassType();

    public abstract void atualizarDados(T entity, T entityCadastrado);

    public GenericDAO() {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        if (internMap.containsKey(entity.getCodigo())) {
            return false;
        } else {
            internMap.put(entity.getCodigo(), entity);
            return true;
        }
    }

    @Override
    public void excluir(Long valor) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T objCadastrado = internMap.get(valor);
        if (objCadastrado != null) {
            this.map.remove(objCadastrado, valor);
        }
    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> internMap = this.map.get(getClassType());
        T objCadastrado = internMap.get(entity.getCodigo());
        if (objCadastrado != null) {
            atualizarDados(entity, objCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> internMap = this.map.get(getClassType());
        return internMap.values();
    }
}
