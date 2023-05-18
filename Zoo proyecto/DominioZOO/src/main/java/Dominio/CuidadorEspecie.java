package Dominio;

import org.bson.types.ObjectId;

/**
 * Clase de dominio cuidadorEspecie que contiene todos los atributos necesarios.
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

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     * @param id Id
     * @param experto true si es experto, false en caso contrario 
     */
    public CuidadorEspecie(ObjectId id, boolean experto) {
        this.id = id;
        this.experto = experto;
    }

    /**
     * Método que regresa el id.
     * @return Id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id.
     * @param id Id
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que indica si un cuidador es experto o no.
     * @return true si es experto, false en caso contrario
     */
    public boolean isExperto() {
        return experto;
    }

    /**
     * Método que setea si un cuidador es experto o no.
     * @param experto 
     */
    public void setExperto(boolean experto) {
        this.experto = experto;
    }

}
