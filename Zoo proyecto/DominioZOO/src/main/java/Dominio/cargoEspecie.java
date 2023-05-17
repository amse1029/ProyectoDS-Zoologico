package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

public class CargoEspecie {

    private ObjectId id;

    private Date fechaInicioCargo;

    private ObjectId cuidadorId;

    private ObjectId especieId;

    /**
     * Default constructor
     */
    public CargoEspecie() {
    }

    /**
     * Constructor que inicializa sus atributos al valor de sus parámetros.
     * @param id Id del cargo especie.
     * @param fechaInicioCargo Fecha de inicio del del cargo especie.
     * @param cuidadorId Id del cuidador.
     * @param especieId Id del especie.
     */
    public CargoEspecie(ObjectId id, Date fechaInicioCargo, ObjectId cuidadorId, ObjectId especieId) {
        this.id = id;
        this.fechaInicioCargo = fechaInicioCargo;
        this.cuidadorId = cuidadorId;
        this.especieId = especieId;
    }

    /**
     * Constructor que inicializa sus atributos, excepto el id, al valor de sus parámetros.
     * @param fechaInicioCargo Fecha de inicio del del cargo especie.
     * @param cuidadorId Id del cuidador.
     * @param especieId Id del especie.
     */
    public CargoEspecie(Date fechaInicioCargo, ObjectId cuidadorId, ObjectId especieId) {
        this.fechaInicioCargo = fechaInicioCargo;
        this.cuidadorId = cuidadorId;
        this.especieId = especieId;
    }

    /**
     * Método que regresa el id del cargo especie.
     * @return Id del cargo especie.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del cargo especie.
     * @param id Id del cargo especie.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el id del cuidador que esta a cargo.
     * @return Id del cuidador a cargo.
     */
    public ObjectId getCuidadorId() {
        return cuidadorId;
    }

    /**
     * Método que setea el id del cuidador a cargo.
     * @param cuidadorId Id del cuidador a cargo.
     */
    public void setCuidadorId(ObjectId cuidadorId) {
        this.cuidadorId = cuidadorId;
    }

    /**
     * Método que regresa el id de la especie a cargo.
     * @return Id de la especie a cargo.
     */
    public ObjectId getEspecieId() {
        return especieId;
    }

    /**
     * Método que setea el id de la especie a cargo.
     * @param especieId Id de la especie a cargo.
     */
    public void setEspecieId(ObjectId especieId) {
        this.especieId = especieId;
    }

    /**
     * Método que regresa la fecha del inicio del cargo.
     * @return Fecha del inicio del cargo.
     */
    public Date getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    /**
     * Método que setea la fecha del inicio del cargo.
     * @param fechaInicioCargo Fecha del inicio del cargo.
     */
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
