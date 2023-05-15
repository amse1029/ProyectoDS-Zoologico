package Dominio;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Itinerario {
  private ObjectId id;
    /**
     * 
     */
    private String nombre;
    
    private int totalEspecies;

    /**
     * 
     */
    private int maxVisitantes;

    private Recorrido recorrido;
    
    private List<Zona> zonas;
    
    private List<Horario> horarios;
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
        this.nombre = nombre;
        this.totalEspecies = totalEspecies;
        this.maxVisitantes = maxVisitantes;
        this.recorrido = recorrido;
        this.zonas = zonas;
        this.horarios = horarios;
    }

    public boolean verificacion(String nombre, int visitantes, Recorrido recorrido, List<Zona> zonas, List<Horario> horarios){
        if(nombre.equals("")){
            return false;
        }
        if(visitantes<=0||visitantes>30){
            return false;
        }
        if(recorrido.getDuracion()<=0||recorrido.getDuracion()>90){
            return false;
        }
        if(recorrido.getLongitud()<=0||recorrido.getLongitud()>1500){
            return false;
        }
        if(zonas.size()==0){
            return false;
        }
        if(horarios.size()==0){
            return false;
        }
        this.nombre=nombre;
        this.maxVisitantes=visitantes;
        this.recorrido=recorrido;
        this.zonas=zonas;
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
    
    
}