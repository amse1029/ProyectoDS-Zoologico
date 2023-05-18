package Dominio;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * Clase de dominio empleado que contiene todos los atributos necesarios.
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

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     *
     * @param id Id del empleado.
     * @param nombre Nombre del empleado.
     * @param direccion Dirección del empleado.
     * @param telefono Teléfono del empleado.
     * @param fechaIngreso Fecha de ingreso del empleado.
     */
    public Empleado(ObjectId id, String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Constructor que inicializa los atributos, excepto el id, al valor de sus
     * parámetros.
     *
     * @param nombre Nombre del empleado.
     * @param direccion Dirección del empleado.
     * @param telefono Teléfono del empleado.
     * @param fechaIngreso Fecha de ingreso del empleado.
     */
    public Empleado(String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Método que regresa el id del empleado.
     *
     * @return Id del empleado.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del empleado.
     *
     * @param id Id del empleado.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre del empleado.
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre del empleado.
     * @param nombre Nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa la dirección del empleado.
     * @return Dirección del empleado.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que setea la dirección del empleado.
     * @param direccion Dirección del empleado. 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que regresa el teléfono del empleado.
     * @return Teléfono del empleado.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método que setea el teléfono del empleado.
     * @param telefono Teléfono del empleado.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método que regresa la fecha de ingreso del empleado.
     * @return Fecha de ingreso del empleado.
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Método que setea la fecha de ingreso del empleado.
     * @param fechaIngreso Fecha de ingreso del empleado.
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    /**
     *
     * @param obj
     * @return
     */
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
        final Empleado other = (Empleado) obj;
        return Objects.equals(this.id, other.id);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", fechaIngreso=" + fechaIngreso + '}';
    }

}
