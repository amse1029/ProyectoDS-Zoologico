package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase de dominio clima que contiene todos los atributos necesarios.
 */
public class Clima {

    /**
     * Default constructor
     */
    public Clima() {
    }
    private ObjectId id;

    /**
     *
     */
    private String nombre;

    /**
     * Constructor que inicializa el nombre al valor de su parámetro.
     * @param nombre Nombre del clima.
     */
    public Clima(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el nombre y el id al valor de su parámetro.
     * @param id Id del clima.
     * @param nombre Nombre del clima.
     */
    public Clima(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Método que regresa el id del clima.
     * @return Id del clima.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del clima.
     * @param id Id del clima.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre del clima.
     * @return Nombre del clima.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre del clima.
     * @param nombre Nombre del clima.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
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
        final Clima other = (Clima) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Clima{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
