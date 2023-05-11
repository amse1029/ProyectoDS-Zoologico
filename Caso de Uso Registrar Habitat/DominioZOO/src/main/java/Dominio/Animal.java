package Dominio;


/**
 * 
 */
public class Animal extends Especie {

    /**
     * Default constructor
     */
    public Animal() {
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
    private int edad;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
}