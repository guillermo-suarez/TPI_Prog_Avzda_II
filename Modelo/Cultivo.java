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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cultivo generated by hbm2java
 */
@Entity
@Table(name="cultivo"
    ,schema="public"
)
public class Cultivo  implements java.io.Serializable {


     private int idcultivo;
     private String nombre;
     private Set<Cultivoxtiposuelo> cultivoxtiposuelos = new HashSet<Cultivoxtiposuelo>(0);
     private Set<Cultivoxlaboreo> cultivoxlaboreos = new HashSet<Cultivoxlaboreo>(0);
     private Set<Proyecto> proyectos = new HashSet<Proyecto>(0);

    public Cultivo() {
    }

	
    public Cultivo(String nombre) {
        this.nombre = nombre;
    }
    public Cultivo(String nombre, Set<Cultivoxtiposuelo> cultivoxtiposuelos, Set<Cultivoxlaboreo> cultivoxlaboreos, Set<Proyecto> proyectos) {
       this.nombre = nombre;
       this.cultivoxtiposuelos = cultivoxtiposuelos;
       this.cultivoxlaboreos = cultivoxlaboreos;
       this.proyectos = proyectos;
    }
   
     @Id 

    
    @Column(name="idcultivo", unique=true, nullable=false)
     @GeneratedValue(strategy=IDENTITY)
    public int getIdcultivo() {
        return this.idcultivo;
    }
    
    public void setIdcultivo(int idcultivo) {
        this.idcultivo = idcultivo;
    }

    
    @Column(name="nombre", nullable=false, length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cultivo")
    public Set<Cultivoxtiposuelo> getCultivoxtiposuelos() {
        return this.cultivoxtiposuelos;
    }
    
    public void setCultivoxtiposuelos(Set<Cultivoxtiposuelo> cultivoxtiposuelos) {
        this.cultivoxtiposuelos = cultivoxtiposuelos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cultivo")
    public Set<Cultivoxlaboreo> getCultivoxlaboreos() {
        return this.cultivoxlaboreos;
    }
    
    public void setCultivoxlaboreos(Set<Cultivoxlaboreo> cultivoxlaboreos) {
        this.cultivoxlaboreos = cultivoxlaboreos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cultivo")
    public Set<Proyecto> getProyectos() {
        return this.proyectos;
    }
    
    public void setProyectos(Set<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }




}

