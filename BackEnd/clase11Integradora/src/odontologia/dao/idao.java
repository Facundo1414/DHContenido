package odontologia.dao;

import java.util.List;

public interface idao <T> {
    T guardar(T t);
    T buscar (Long id);
    void buscarTodos ();
    void eliminar(Long id);
}
