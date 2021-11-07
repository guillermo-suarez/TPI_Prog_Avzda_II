package DAO;

import java.util.List;

public interface InterfazDAO {
    public void abrirSesion();
    public void cerrarSesion();
    public List recuperarTodos(Class clase);
}
