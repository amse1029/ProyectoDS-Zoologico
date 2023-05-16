package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 */
public class Zona {

    /**
     *
     */
    private String nombre;


    private ObjectId id;
    
    private List<ObjectId> especieId;
    
    private List<Especie> especies;
    /**
     * Default constructor
     */
    public Zona() {
    }

    public Zona(String nombre, ObjectId id, List<ObjectId> especieId, List<Especie> especies) {
        this.nombre = nombre;
        this.id = id;
        this.especieId = especieId;
        this.especies = especies;
    }

    public Zona(String nombre, List<ObjectId> especieId) {
        this.nombre = nombre;
        this.especieId = especieId;
    }
    
    

    public Zona(String nombre) {
        this.nombre = nombre;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getEspecieId() {
        return especieId;
    }

    public void setEspecieId(List<ObjectId> especieId) {
        this.especieId = especieId;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Zona other = (Zona) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", id=" + id + ", especieId=" + especieId + ", especies=" + especies + '}';
    }
    
    
}
