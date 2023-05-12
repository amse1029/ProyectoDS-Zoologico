package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Empleado {

    /**
     * Default constructor
     */
    public Empleado() {
    }
    private ObjectId id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String direccion;

    /**
     * 
     */
    private String telefono;

    /**
     * 
     */
    private Date fechaIngreso;

    public Empleado(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    
    
}