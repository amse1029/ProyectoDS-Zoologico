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

    private List<Cuidador> cuidadores;

    private List<Habitat> habitats;

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     * @param id Id de la especie.
     * @param nombre Nombre de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     * @param animales Animales correspondientes de la especie.
     * @param cuidadores Cuidadores correspondientes de la especie.
     * @param habitats Hábitats correspondientes de la especie.
     */
    public Especie(ObjectId id, String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuidadores, List<Habitat> habitats) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuidadores = cuidadores;
        this.habitats = habitats;
    }

    /**
     * Constructor que inicializa los atributos, excepto el id, animales y 
     * cuidadores, al valor de sus parámetros.
     * @param nombre Nombre de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     * @param habitats Hábitats correspondientes de la especie.
     */
    public Especie(String nombre, String nombreCientifico, String descripcion, List<Habitat> habitats) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.habitats = habitats;
    }

    /**
     * Constructor que inicializa los atributos, excepto el id y cuidadores,
     * al valor de sus parámetros. 
     * @param nombre Nombre de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     * @param animales Animales correspondientes de la especie.
     * @param habitats Hábitats correspondientes de la especie.
     */
    public Especie(String nombre, String nombreCientifico, String descripcion, List<Animal> animales, List<Cuidador> cuiadadores, List<Habitat> habitats) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.animales = animales;
        this.cuidadores = cuiadadores;
        this.habitats = habitats;
    }

    /**
     * Método que regresa una lista de hábitats.
     * @return Lista de hábitats.
     */
    public List<Habitat> getHabitats() {
        return habitats;
    }

    /**
     * Método que setea una lista de hábitats.
     * @param habitats Lista de hábitats.
     */
    public void setHabitats(List<Habitat> habitats) {
        this.habitats = habitats;
    }

    /**
     * Método que regresa una lista de animales.
     * @return Lista de animales.
     */
    public List<Animal> getAnimales() {
        return animales;
    }

    /**
     * Método que setea una lista de animales.
     * @param animales Lista de animales.
     */
    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    /**
     * Método que regresa una lista de cuidadores.
     * @return Lista de cuidadores.
     */
    public List<Cuidador> getCuidadores() {
        return cuidadores;
    }

    /**
     * Método que regresa una lista de cuidadores.
     * @param cuidadores Lista de cuidadores.
     */
    public void setCuidadores(List<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }

    /**
     * Método que regresa el id de la especie.
     * @return Id de la especie.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id de la especie.
     * @param id Id de la especie.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre de la especie.
     * @return Nombre de la especie.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre de la especie.
     * @param nombre Nombre de la especie.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el nombre científico de la especie.
     * @return Nombre científico de la especie.
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Método que setea el nombre científico de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     * Método que regresa la descripción de la especie.
     * @return Descripción de la especie.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que setea la descripción de la especie.
     * @param descripcion Descripción de la especie.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que verifica que el objeto Especie contenga todos sus atributos.
     * @param nombre Nombre de la especie.
     * @param nombreCientifico Nombre científico de la especie.
     * @param descripcion Descripción de la especie.
     * @param animales Animales correspondientes de la especie.
     * @param cuidadores Cuidadores correspondientes de la especie.
     * @param habitats Hábitats correspondientes de la especie.
     * @return true en caso de estar completo, false en caso contrario.
     */
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
        this.cuidadores = cuidadores;
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
        return "Especie{" + "id=" + id + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + ", animales=" + animales + ", cuiadadores=" + cuidadores + ", habitats=" + habitats + '}';
    }

}
