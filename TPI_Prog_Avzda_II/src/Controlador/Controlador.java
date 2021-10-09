package Controlador; //as

import java.util.*;
import Modelo.*;

public class Controlador
{
    private List<Campo> campos;
    private List<TipoSuelo> tiposSuelo;
    private List<EstadoProyecto> estadosProyecto;
    private List<EstadoCampo> estadosCampo;
    private List<Cultivo> cultivos;
    private List<Laboreo> laboreos;

    public Controlador()
    {
        this.campos = new ArrayList<>();
        this.tiposSuelo = new ArrayList<>();
        this.estadosProyecto = new ArrayList<>();
        this.estadosCampo = new ArrayList<>();
        this.cultivos = new ArrayList<>();
        this.laboreos = new ArrayList<>();
    }

    public void CrearCampo() {
        Integer nuevoNumeroCampo = 1;
        if(campos.size() > 0) {
            nuevoNumeroCampo = campos.get(campos.size() - 1).getNumeroCampo() + 1;
        }
        // Se asume que el primer EstadoCampo cargado es el default, por ahora.
        Campo nuevoCampo = new Campo(nuevoNumeroCampo, estadosCampo.get(0));
        this.campos.add(nuevoCampo);
    }

    public void CrearTipoSuelo(String descripcion)
    {
        Integer nuevoNumeroTipoSuelo = 1;
        if(tiposSuelo.size() > 0)
        {
            nuevoNumeroTipoSuelo = tiposSuelo.get(tiposSuelo.size() - 1).getNumeroTipo() + 1;
        }
        TipoSuelo nuevoTipoSuelo = new TipoSuelo(nuevoNumeroTipoSuelo, descripcion);
        this.tiposSuelo.add(nuevoTipoSuelo);
    }

    public void CrearEstadoProyecto(String descripcion)
    {
        Integer nuevoNumeroEstadoProyecto = 1;
        if(estadosProyecto.size() > 0)
        {
            nuevoNumeroEstadoProyecto = estadosProyecto.get(estadosProyecto.size() - 1).getNumeroEstado() + 1;
        }
        EstadoProyecto nuevoEstadoProyecto = new EstadoProyecto(nuevoNumeroEstadoProyecto, descripcion);
        this.estadosProyecto.add(nuevoEstadoProyecto);
    }
    public void CrearCultivo(String nombre)//vistadone
    {
        Integer nuevoNumeroCultivo = 1;
        if(cultivos.size() > 0)
        {
            nuevoNumeroCultivo = cultivos.get(cultivos.size() - 1).getNumeroCultivo() + 1;
        }
        Cultivo nuevoCultivo = new Cultivo(nuevoNumeroCultivo, nombre);
        this.cultivos.add(nuevoCultivo);
    }
    public void CrearLaboreo(String descripcion)//haciendovista
    {
        Integer nuevoNumeroLaboreo = 1;
        if(laboreos.size() > 0) {
            nuevoNumeroLaboreo = laboreos.get(laboreos.size() - 1).getNumeroLaboreo() + 1;
        }
        Laboreo nuevoLaboreo = new Laboreo(nuevoNumeroLaboreo, descripcion);
        this.laboreos.add(nuevoLaboreo);
    }
    
    /*public void CrearProyecto(Cultivo cultivo, Lote lote)
    {
        for (EstadoProyecto i: estadosProyecto)
        {
            if (i.getNumeroEstado().equals(0)) //El estado 0 equivale al estado nuevo. 
            {
                break;
            }
        }
        Integer numPro=0;
        for (Proyecto pro: lote.getProyectos())
        {
            if (numPro<pro.getNumeroProyecto())
            {
                numPro=pro.getNumeroProyecto();
            }
            else
            {
                break;
            }
        }
        
    } */
}
