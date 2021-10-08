package Modelo;

public class TipoSuelo 
{
    private Integer numeroTipo;
    private String descripcion;

    public String getDescripcion() 
    {
        return descripcion;
    }
    public Integer getNumeroTipo() 
    {
        return numeroTipo;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    public void setNumeroTipo(Integer numeroTipo) 
    {
        this.numeroTipo = numeroTipo;
    }

    public TipoSuelo(Integer numeroTipo, String descripcion)
    {
        this.descripcion = descripcion;
        this.numeroTipo = numeroTipo;
    }
    
}