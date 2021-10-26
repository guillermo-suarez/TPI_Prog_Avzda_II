package Modelo;

import java.util.*;

public class Cultivo
{
    private Integer numeroCultivo;
    private String nombreCultivo;
    private List<LaboreoCultivo> laboreos;
    private List<TipoSuelo> tipoSuelos;

    public String getNombreCultivo() 
    {
        return nombreCultivo;
    }
    public Integer getNumeroCultivo() 
    {
        return numeroCultivo;
    }
    public void setNombreCultivo(String nombreCultivo) 
    {
        this.nombreCultivo = nombreCultivo;
    }
    public void setNumeroCultivo(Integer numeroCultivo) 
    {
        this.numeroCultivo = numeroCultivo;
    }
    public void setLaboreos(List<LaboreoCultivo> laboreos) 
    {
        this.laboreos = laboreos;
    }
    public List<LaboreoCultivo> getLaboreos() 
    {
        return laboreos;
    }
    public List<TipoSuelo> getTipoSuelos() 
    {
        return tipoSuelos;
    }
    public void setTipoSuelos(List<TipoSuelo> tipoSuelos) 
    {
        this.tipoSuelos = tipoSuelos;
    }
    public void addTipoSuelo(TipoSuelo tipoSuelo)
    {
        this.tipoSuelos.add(tipoSuelo);
    }
    public void addLaboreo(LaboreoCultivo laboreo)
    {
        this.laboreos.add(laboreo);
    }

    public Cultivo(Integer numeroCultivo, String nombreCultivo)
    {
        this.numeroCultivo = numeroCultivo;
        this.nombreCultivo = nombreCultivo;
        this.laboreos = new ArrayList<>();
        this.tipoSuelos = new ArrayList<>();
    }

}