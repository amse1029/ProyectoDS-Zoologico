package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 */
public class Animal extends Especie {

    /**
     * Default constructor
     */
    public Animal() {
    }
    private ObjectId id;
    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private String nombreCientifico;

    /**
     *
     */
    private int edad;

    public Animal(ObjectId id, String nombre, String nombreCientifico, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
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

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + ", edad=" + edad + '}';
    }
    
    

}
