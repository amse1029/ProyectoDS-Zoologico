package Dominio;

/**
 * 
 */
public class Especie {

    /**
     * Default constructor
     */
    public Especie() {
    }

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