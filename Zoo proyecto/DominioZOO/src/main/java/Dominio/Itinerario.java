package Dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Itinerario {
  private ObjectId id;
    private String nombreItinerario;
    
    private int totalEspecies;

    /**
     * 
     */
    private int maxVisitantes;

    private Recorrido recorrido;
    
    private List<Zona> zonas;
    
    private List<Horario> horarios;
    
    private Guia guia;
    /**
     * Default constructor
     */
    public Itinerario() {
    }
    
    public Itinerario(ObjectId id, int totalEspecies, int maxVisitantes, Recorrido recorrido) {
        this.id = id;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorrido=recorrido;
    }

    public Itinerario(String nombre, int totalEspecies, int maxVisitantes, Recorrido recorrido, List<Zona> zonas, List<Horario> horarios) {
        this.nombreItinerario = nombre;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorrido = recorrido;
        this.zonas = zonas;
        this.horarios = horarios;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public int getTotalEspecies() {
        return totalEspecies;
    }

    public void setTotalEspecies(int totalEspecies) {
        this.totalEspecies = totalEspecies;
    }

    public int getMaxVisitantes() {
        return maxVisitantes;
    }

    public void setMaxVisitantes(int maxVisitantes) {
        this.maxVisitantes = maxVisitantes;
    }

    public Recorrido getRecorrido(){
        return this.recorrido;
    }
    
    public void setRecorrido(Recorrido recorrido){
        this.recorrido=recorrido;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public String getNombreItinerario() {
        return nombreItinerario;
    }

    public void setNombreItinerario(String nombreItinerario) {
        this.nombreItinerario = nombreItinerario;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombreItinerario=" + nombreItinerario + ", totalEspecies=" + totalEspecies + ", maxVisitantes=" + maxVisitantes + ", recorrido=" + recorrido + ", zonas=" + zonas + ", horarios=" + horarios + '}';
    }
    
    
}