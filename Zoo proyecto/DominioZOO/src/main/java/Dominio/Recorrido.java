package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * 
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

    public Recorrido(float duracion, float longitud, ObjectId id, List<Zona> zonas, List<ObjectId> zonasId, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.id = id;
        this.zonas = zonas;
        this.zonasId = zonasId;
        this.nombre = nombre;
    }

    public Recorrido(float duracion, float longitud, ObjectId id, List<ObjectId> zonasId, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.id = id;
        this.zonasId = zonasId;
        this.nombre = nombre;
    }

    public Recorrido(float duracion, float longitud, String nombre) {
        this.duracion = duracion;
        this.longitud = longitud;
        this.nombre = nombre;
    }

  

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<ObjectId> getZonasId() {
        return zonasId;
    }

    public void setZonasId(List<ObjectId> zonasId) {
        this.zonasId = zonasId;
    }
    
    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Recorrido other = (Recorrido) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Recorrido{" + "duracion=" + duracion + ", longitud=" + longitud + ", id=" + id + ", zonas=" + zonas + ", zonasId=" + zonasId + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}