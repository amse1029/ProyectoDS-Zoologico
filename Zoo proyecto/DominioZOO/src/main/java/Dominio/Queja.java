package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 */
public class Queja {

    /**
     *
     */
    private ObjectId id;
    private String descripcion;
    /**
     *
     */
    private Date fecha;
    private String correoElectronico;
    private String numTelefonoVisitante;
    private String nombreCompletoVisitante;
    private ObjectId itinerario;

    /**
     * Default constructor
     */
    public Queja() {
    }

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     *
     * @param id Id de la queja.
     * @param descripcion Descripción de la queja.
     * @param fecha Fecha de la queja.
     * @param correoElectronico Correo electrónico del visitante que realiza la
     * queja.
     * @param numTelefonoVisitante Número de teléfono del visitante que realiza
     * la queja.
     * @param nombreCompletoVisitante Nombre completo del visitante que realiza
     * la queja.
     */
    public Queja(ObjectId id, String descripcion, Date fecha, String correoElectronico, String numTelefonoVisitante, String nombreCompletoVisitante) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.correoElectronico = correoElectronico;
        this.numTelefonoVisitante = numTelefonoVisitante;
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }

    /**
     * Método que regresa el id del itinerario al que pertenece la queja.
     *
     * @return Id del itinerario.
     */
    public ObjectId getItinerario() {
        return itinerario;
    }

    /**
     * Método que setea el id del itinerario al que pertenece la queja.
     *
     * @param itinerario Id del itinerario.
     */
    public void setItinerario(ObjectId itinerario) {
        this.itinerario = itinerario;
    }

    /**
     * Método que regresa el id de la queja.
     *
     * @return Id de la queja.
     */
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el correo del visitante que realiza la queja.
     *
     * @return Correo del visitante.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Método que setea el correo del visitante que realiza la queja.
     * @param correoElectronico Correo del visitante.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Método que regresa el número de teléfono del visitante que realiza la queja.
     *
     * @return Teléfono del visitante.
     */
    public String getNumTelefonoVisitante() {
        return numTelefonoVisitante;
    }

    /**
     * Método que setea el número de teléfono del visitante que realiza la queja.
     * @param numTelefonoVisitante Teléfono del visitante.
     */
    public void setNumTelefonoVisitante(String numTelefonoVisitante) {
        this.numTelefonoVisitante = numTelefonoVisitante;
    }

    /**
     * Método que regresa el nombre del visitante que realiza la queja.
     *
     * @return Nombre del visitante.
     */
    public String getNombreCompletoVisitante() {
        return nombreCompletoVisitante;
    }

    /**
     * Método que setea el nombre del visitante que realiza la queja.
     * @param nombreCompletoVisitante Nombre del visitante.
     */
    public void setNombreCompletoVisitante(String nombreCompletoVisitante) {
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }

    /**
     * Método que regresa la descripción de la queja.
     * @return Descripción de la queja.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que setea la descripción de la queja.
     * @param descripcion Descripción de la queja.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que regresa la fecha de la queja.
     * @return Fecha de la queja.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que setea la fecha de la queja.
     * @param fecha Fecha de la queja.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método que verifica que el objeto Queja contenga los atributos
     * correspondientes.
     *
     * @param itinerario Itinerario al que pertenece la queja.
     * @param descripcion Descripción de la queja.
     * @param correo Correo electrónico del visitante que realiza la queja.
     * @param telefono Número de teléfono del visitante que realiza la queja.
     * @param nombre Nombre completo del visitante que realiza la queja.
     * @return true en caso de estar correcto, false en caso contrario.
     */
    public boolean verificacion(String descripcion, String correo, String nombre, String telefono, ObjectId itinerario) {
        if (descripcion == null || descripcion.equals("")) {
            return false;
        }
        if (correo == null || correo.equals("")) {
            return false;
        }
        if (telefono == null || telefono.equals("")) {
            return false;
        }
        this.descripcion = descripcion;
        this.correoElectronico = correo;
        this.nombreCompletoVisitante = nombre;
        this.numTelefonoVisitante = telefono;
        this.itinerario = itinerario;
        this.fecha = new Date();
        return true;
    }

}
