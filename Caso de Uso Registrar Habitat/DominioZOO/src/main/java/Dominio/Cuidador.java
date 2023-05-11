package Dominio;

/**
 * 
 */
public class Cuidador extends Empleado {

    /**
     * Default constructor
     */
    public Cuidador() {
    }

    /**
     * 
     */
    private Especie especie;

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    
}