package Dominio;

import org.bson.types.ObjectId;

/**
 * 
 */
public class Itinerario {

    /**
     * Default constructor
     */
    public Itinerario() {
    }

    private ObjectId id;
    /**
     * 
     */
    private int totalEspecies;

    /**
     * 
     */
    private int maxVisitantes;

    public Itinerario(ObjectId id, int totalEspecies, int maxVisitantes) {
        this.id = id;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    public int getTotalEspecies() {
        return totalEspecies;
    }

    public void setTotalEspecies(int totalEspecies) {
        this.totalEspecies = totalEspecies;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    
    
}