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

    /**
     * Default constructor
     */
    public Queja() {
    }

    public Queja(ObjectId id, String descripcion, Date fecha, String correoElectronico, String numTelefonoVisitante, String nombreCompletoVisitante) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.correoElectronico = correoElectronico;
        this.numTelefonoVisitante = numTelefonoVisitante;
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }
    
    public boolean verificacion(String descripcion, String correo, String nombre, String telefono){
        if(descripcion==null||descripcion.equals("")){
            return false;
        }
        if(correo==null||correo.equals("")){
            return false;
        }
        if(telefono==null||telefono.equals("")){
            return false;
        }
        this.descripcion=descripcion;
        this.correoElectronico=correo;
        this.nombreCompletoVisitante=nombre;
        this.numTelefonoVisitante=telefono;
        return true;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumTelefonoVisitante() {
        return numTelefonoVisitante;
    }

    public void setNumTelefonoVisitante(String numTelefonoVisitante) {
        this.numTelefonoVisitante = numTelefonoVisitante;
    }

    public String getNombreCompletoVisitante() {
        return nombreCompletoVisitante;
    }

    public void setNombreCompletoVisitante(String nombreCompletoVisitante) {
        this.nombreCompletoVisitante = nombreCompletoVisitante;
    }

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
