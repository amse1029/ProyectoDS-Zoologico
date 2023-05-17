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
    
    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     * @param id Id del cuidador.
     * @param nombre Nombre del cuidador.
     * @param direccion Direccion del cuidador.
     * @param telefono Teléfono del cuidador.
     * @param fechaIngreso Fecha de ingreso del cuidador.
     */
    public Cuidador(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }

    /**
     * Constructor que inicializa los atributos, excepto el id, al valor de sus parámetros.
     * @param nombre Nombre del cuidador.
     * @param direccion Direccion del cuidador.
     * @param telefono Teléfono del cuidador.
     * @param fechaIngreso Fecha de ingreso del cuidador. 
     */
    public Cuidador(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

}
