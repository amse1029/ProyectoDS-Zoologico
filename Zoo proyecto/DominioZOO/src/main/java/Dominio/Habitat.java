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

    /**
     * Constructor que inicializa sus atributos al valor de sus parámetros.
     * @param id Id del hábitat.
     * @param nombre Nombre del hábitat.
     * @param clima Clima del hábitat.
     * @param continentes Continentes del hábitat.
     * @param vegetacion Vegetación del hábitat.
     */
    public Habitat(ObjectId id, String nombre, Clima clima, List<Continente> continentes, Vegetacion vegetacion) {
        this.id = id;
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = continentes;
        this.vegetacion = vegetacion;
    }

    /**
     * Constructor que inicializa el nombre al valor de su parámetro.
     * @param nombre Nombre del hábitat
     */
    public Habitat(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor que inicializa sus atributos, excepto el id, al valor de sus parámetros.
     * @param nombre Nombre del hábitat.
     * @param clima Clima del hábitat.
     * @param continentes Continentes del hábitat.
     * @param vegetacion Vegetación del hábitat.
     */
    public Habitat(String nombre, Clima clima, List<Continente> continentes, Vegetacion vegetacion) {
        this.nombre = nombre;
        this.clima = clima;
        this.continentes = continentes;
        this.vegetacion = vegetacion;
    }

    /**
     * Método que regresa el clima del hábitat.
     * @return Clima del hábitat.
     */
    public Clima getClima() {
        return clima;
    }

    /**
     * Método que setea el clima del hábitat.
     * @param clima Clima del hábitat.
     */
    public void setClima(Clima clima) {
        this.clima = clima;
    }

    /**
     * Método que regresa los continentes del hábitat.
     * @return Continentes del hábitat.
     */
    public List<Continente> getContinentes() {
        return continentes;
    }

    /**
     * Método que setea los continentes del hábitat.
     * @param continentes Continentes del hábitat.
     */
    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
    }

    /**
     * Método que regresa la vegetación del hábitat.
     * @return Vegetación del hábitat.
     */
    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    /**
     * Método que setea la vegetación del hábitat.
     * @param vegetacion Vegetación del hábitat.
     */
    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }

    /**
     * Método que regresa el id del hábitat.
     * @return Id del hábitat.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del hábitat.
     * @param id Id del hábitat.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre del hábitat.
     * @return Nombre del hábitat.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre del hábitat.
     * @param nombre Nombre del hábitat.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que verifica que el objeto Hábitat contenga todos sus atributos.
     * @param nombre Nombre del hábitat.
     * @param clima Clima del hábitat.
     * @param continentes Continentes del hábitat.
     * @param vegetacion Vegetación del hábitat.
     * @return true en caso de estar correcto, false en caso contrario.
     */
    public boolean verificacion(String nombre, Clima clima, Vegetacion vegetacion, List<Continente> continentes) {
        if (nombre.equals("")) {
            return false;
        }
        if (clima == null) {
            return false;
        }
        if (vegetacion == null) {
            return false;
        }
        if (continentes.isEmpty()) {
            return false;
        }
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
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
        return "Habitat{" + "id=" + id + ", nombre=" + nombre + ", clima=" + clima + ", continentes=" + continentes + ", vegetacion=" + vegetacion + '}';
    }

}
