package Modelo;
// Generated 3 nov. 2021 10:47:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Lote generated by hbm2java
 */
@Entity
@Table(name="lote"
    ,schema="public"
)
public class Lote  implements java.io.Serializable {


     private int idlote;
     private Campo campo;
     private Tiposuelo tiposuelo;
     private float superficie;
     private Set<Proyecto> proyectos = new HashSet<Proyecto>(0);

    public Lote() {
    }

	
    public Lote(Campo campo, Tiposuelo tiposuelo, float superficie) {
        this.campo = campo;
        this.tiposuelo = tiposuelo;
        this.superficie = superficie;
    }
    public Lote(Campo campo, Tiposuelo tiposuelo, float superficie, Set<Proyecto> proyectos) {
       this.campo = campo;
       this.tiposuelo = tiposuelo;
       this.superficie = superficie;
       this.proyectos = proyectos;
    }
   
     @Id 

    
    @Column(name="idlote", unique=true, nullable=false)
     @GeneratedValue(strategy=IDENTITY)
    public int getIdlote() {
        return this.idlote;
    }
    
    public void setIdlote(int idlote) {
        this.idlote = idlote;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcampo", nullable=false)
    public Campo getCampo() {
        return this.campo;
    }
    
    public void setCampo(Campo campo) {
        this.campo = campo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtiposuelo", nullable=false)
    public Tiposuelo getTiposuelo() {
        return this.tiposuelo;
    }
    
    public void setTiposuelo(Tiposuelo tiposuelo) {
        this.tiposuelo = tiposuelo;
    }

    
    @Column(name="superficie", nullable=false, precision=8, scale=8)
    public float getSuperficie() {
        return this.superficie;
    }
    
    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="lote")
    public Set<Proyecto> getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }




}


