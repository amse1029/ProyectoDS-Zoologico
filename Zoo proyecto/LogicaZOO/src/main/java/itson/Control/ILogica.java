/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.Control;

import Dominio.Animal;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;
import Dominio.Itinerario;
import Dominio.Queja;
import Dominio.Recorrido;

/**
 * Interfaz que contiene todos metodos necesarios para la logica del zoo.
 * @author julio
 */
public interface ILogica {

    /**
     * Recupera los datos de los hábitats.
     *
     * @return Una lista enlazada con los datos de los hábitats.
     */
    public LinkedList<Object> recuperarDatosHabitats();

    /**
     * Busca un hábitat por su nombre.
     *
     * @param nombre El nombre del hábitat a buscar.
     * @return El hábitat encontrado.
     */
    public Habitat buscarHabitat(String nombre);

    /**
     * Guarda un hábitat.
     *
     * @param habitat El hábitat a guardar.
     * @return true si se guardó correctamente, false en caso contrario.
     */
    public Boolean guardarHabitat(Habitat habitat);

    /**
     * Recupera una lista de cuidadores.
     *
     * @return Una lista de cuidadores.
     */
    public List<Cuidador> recuperarCuidadores();

    /**
     * Recupera una lista de hábitats.
     *
     * @return Una lista de hábitats.
     */
    public List<Habitat> recuperarHabitats();

    /**
     * Consulta si existe una especie por su nombre científico.
     *
     * @param nombreCientifico El nombre científico de la especie a consultar.
     * @return true si la especie existe, false en caso contrario.
     */
    public boolean consultaEspecieNombreCientifico(String nombreCientifico);

    /**
     * Consulta un animal por su nombre.
     *
     * @param nombre El nombre del animal a consultar.
     * @return El animal encontrado.
     */
    public Animal consultaAnimal(String nombre);

    /**
     * Consulta una especie por su nombre.
     *
     * @param nombre El nombre de la especie a consultar.
     * @return La especie encontrada.
     */
    public Especie recuperarEspecie(String nombre);

    /**
     * Guarda una especie.
     *
     * @param especie La especie a guardar.
     * @return Id de la especie guardada.
     */
    public ObjectId guardarEspecie(Especie especie);

    /**
     * Recupera los datos de un itinerario.
     *
     * @return Una lista enlazada con los datos del itinerario.
     */
    public LinkedList<Object> recuperaDatosItinerario();

    /**
     * Busca un itinerario por su nombre.
     *
     * @param nombre El nombre del itinerario a buscar.
     * @return El itinerario encontrado.
     */
    public Itinerario buscarItinerario(String nombre);

    /**
     * Guarda un itinerario junto con su recorrido.
     *
     * @param itinerario El itinerario a guardar.
     * @param recorrido El recorrido asociado al itinerario.
     * @return El ID del itinerario guardado.
     */
    public ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido);

    /**
     * Recupera una lista de nombres de itinerarios.
     *
     * @return Una lista de itinerarios.
     */
    public List<Itinerario> recuperaNombreItinerarios();

    /**
     * Guarda una queja.
     *
     * @param queja La queja a guardar.
     * @return El ID de la queja guardada.
     */
    public ObjectId guardarQueja(Queja queja);

    /**
     * Busca un recorrido por su nombre.
     *
     * @param nombre El nombre del recorrido a buscar.
     * @return El recorrido encontrado.
     */
    public Recorrido buscarRecorrido(String nombre);

    /**
     * Actualiza un recorrido.
     *
     * @param recorrido El recorrido a actualizar.
     */
    public void actualizarRecorrido(Recorrido recorrido);

    /**
     * Actualiza un itinerario.
     *
     * @param itinerario El itinerario a actualizar.
     */
    public void actualizarItieneracio(Itinerario itinerario);

    /**
     * Recupera una lista de itinerarios.
     *
     * @return Una lista de itinerarios.
     */
    public List<Itinerario> recuperarItinerarios();

    /**
     * Recupera una lista de animales de una especie.
     *
     * @param idEspecie El ID de la especie.
     * @return Una lista de animales.
     */
    public List<Animal> recupearaAnimales(ObjectId idEspecie);
}
