package Dominio;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 * 
 */
public class Habitat {

    /**
     * Default constructor
     */
    public Habitat() {
    }

    /**
     * 
     */
    private ObjectId id;
    private String nombre;
    private Clima clima;
    private List<Continente> continentes;
    private Vegetacion vegetacion;

    public Habitat(ObjectId id, String nombre, Clima clima, List<Continente> continentes, Vegetacion vegetacion) {
        this.id = id;
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = continentes;
        this.vegetacion = vegetacion;
    }

    public Habitat(String nombre) {
        this.nombre = nombre;
    }
    

    public Habitat(String nombre, Clima clima, List<Continente> continentes, Vegetacion vegetacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = continentes;
        this.vegetacion = vegetacion;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }
    
  

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean verificacion(String nombre, Clima clima, Vegetacion vegetacion, List<Continente> continentes){
        if(nombre.equals("")){
            return false;
        }
        if(clima==null){
            return false;
        }
        if(vegetacion==null){
            return false;
        }
        if(continentes.size()==0){
            return false;
        }
        this.nombre=nombre;
        this.clima=clima;
        this.vegetacion=vegetacion;
        this.continentes=continentes;
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.id);
        return hash;
    }

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
        final Habitat other = (Habitat) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Habitat{" + "id=" + id + ", nombre=" + nombre + ", clima=" + clima + ", continentes=" + continentes + ", vegetacion=" + vegetacion+ '}';
    }

    
    
}