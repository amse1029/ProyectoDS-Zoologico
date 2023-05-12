package Dominio;

import org.bson.types.ObjectId;

/**
 * 
 */
public class Especie {

    /**
     * Default constructor
     */
    public Especie() {
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
    private String descripcion;

    public Especie(ObjectId id, String nombre, String nombreCientifico, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}