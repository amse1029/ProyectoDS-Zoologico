package Dominio;

import org.bson.types.ObjectId;

/**
 * 
 */
public class CuidadorEspecie {

    /**
     * Default constructor
     */
    public CuidadorEspecie() {
    }

    /**
     * 
     */
    private ObjectId id;
    private boolean experto;

    public CuidadorEspecie(ObjectId id, boolean experto) {
        this.id = id;
        this.experto = experto;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    public boolean isExperto() {
        return experto;
    }

    public void setExperto(boolean experto) {
        this.experto = experto;
    }
    
    
}