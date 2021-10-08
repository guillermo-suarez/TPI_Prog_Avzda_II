package Modelo;

public abstract class Estado
{
    private Integer numeroEstado;
    private String descripcion;

    
    public Estado(Integer numeroEstado, String descripcion)
    {
        this.descripcion=descripcion;
        this.numeroEstado=numeroEstado;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }
    public Integer getNumeroEstado() 
    {
        return numeroEstado;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
    public void setNumeroEstado(Integer numeroEstado) 
    {
        this.numeroEstado = numeroEstado;
    }
}