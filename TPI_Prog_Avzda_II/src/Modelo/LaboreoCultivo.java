package Modelo;

public class LaboreoCultivo
{
    private Integer orden;
    private Laboreo laboreo;

    public LaboreoCultivo(Integer orden, Laboreo laboreo)
    {
        this.orden = orden;
        this.laboreo = laboreo;
    }
    
    public Integer getOrden() 
    {
        return orden;
    }
    public void setOrden(Integer orden) 
    {
        this.orden = orden;
    }
    public Laboreo getLaboreo() 
    {
        return laboreo;
    }
    public void setLaboreo(Laboreo laboreo) 
    {
        this.laboreo = laboreo;
    }
}