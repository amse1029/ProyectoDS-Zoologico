package Dominio;

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

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     * @param id Id del horario.
     * @param dia Día del horario.
     * @param hora Hora del horario.
     */
    public Horario(ObjectId id, Dias dia, String hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }

    /**
     * Método que regresa el id del horario.
     * @return Id del horario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del horario.
     * @param id Id del horario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el día del horario.
     * @return Día del horario.
     */
    public Dias getDia() {
        return dia;
    }

    /**
     * Método que setea el día del horario.
     * @param dia Día del horario.
     */
    public void setDia(Dias dia) {
        this.dia = dia;
    }

    /**
     * Método que regresa la hora del horario.
     * @return Hora del horario.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Método que setea la hora del horario.
     * @param hora Hora del horario.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

}
