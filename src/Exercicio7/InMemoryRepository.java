package Exercicio7;

import java.util.*;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements IRepository<T,ID>{
    private Map<ID, T> repositorio = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        repositorio.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> getById(ID id) {
        return Optional.ofNullable(repositorio.get(id));
    }

    @Override
    public List<T> getAll() {
        return Collections.unmodifiableList(new ArrayList<>(repositorio.values()));
    }

    @Override
    public void delete(ID id) {
        repositorio.remove(id);
    }
}
