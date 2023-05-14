package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 */
public class Especie {

    /**
     * Default constructor
     */
    public Especie() {
    }

    private ObjectId id;
    /**
     *
     */
    private String nombre;

    /**
     *
     */
    private String nombreCientifico;

    /**
     *
     */
    private String descripcion;

    private List<Animal> animales;

    private List<Cuidador> cuiadadores;

    private List<Habitat> habitats;

    public Especie(ObjectId id, String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuiadadores, List<Habitat> habitats) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuiadadores = cuiadadores;
        this.habitats = habitats;
    }

    public Especie(String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuiadadores, List<Habitat> habitats) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuiadadores = cuiadadores;
        this.habitats = habitats;
    }

    public List<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Cuidador> getCuiadadores() {
        return cuiadadores;
    }

    public void setCuiadadores(List<Cuidador> cuiadadores) {
        this.cuiadadores = cuiadadores;
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

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean verificacion(String nombre, String nombreCientifico, String descripcion, ArrayList<Cuidador> cuidadores, ArrayList<Habitat> habitats, List<Animal> animales) {
        if (nombre.equals("")) {
            return false;
        }
        if (nombreCientifico.equals("")) {
            return false;
        }
        if (descripcion.equals("")) {
            return false;
        }
        if (cuidadores.size() == 0) {
            return false;
        }
        if (habitats.size() == 0) {
            return false;
        }
        if (animales.size() == 0) {
            return false;
        }
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.cuiadadores = cuidadores;
        this.habitats = habitats;
        this.animales = animales;
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Especie other = (Especie) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Especie{" + "id=" + id + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + ", animales=" + animales + ", cuiadadores=" + cuiadadores + ", habitats=" + habitats + '}';
    }

}
