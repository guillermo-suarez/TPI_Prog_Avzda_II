package Modelo;

import java.time.LocalDate;

public class LaboreoProyecto
{
    private Laboreo laboreo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    public LaboreoProyecto(Laboreo laboreo, LocalDate fechaInicio)
    {
        this.laboreo = laboreo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = null;
    }

    public Laboreo getLaboreo() {
        return laboreo;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setLaboreo(Laboreo laboreo) {
        this.laboreo = laboreo;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
