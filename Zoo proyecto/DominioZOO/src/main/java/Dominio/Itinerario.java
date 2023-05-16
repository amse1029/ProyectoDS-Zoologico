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

    private ObjectId recorridoId;
    
    private List<Horario> horarios;
    
    private Recorrido recorrido;
    /**
     * Default constructor
     */
    public Itinerario() {
    }
    
    public Itinerario(ObjectId id, int totalEspecies, int maxVisitantes, ObjectId recorridoId) {
        this.id = id;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorridoId=recorridoId;
    }

    public Itinerario(String nombre, int totalEspecies, int maxVisitantes, ObjectId recorridoId, List<Horario> horarios) {
        this.nombreItinerario = nombre;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorridoId = recorridoId;
        this.horarios = horarios;
    }

    public boolean verificacion(String nombre, int visitantes,  List<Horario> horarios){
        if(nombre.equals("")){
            return false;
        }
        if(visitantes<=0||visitantes>30){
            return false;
        }

        if(horarios.size()==0){
            return false;
        }
        this.nombreItinerario=nombre;
        this.maxVisitantes=visitantes;

        this.horarios=horarios;
        return true;
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

    public ObjectId getRecorridoId() {
        return recorridoId;
    }

    public void setRecorridoId(ObjectId recorridoId) {
        this.recorridoId = recorridoId;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
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

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombreItinerario=" + nombreItinerario + ", totalEspecies=" + totalEspecies + ", maxVisitantes=" + maxVisitantes + ", recorrido=" + recorridoId + ", horarios=" + horarios + '}';
    }
    
    
}

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Itinerario{" + "id=" + id + ", nombreItinerario=" + nombreItinerario + ", totalEspecies=" + totalEspecies + ", maxVisitantes=" + maxVisitantes + ", recorrido=" + recorrido + ", zonas=" + zonas + ", horarios=" + horarios + '}';
    }
    
    
}
