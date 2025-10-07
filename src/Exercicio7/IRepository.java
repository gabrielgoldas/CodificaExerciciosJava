package Exercicio7;

import java.util.List;
import java.util.Optional;

public interface IRepository<T extends Identificavel<ID>, ID> {
    void salvar(T entidade);
    Optional<T> getById(ID id);
    List<T> getAll();
    void delete(ID id);
}
