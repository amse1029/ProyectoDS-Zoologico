package Dominio;

import java.util.Date;

/**
 * 
 */
public class Queja {

    /**
     * Default constructor
     */
    public Queja() {
    }

    /**
     * 
     */
    private String descripcion;

    /**
     * 
     */
    private Date fecha;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
}