package Dao;

import java.util.List;

public interface GenericDAO<T, ID> {
    void guardar(T entidad);
    T buscarPorId(ID id);
    List<T> listarTodos();
    void actualizar(T entidad);
    void eliminar(ID id);
}
