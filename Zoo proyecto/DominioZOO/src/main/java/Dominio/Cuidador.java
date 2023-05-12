package Dominio;

import java.util.Date;
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

    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }

    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

    /**
     * 
     */
   
    
}