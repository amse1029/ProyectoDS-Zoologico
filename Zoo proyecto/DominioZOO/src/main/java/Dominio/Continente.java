package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Continente {

    /**
     * Default constructor
     */
    public Continente() {
    }

    /**
     * 
     */
    private ObjectId id;
    private String nombre;

    public Continente(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Continente(String nombre) {
        this.nombre = nombre;
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
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Continente other = (Continente) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Continente{" + "id=" + id + ", nombre=" + nombre + '}';
    }
 
    
}