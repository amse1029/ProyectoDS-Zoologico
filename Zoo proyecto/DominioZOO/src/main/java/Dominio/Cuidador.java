package Dominio;

import org.bson.types.ObjectId;

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

    private ObjectId id;

    public Cuidador(Especie especie, ObjectId id) {
        this.especie = especie;
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    
}