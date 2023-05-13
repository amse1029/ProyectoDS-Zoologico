package Dominio;

import java.util.List;
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
    
    private List<Animal> animales;
    
    private List<Cuidador> cuiadadores;

    public Especie(ObjectId id, String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuiadadores) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuiadadores = cuiadadores;
    }

    public Especie(String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuiadadores) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuiadadores = cuiadadores;
    }
    

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Cuidador> getCuiadadores() {
        return cuiadadores;
    }

    public void setCuiadadores(List<Cuidador> cuiadadores) {
        this.cuiadadores = cuiadadores;
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