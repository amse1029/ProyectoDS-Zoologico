package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * Clase de dominio guia que contiene todos los atributos necesarios.
 */
public class Guia extends Empleado {

    /**
     * Default constructor
     */
    public Guia() {
    }

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     * @param id Id del guía.
     * @param nombre Nombre del guía.
     * @param direccion Dirección del guía.
     * @param telefono Teléfono del guía.
     * @param fechaIngreso Fecha de ingreso del guía.
     */
    public Guia(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(id, nombre, direccion, telefono, fechaIngreso);
    }

    /**
     * Constructor que inicializa los atributos, excepto el id, al valor de sus parámetros.
     * @param nombre Nombre del guía.
     * @param direccion Dirección del guía.
     * @param telefono Teléfono del guía.
     * @param fechaIngreso Fecha de ingreso del guía.
     */
    public Guia(String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
    }

}
