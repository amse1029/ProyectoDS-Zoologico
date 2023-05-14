package Dominio;

import java.util.Date;


/**
 * 
 * @author aroco
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
    private Date fechaInicioCargo;

    /**
     *
     * @return
     */
    public Date getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    /**
     *
     * @param fechaInicioCargo
     */
    public void setFechaInicioCargo(Date fechaInicioCargo) {
        this.fechaInicioCargo = fechaInicioCargo;
    }

    
    
}