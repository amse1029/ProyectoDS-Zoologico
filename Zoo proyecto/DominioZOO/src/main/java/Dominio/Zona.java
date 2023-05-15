package Dominio;

/**
 *
 */
public class Zona {

    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private float extension;

    /**
     * Default constructor
     */
    public Zona() {
    }

    public Zona(String nombre, float extension) {
        this.nombre = nombre;
        this.extension = extension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "Zona{" + "nombre=" + nombre + ", extension=" + extension + '}';
    }
    
    
}
