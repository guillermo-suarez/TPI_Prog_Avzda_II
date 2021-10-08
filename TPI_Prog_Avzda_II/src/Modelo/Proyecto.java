package Modelo;

import java.util.*;

public class Proyecto
{
    private Integer numeroProyecto;
    private EstadoProyecto estado;
    private Cultivo cultivo;
    private List<LaboreoProyecto> laboreos;

    public Proyecto(Integer numeroProyecto, EstadoProyecto estado, Cultivo cultivo)
    {
        this.numeroProyecto = numeroProyecto;
        this.estado = estado;
        this.cultivo = cultivo;
        this.laboreos = new ArrayList<>();
    }

    public Integer getNumeroProyecto()
    {
        return numeroProyecto;
    }
    public EstadoProyecto getEstado()
    {
        return estado;
    }
    public Cultivo getCultivo()
    {
        return cultivo;
    }
    public List<LaboreoProyecto> getLaboreos()
    {
        return laboreos;
    }

    public void setNumeroProyecto(Integer numeroProyecto)
    {
        this.numeroProyecto = numeroProyecto;
    }
    public void setEstado(EstadoProyecto estado)
    {
        this.estado = estado;
    }
    public void setCultivo(Cultivo cultivo)
    {
        this.cultivo = cultivo;
    }
    public void setLaboreos(List<LaboreoProyecto> laboreos)
    {
        this.laboreos = laboreos;
    }

    public void addLaboreo(LaboreoProyecto nuevoLaboreoProyecto)
    {
        this.laboreos.add(nuevoLaboreoProyecto);
    }
}
