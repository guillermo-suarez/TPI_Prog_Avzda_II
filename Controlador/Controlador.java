package Controlador;

import DAO.*;
import Modelo.*;
import java.util.*;

public class Controlador {
    private DAOPostgres DAO;
    private List<Estadocampo> estadosCampo = new ArrayList<>();
    
    public Controlador(DAOPostgres DAO) {
        this.DAO = DAO;
        this.estadosCampo = DAO.recuperarTodos(Estadocampo.class);
    }
    
    public void agregarObjeto(Object objeto) {
        this.DAO.agregarObjeto(objeto);
    }

    public List<Estadocampo> getEstadosCampo() {
        this.estadosCampo = DAO.recuperarTodos(Estadocampo.class);
        return estadosCampo;
    }
}
