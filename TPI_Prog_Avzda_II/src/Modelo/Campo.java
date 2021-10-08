package Modelo;

import java.util.*;

public class Campo 
{
    private Integer numeroCampo;
    private EstadoCampo estado;
    private List<Lote> lotes;

    public Campo(Integer numeroCampo, EstadoCampo estado)
    {
        this.numeroCampo = numeroCampo;
        this.estado = estado;
        this.lotes = new ArrayList<>();
    }
    public Integer getNumeroCampo() 
    {
        return numeroCampo;
    }
    public void setnumeroCampo(Integer numeroCampo)
    {
        this.numeroCampo=numeroCampo;
    }
    public void setEstado(EstadoCampo estado) 
    {
        this.estado = estado;
    }
    public EstadoCampo getEstado() 
    {
        return estado;
    }
    public List<Lote> getLotes() {
        return lotes;
    }
    public void addLote(Lote lote)
    {
        lotes.add(lote);
    }
}
