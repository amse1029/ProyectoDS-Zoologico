package Dominio;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Horario {

    /**
     * Default constructor
     */
    public Horario() {
    }

    /**
     * 
     */
    private ObjectId id;
    private Dias dia;

    /**
     * 
     */
    private String hora;

    public Horario(ObjectId id, Dias dia, String hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    
    
    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    
    
}