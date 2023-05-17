package Dominio;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 */
public class Animal {

    /**
     * Default constructor
     */
    public Animal() {
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
    private int edad;

    private ObjectId especieId;

    private String sexo;

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     *
     * @param id Id del animal.
     * @param nombre Nombre del animal.
     * @param nombreCientifico Nombre científico del animal.
     * @param edad Edad del animal.
     * @param especieId Especie del animal.
     * @param sexo Sexo del animal.
     */
    public Animal(ObjectId id, String nombre, String nombreCientifico, int edad, ObjectId especieId, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.especieId = especieId;
        this.sexo = sexo;
    }

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     *
     * @param nombre Nombre del animal.
     * @param nombreCientifico Nombre científico del animal.
     * @param edad Edad del animal.
     * @param especieId Especie del animal.
     * @param sexo Sexo del animal.
     */
    public Animal(String nombre, String nombreCientifico, int edad, ObjectId especieId, String sexo) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.especieId = especieId;
        this.sexo = sexo;
    }

    /**
     * Constructor que inicializa los atributos al valor de sus parámetros.
     *
     * @param nombre Nombre del animal.
     * @param nombreCientifico Nombre científico del animal.
     * @param edad Edad del animal.
     * @param sexo Sexo del animal.
     */
    public Animal(String nombre, String nombreCientifico, int edad, String sexo) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.sexo = sexo;
    }

    /**
     * Método que regresa el id de la especie del animal.
     *
     * @return Id del especie del animal.
     */
    public ObjectId getEspecieId() {
        return especieId;
    }

    /**
     * Método que setea el id de la especie del animal.
     *
     * @param especieId
     */
    public void setEspecieId(ObjectId especieId) {
        this.especieId = especieId;
    }

    /**
     * Método que regresa el id del animal.
     *
     * @return Id del animal.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método que setea el id del animal.
     *
     * @param id Id del animal.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método que regresa el nombre del animal.
     *
     * @return Nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que setea el nombre del animal.
     *
     * @param nombre Nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el nombre científico del animal.
     *
     * @return Nombre científico del animal.
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Método que setea el nombre científico del animal.
     *
     * @param nombreCientifico
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     * Método que regresa la edad del animal.
     *
     * @return Edad del animal.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método que setea la edad del animal.
     *
     * @param edad Edad del animal.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que regresa el sexo del animal.
     *
     * @return Sexo del animal.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Método que setea el sexo del animal.
     *
     * @param sexo Sexo del animal.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Método que verifica que el objeto Animal contenga todos sus atributos.
     *
     * @param nombre Nombre del animal.
     * @param edad Edad del animal.
     * @param sexo Sexo del animal.
     * @param nombreCientico Nombre científico del animal.
     * @return true en caso de que el Animal este correcto, false en caso
     * contrario.
     */
    public boolean verificacion(String nombre, int edad, boolean sexo, String nombreCientico) {
        if (nombre.equals("") || nombreCientico.equals("")) {
            return false;
        }
        if (edad < 0 || edad > 150) {
            return false;
        }
        this.nombre = nombre;
        this.edad = edad;
        this.nombreCientifico = nombreCientico;
        if (sexo) {
            this.sexo = "Macho";
        } else {
            this.sexo = "Hembra";
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", nombreCientifico=" + nombreCientifico + ", edad=" + edad + '}';
    }
}
