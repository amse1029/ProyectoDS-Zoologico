package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 */
public class Vegetacion {

    /**
     * Default constructor
     */
    public Vegetacion() {
    }

    /**
     *
     */
    private String nombre;
    private ObjectId id;

    /**
     * Constructor que inicializa el atributo nombre al valor de su parámetro.
     * @param nombre Nombre de la vegetación.
     */
    public Vegetacion(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el atributo nombre y id al valor de su parámetro.
     * @param nombre Nombre de la vegetación.
     * @param id Id de la vegetación.
     */
    public Vegetacion(String nombre, ObjectId id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Método que regresa el id de la vegetación.
     * @return Id de la vegetación.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id de la vegetación.
     * @param id Id de la vegetación.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre de la vegetación.
     * @return Nombre de la vegetación.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre de la vegetación.
     * @param nombre Nombre de la vegetación.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Vegetacion other = (Vegetacion) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Vegetacion{" + "nombre=" + nombre + ", id=" + id + '}';
    }

}
