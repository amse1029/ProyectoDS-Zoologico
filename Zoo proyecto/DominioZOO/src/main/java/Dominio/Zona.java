package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase de dominio zona que contiene todos los atributos necesarios.
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

    /**
     * Constructor que inicializa sus atributos al valor de sus parámetros.
     * @param nombre Nombre de la zona.
     * @param id Id de la zona.
     * @param especieId Id de la especie de la zona.
     * @param especies Lista de especies de la zona.
     */
    public Zona(String nombre, ObjectId id, List<ObjectId> especieId, List<Especie> especies) {
        this.nombre = nombre;
        this.id = id;
        this.especieId = especieId;
        this.especies = especies;
    }

    /**
     * Constructor que inicializa el nombre y especieId al valor de sus parámetros.
     * @param nombre Nombre de la zona.
     * @param especieId Id de la especie de la zona.
     */
    public Zona(String nombre, List<ObjectId> especieId) {
        this.nombre = nombre;
        this.especieId = especieId;
    }

    /**
     * Constructor que inicializa el nombre al valor de sus parámetros.
     * @param nombre Nombre de la zona.
     */
    public Zona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el id de la zona.
     * @return Id de la zona.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id de la zona.
     * @param id Id de la zona.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el id de la especie de la zona.
     * @return Id de la especie de la zona.
     */
    public List<ObjectId> getEspecieId() {
        return especieId;
    }

    /**
     * Método que setea la lista de ids de la especie de la zona.
     * @param especieId Lista de ids de la especie de la zona.
     */
    public void setEspecieId(List<ObjectId> especieId) {
        this.especieId = especieId;
    }

    /**
     * Método que regresa la lista de las especies de la zona.
     * @return Lista de las especies de la zona.
     */
    public List<Especie> getEspecies() {
        return especies;
    }

    /**
     * Método que setea la lista de las especies de la zona.
     * @param especies Lista de las especies de la zona.
     */
    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    /**
     * Método que regresa el nombre de la zona.
     * @return Nombre de la zona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre de la zona.
     * @param nombre Nombre de la zona.
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
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Zona other = (Zona) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", id=" + id + ", especieId=" + especieId + ", especies=" + especies + '}';
    }

}
