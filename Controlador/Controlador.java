package Controlador;

import DAO.*;
import Modelo.*;
import java.util.*;

public class Controlador {
    private DAOPostgres DAO;
    private List<Estadocampo> estadosCampo = new ArrayList<>();
    private List<Estadoproyecto> estadosProyecto = new ArrayList<>();
    private List<Laboreo> laboreos = new ArrayList<>();
    private List<Cultivo> cultivos = new ArrayList<>();
    
    public Controlador(DAOPostgres DAO) {
        this.DAO = DAO;
        this.estadosCampo = DAO.recuperarTodos(Estadocampo.class);
        this.laboreos = DAO.recuperarTodos(Laboreo.class);
        this.cultivos = DAO.recuperarTodos(Cultivo.class);
        
    }
    
    public void agregarObjeto(Object objeto) {
        this.DAO.agregarObjeto(objeto);
    }
    
    public void borrarObjeto(Object objeto) {
        this.DAO.borrarObjeto(objeto);
    }
    
    public void actualizarObjeto(Object objeto) {
        this.DAO.actualizarObjeto(objeto);
    }

    public List<Estadocampo> getEstadosCampo() {
        this.estadosCampo = DAO.recuperarTodos(Estadocampo.class);
        return estadosCampo;
    }
    
    public List<Estadoproyecto> getEstadosProyecto() {
        this.estadosProyecto = DAO.recuperarTodos(Estadoproyecto.class);
        return estadosProyecto;
    }
    
    public List<Laboreo> getLaboreos() {
        this.laboreos = DAO.recuperarTodos(Laboreo.class);
        return laboreos;
    }
    
    public List<Cultivo> getCultivos() {
        this.cultivos = DAO.recuperarTodos(Cultivo.class);
        return cultivos;
    }
}
