package Dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase de dominio itinerario que contiene todos los atributos necesarios.
 */
public class Itinerario {

    private ObjectId id;
    private String nombreItinerario;

    private int totalEspecies;

    /**
     *
     */
    private int maxVisitantes;

    private ObjectId recorridoId;

    private List<Horario> horarios;

    private Recorrido recorrido;

    private Guia guia;

    /**
     * Default constructor
     */
    public Itinerario() {
    }

    /**
     * Constructor que inicializa los atributos id, totalEspecies, maxVisitantes
     * y recorridoId al valor de sus parámetros.
     *
     * @param id Id del itinerario.
     * @param totalEspecies Total de especies en el itinerario.
     * @param maxVisitantes Máximo de visitantes permitidos en el itinerario.
     * @param recorridoId Id del recorrido del itinerario.
     */
    public Itinerario(ObjectId id, int totalEspecies, int maxVisitantes, ObjectId recorridoId) {
        this.id = id;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorridoId = recorridoId;
    }

    /**
     * Constructor que inicializa los atributos nombre, totalEspecies,
     * maxVisitantes, recorridoId y horarios al valor de sus parámetros.
     *
     * @param nombre Nombre del itinerario.
     * @param totalEspecies Total de especies en el itinerario.
     * @param maxVisitantes Máximo de visitantes permitidos en el itinerario.
     * @param recorridoId Id del recorrido del itinerario.
     * @param horarios Horarios del itinerario.
     */
    public Itinerario(String nombre, int totalEspecies, int maxVisitantes, ObjectId recorridoId, List<Horario> horarios) {
        this.nombreItinerario = nombre;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorridoId = recorridoId;
        this.horarios = horarios;
    }

    /**
     * Método que regresa el id del itinerario.
     *
     * @return Id del itinerario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del itinerario.
     *
     * @param id Id del itinerario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el guía del itinerario.
     *
     * @return Guía del itinerario.
     */
    public Guia getGuia() {
        return guia;
    }

    /**
     * Método que setea el guía del itinerario.
     *
     * @param guia Guía del itinerario.
     */
    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    /**
     * Método que regresa el total de especies del itinerario.
     *
     * @return Total de especies del itinerario.
     */
    public int getTotalEspecies() {
        return totalEspecies;
    }

    /**
     * Método que setea el total de especies del itinerario.
     *
     * @param totalEspecies Total de especies del itinerario.
     */
    public void setTotalEspecies(int totalEspecies) {
        this.totalEspecies = totalEspecies;
    }

    /**
     * Método que regresa el máximo de visitantes del itinerario.
     *
     * @return Máximo de visitantes del itinerario.
     */
    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    /**
     * Método que setea el máximo de visitantes del itinerario.
     *
     * @param maxVisitantes Máximo de visitantes del itinerario.
     */
    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    /**
     * Método que regresa el id del recorrido del itinerario.
     *
     * @return Recorrido del id del itinerario.
     */
    public ObjectId getRecorridoId() {
        return recorridoId;
    }

    /**
     * Método que setea el id del recorrido del itinerario.
     *
     * @param recorridoId Id del recorrido del itinerario.
     */
    public void setRecorridoId(ObjectId recorridoId) {
        this.recorridoId = recorridoId;
    }

    /**
     * Método que regresa el recorrido del itinerario.
     *
     * @return Recorrido del itinerario.
     */
    public Recorrido getRecorrido() {
        return recorrido;
    }

    /**
     * Método que setea el recorrido del itinerario.
     *
     * @param recorrido Recorrido del itinerario.
     */
    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    /**
     * Método que regresa la lista de horarios del itinerario.
     *
     * @return Lista de horarios del itinerario.
     */
    public List<Horario> getHorarios() {
        return horarios;
    }

    /**
     * Método que setea la lista de los horarios del itinerario.
     *
     * @param horarios Horarios del itinerario.
     */
    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    /**
     * Método que regresa el nombre del itinerario.
     *
     * @return Nombre del itinerario.
     */
    public String getNombreItinerario() {
        return nombreItinerario;
    }

    /**
     * Método que setea el nombre del itinerario.
     *
     * @param nombreItinerario Nombre del itinerario.
     */
    public void setNombreItinerario(String nombreItinerario) {
        this.nombreItinerario = nombreItinerario;
    }

    /**
     * Método que verifica si el objeto Itinerario contenga sus atributos.
     *
     * @param nombre Nombre del itinerario.
     * @param visitantes Máximo de visitantes del itinerario.
     * @param horarios Horarios del itinerario.
     * @return true en caso de estar correcto, false en caso contrario.
     */
    public boolean verificacion(String nombre, int visitantes, List<Horario> horarios) {
        if (nombre.equals("")) {
            return false;
        }
        if (visitantes <= 0 || visitantes > 30) {
            return false;
        }

        if (horarios.isEmpty()) {
            return false;
        }
        this.nombreItinerario = nombre;
        this.maxVisitantes = visitantes;

        this.horarios = horarios;
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombreItinerario=" + nombreItinerario + ", totalEspecies=" + totalEspecies + ", maxVisitantes=" + maxVisitantes + ", recorrido=" + recorridoId + ", horarios=" + horarios + '}';
    }

}
