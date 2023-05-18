package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase de dominio continente que contiene todos los atributos necesarios.
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

    /**
     * Constructor que los atributos al valor de sus parámetros.
     * @param id Id del continente.
     * @param nombre Nombre del continente.
     */
    public Continente(ObjectId id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el nombre al valor de su parámetro.
     * @param nombre Nombre del continente.
     */
    public Continente(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el id del continente.
     * @return Id del continente.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del continente.
     * @param id Id del continente.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre del continente.
     * @return Nombre del continente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre del continente.
     * @param nombre Nombre del continente.
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
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Continente other = (Continente) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Continente{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
