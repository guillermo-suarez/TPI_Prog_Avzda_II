package Modelo;

import java.util.*;

public class Lote
{
    private Integer numeroLote;
    private double superficie;
    private TipoSuelo tipoSuelo;
    private List<Proyecto> proyectos;

    public Lote(Integer numeroLote, double superficie, TipoSuelo tipoSuelo)
    {
        this.numeroLote = numeroLote;
        this.superficie = superficie;
        this.tipoSuelo = tipoSuelo;
        this.proyectos = new ArrayList<>();
    }

    public Integer getNumeroLote() 
    {
        return numeroLote;
    }
    public double getSuperficie() 
    {
        return superficie;
    }
    public TipoSuelo getTipoSuelo() 
    {
        return tipoSuelo;
    }
    public List<Proyecto> getProyectos() 
    {
        return proyectos;
    }
    public void setNumeroLote(Integer numeroLote) 
    {
        this.numeroLote = numeroLote;
    }
    public void setSuperficie(double superficie) 
    {
        this.superficie = superficie;
    }
    public void setTipoSuelo(TipoSuelo tipoSuelo) 
    {
        this.tipoSuelo = tipoSuelo;
    }
    public void setProyectos(List<Proyecto> proyectos) 
    {
        this.proyectos = proyectos;
    }
    
    public void addProyecto(Proyecto nuevoProyecto) 
    {
        this.proyectos.add(nuevoProyecto);
    }
}
