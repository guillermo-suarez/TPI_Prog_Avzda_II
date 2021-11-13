package Controlador;

import DAO.*;
import Modelo.*;
import java.util.*;

public class Controlador {
    private DAOPostgres DAO;
    private List<Campo> campos = new ArrayList<>();
    private List<Tiposuelo> tiposSuelo = new ArrayList<>();
    private List<Estadocampo> estadosCampo = new ArrayList<>();
    private List<Estadoproyecto> estadosProyecto = new ArrayList<>();
    private List<Laboreo> laboreos = new ArrayList<>();
    private List<Cultivo> cultivos = new ArrayList<>();
    
    public Controlador(DAOPostgres DAO) {
        this.DAO = DAO;
        this.campos = DAO.recuperarTodos(Campo.class);
        this.tiposSuelo = DAO.recuperarTodos(Tiposuelo.class);
        this.estadosCampo = DAO.recuperarTodos(Estadocampo.class);
        this.estadosProyecto = DAO.recuperarTodos(Estadoproyecto.class);
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
    
    public List<Campo> getCampos() {
        this.campos = DAO.recuperarTodos(Campo.class);
        return campos;
    }
    
    public List<Tiposuelo> getTiposSuelo() {
        this.tiposSuelo = DAO.recuperarTodos(Tiposuelo.class);
        return tiposSuelo;
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
