package Modelo;

public class Laboreo {
    private Integer numeroLaboreo;
    private String descripcion;

    public Laboreo(Integer numeroLaboreo, String descripcion)
    {
        this.numeroLaboreo = numeroLaboreo;
        this.descripcion = descripcion;
    }

    public Integer getNumeroLaboreo() 
    {
        return numeroLaboreo;
    }
    public String getDescripcion() 
    {
        return descripcion;
    }
    public void setNumeroLaboreo(Integer numeroLaboreo) 
    {
        this.numeroLaboreo = numeroLaboreo;
    }
    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }
}
