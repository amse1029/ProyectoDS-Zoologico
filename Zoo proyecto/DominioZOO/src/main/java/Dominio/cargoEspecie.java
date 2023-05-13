package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;


/**
 * 
 */
public class CargoEspecie {

    /**
     * Default constructor
     */
    public CargoEspecie() {
    }

    /**
     * 
     */
    private ObjectId id;
    
    private Date fechaInicioCargo;
    
    private ObjectId cuidadorId;
    
    private ObjectId especieId;

    public CargoEspecie(ObjectId id, Date fechaInicioCargo, ObjectId cuidadorId, ObjectId especieId) {
        this.id = id;
        this.fechaInicioCargo = fechaInicioCargo;
        this.cuidadorId = cuidadorId;
        this.especieId = especieId;
    }

    public CargoEspecie(Date fechaInicioCargo, ObjectId cuidadorId, ObjectId especieId) {
        this.fechaInicioCargo = fechaInicioCargo;
        this.cuidadorId = cuidadorId;
        this.especieId = especieId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getCuidadorId() {
        return cuidadorId;
    }

    public void setCuidadorId(ObjectId cuidadorId) {
        this.cuidadorId = cuidadorId;
    }

    public ObjectId getEspecieId() {
        return especieId;
    }

    public void setEspecieId(ObjectId especieId) {
        this.especieId = especieId;
    }

    public Date getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    public void setFechaInicioCargo(Date fechaInicioCargo) {
        this.fechaInicioCargo = fechaInicioCargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CargoEspecie other = (CargoEspecie) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "cargoEspecie{" + "id=" + id + ", fechaInicioCargo=" + fechaInicioCargo + ", cuidadorId=" + cuidadorId + ", especieId=" + especieId + '}';
    }
    
    

    
    
}