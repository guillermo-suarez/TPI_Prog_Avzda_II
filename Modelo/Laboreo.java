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
 * Laboreo generated by hbm2java
 */
@Entity
@Table(name="laboreo"
    ,schema="public"
)
public class Laboreo  implements java.io.Serializable {


     private int idlaboreo;
     private String nombre;
     private Set<Proyectoxlaboreo> proyectoxlaboreos = new HashSet<Proyectoxlaboreo>(0);
     private Set<Cultivoxlaboreo> cultivoxlaboreos = new HashSet<Cultivoxlaboreo>(0);

    public Laboreo() {
    }

	
    public Laboreo(String nombre) {
        this.nombre = nombre;
    }
    public Laboreo(String nombre, Set<Proyectoxlaboreo> proyectoxlaboreos, Set<Cultivoxlaboreo> cultivoxlaboreos) {
       this.nombre = nombre;
       this.proyectoxlaboreos = proyectoxlaboreos;
       this.cultivoxlaboreos = cultivoxlaboreos;
    }
   
     @Id 

    
    @Column(name="idlaboreo", unique=true, nullable=false)
     @GeneratedValue(strategy=IDENTITY)
    public int getIdlaboreo() {
        return this.idlaboreo;
    }
    
    public void setIdlaboreo(int idlaboreo) {
        this.idlaboreo = idlaboreo;
    }

    
    @Column(name="nombre", nullable=false, length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="laboreo")
    public Set<Proyectoxlaboreo> getProyectoxlaboreos() {
        return this.proyectoxlaboreos;
    }
    
    public void setProyectoxlaboreos(Set<Proyectoxlaboreo> proyectoxlaboreos) {
        this.proyectoxlaboreos = proyectoxlaboreos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="laboreo")
    public Set<Cultivoxlaboreo> getCultivoxlaboreos() {
        return this.cultivoxlaboreos;
    }
    
    public void setCultivoxlaboreos(Set<Cultivoxlaboreo> cultivoxlaboreos) {
        this.cultivoxlaboreos = cultivoxlaboreos;
    }




}

