package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase de dominio recorrido que contiene todos los atributos necesarios.
 */
public class Recorrido {

    /**
     * Default constructor
     */
    public Recorrido() {
    }

    /**
     *
     */
    private float duracion;

    /**
     *
     */
    private float longitud;

    private ObjectId id;

    private List<Zona> zonas;

    private List<ObjectId> zonasId;

    private String nombre;

    /**
     * Constructor que inicializa sus atributos al valor de sus parámetros.
     * @param duracion Duración del recorrido.
     * @param longitud Longitud del recorrido.
     * @param id Id del recorrido.
     * @param zonas Zonas del recorrido.
     * @param zonasId Id de las zonas del recorrido.
     * @param nombre Nombre del recorrido.
     */
    public Recorrido(float duracion, float longitud, ObjectId id, List<Zona> zonas, List<ObjectId> zonasId, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.id = id;
        this.zonas = zonas;
        this.zonasId = zonasId;
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa sus atributos, excepto las zonas, al valor de sus parámetros.
     * @param duracion Duración del recorrido.
     * @param longitud Longitud del recorrido.
     * @param id Id del recorrido.
     * @param zonasId Id de las zonas del recorrido.
     * @param nombre Nombre del recorrido.
     */
    public Recorrido(float duracion, float longitud, ObjectId id, List<ObjectId> zonasId, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.id = id;
        this.zonasId = zonasId;
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa el valor de duración, longitud y nombre al valor
     * de sus parámetros.
     * @param duracion Duración del recorrido.
     * @param longitud Longitud del recorrido.
     * @param nombre Nombre del recorrido.
     */
    public Recorrido(float duracion, float longitud, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.nombre = nombre;
    }

    /**
     * Método que regresa el id del recorrido.
     * @return Id del recorrido.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del recorrido.
     * @param id Id del recorrido.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa una lista de zonas del recorrido.
     * @return Lista de zonas del recorrido.
     */
    public List<Zona> getZonas() {
        return zonas;
    }

    /**
     * Método que setea las zonas del recorrido.
     * @param zonas Zonas del recorrido.
     */
    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    /**
     * Método que regresa una lista con el id de las zonas del recorrido.
     * @return Lista con el id de las zonas del recorrido.
     */
    public List<ObjectId> getZonasId() {
        return zonasId;
    }

    /**
     * Método que setea el id de las zonas del recorrido.
     * @param zonasId Id de las zonas del recorrido.
     */
    public void setZonasId(List<ObjectId> zonasId) {
        this.zonasId = zonasId;
    }

    /**
     * Método que regresa la duración del recorrido.
     * @return Duración del recorrido.
     */
    public float getDuracion() {
        return duracion;
    }

    /**
     * Método que setea la duración del recorrido.
     * @param duracion Duración del recorrido.
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    /**
     * Método que regresa la longitud del recorrido.
     * @return Longitud del recorrido.
     */
    public float getLongitud() {
        return longitud;
    }

    /**
     * Método que setea la longitud del recorrido.
     * @param longitud Longitud del recorrido.
     */
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Recorrido other = (Recorrido) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Recorrido{" + "duracion=" + duracion + ", longitud=" + longitud + ", id=" + id + ", zonas=" + zonas + ", zonasId=" + zonasId + '}';
    }
    /**
     * 
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
