package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Habitat {

    /**
     * Default constructor
     */
    public Habitat() {
    }

    /**
     * 
     */
    private ObjectId id;
    private String nombre;
    private List<Clima> climas;
    private List<Continente> continentes;
    private List<Vegetacion> vegetaciones;

    public Habitat(ObjectId id, String nombre, List<Clima> climas, List<Continente> continentes, List<Vegetacion> vegetaciones) {
        this.id = id;
        this.nombre = nombre;
        this.climas = climas;
        this.continentes = continentes;
        this.vegetaciones = vegetaciones;
    }

    public Habitat(String nombre) {
        this.nombre = nombre;
    }
    

    public Habitat(String nombre, List<Clima> climas, List<Continente> continentes, List<Vegetacion> vegetaciones) {
        this.nombre = nombre;
        this.climas = climas;
        this.continentes = continentes;
        this.vegetaciones = vegetaciones;
    }

    public List<Clima> getClimas() {
        return climas;
    }

    public void setClimas(List<Clima> climas) {
        this.climas = climas;
    }

    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

    public List<Vegetacion> getVegetaciones() {
        return vegetaciones;
    }

    public void setVegetaciones(List<Vegetacion> vegetaciones) {
        this.vegetaciones = vegetaciones;
    }
    
  

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitat other = (Habitat) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Habitat{" + "id=" + id + ", nombre=" + nombre + ", climas=" + climas + ", continentes=" + continentes + ", vegetaciones=" + vegetaciones + '}';
    }

    
    
}