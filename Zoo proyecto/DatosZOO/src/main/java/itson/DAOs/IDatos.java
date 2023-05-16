/**
 * IDatos.java
 * May 8, 2023 6:39:56 PM
 */
package itson.DAOs;

import Dominio.Animal;
import Dominio.CargoEspecie;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.Queja;
import Dominio.Recorrido;
import Dominio.Vegetacion;
import Dominio.Zona;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz que contiene todos los metodos que seran utilizados en la fachada
 * datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface IDatos {

    /**
     * Metodo que permite recuperar los climas exitentes en la base de datos.
     *
     * @return Una lista con los climas existentes.
     */
    public List<Clima> recuperarClima();

    /**
     * Metodo que permite insertar los climas en la base de datos.
     */
    public void insertarClimas();

    /**
     * Metodo que permite recuperar todos los continentes existentes en la base
     * de datos
     *
     * @return Una lista con los continentes existentes.
     */
    public List<Continente> recuperarContinente();

    /**
     * Metodo que permite insertar los continentes en la base de datos.
     */
    public void insertarContinentes();

    /**
     * Metodo que permite recuperar las vegetaciones existentes en la base de
     * datos.
     *
     * @return Una lista con todas las vegetaciones existentes.
     */
    public List<Vegetacion> recuperarVegetacion();

    /**
     * Metodo que permite insertar las vegetaciones en la base de datos.
     */
    public void insertarVegetacion();

    /**
     * Metodo que permite buscar un habitat por su nombre.
     *
     * @param nombre Es el nombre del habitar.
     * @return El habitat que concuerda con el nombre.
     */
    public Habitat buscarHabitat(String nombre);

    /**
     * Metodo que permite guardar un habitat.
     *
     * @param habitat Es el habitat que se desea guardar.
     * @return true si se pudo guardar, false en caso contrario.
     */
    public boolean guardarHabitat(Habitat habitat);

    /**
     * Metodo que permite recuperar los habitats existentes en la base de datos.
     *
     * @return Una lista con todos los habitats existentes.
     */
    public List<Habitat> recuperarHabitats();

    /**
     * Metodo que permite recuperar los cuidadores existentes en la base de
     * datos.
     *
     * @return Una lista con todos los cuidadores existentes.
     */
    public List<Cuidador> recuperarCuidadores();

    /**
     * Metodo que permite recuperar los animales que cuenten con el id de
     * especie del parametro.
     *
     * @param idEspecie Es el id de la especie.
     * @return Una lista con todas las coincidencias.
     */
    public List<Animal> recuperaAnimales(ObjectId idEspecie);

    /**
     * Metodo que permite consultar el animal que cuenta con el mismo nombre.
     *
     * @param nombre Es el nombre del animal.
     * @return El animal que coincida con el nombre.
     */
    public Animal consultaAnimal(String nombre);

    /**
     * Metodo que permite guardar un animal en la base de datos.
     *
     * @param animal Es el animal que se desea guardar.
     */
    public void guardarAnimal(Animal animal);

    /**
     * Metodo que permite eliminar un animal de la base de datos.
     *
     * @param animal Es el animal que se desea eliminar.
     */
    public void eliminarAnimal(Animal animal);

    /**
     * Metodo que permite recuperar la especie que cuente con el nombre dado en
     * el parametro.
     *
     * @param nombre Es el nombre de la especie.
     * @return La especie que cuente con el nombre del parametro.
     */
    public Especie recuperaEspecieNombre(String nombre);

    /**
     * Metodo que permite buscar una especie por su nombre cientifico.
     *
     * @param nombreCientifico Es el nombre cientifico de la especie.
     * @return La especie que cuente con el nombre cientifico del parametro.
     */
    public Especie buscarNombreCientificoEspecie(String nombreCientifico);

    /**
     * Metodo que permite guardar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea guardar.
     * @return Es el id que se genero al guardarlo.
     */
    public ObjectId guardarEspecie(Especie especie);

    /**
     * Metodo que permite actualizar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea actualizar.
     * @return Es el id de la especie que se actualizo.
     */
    public ObjectId actualizarEspecie(Especie especie);

    /**
     * Metodo que permite guardar el cuidador que esta a cargo de la especie.
     *
     * @param cargoEspecie Es el cuidador que esta a cargo de la especie.
     */
    public void guardarCargoEspecie(CargoEspecie cargoEspecie);

    /**
     * Metodo uqe permite eliminar el cargo que tiene un cuidador a una especie.
     *
     * @param cargoEspecie Es quien esta a cargo de la especie que se desea
     * elimnar.
     */
    public void eliminarCargoEspecie(CargoEspecie cargoEspecie);

    /**
     * Metodo que permite consultar todos los cuidadores ques estan a cargo de
     * una especie.
     *
     * @param especie Es la especie de la cual se quieren obtener los cargos.
     * @return Una lista con todos los que estan a cargo de una especie.
     */
    public List<CargoEspecie> consultaEspeciesCargoEspecie(Especie especie);

    /**
     * Metodo que permite consultar todas las especies que tiene a cargo un
     * cuidador.
     *
     * @param cuidador Es el cuidador del que se desean obtener los cargos.
     * @return Una lista de los cargos que tiene el cuidador.
     */
    public List<CargoEspecie> consultaCuidadorCargoEspecie(Cuidador cuidador);

    /**
     * Metodo que permite recuperar el cuidador que tiene el mismo id.
     *
     * @param idCuidador Es el id del cuidador.
     * @return una lista de cuidadores.
     */
    public List<Cuidador> recuperarIdCuidador(ObjectId idCuidador);

    /**
     * Metodo que permite agregar cuidadores en la base de datos.
     */
    public void agregarCuiadadores();

    /**
     * Metodo que permite recuperar las zonas existentes en la base de datos.
     *
     * @return Una lista con todas las zonas existentes.
     */
    public List<Zona> recuperaZonas();

    /**
     * Metodo que permite recuperar los guias existentes en la base de datos
     *
     * @return Una lista con todos los guias existentes
     */
    public List<Guia> recuperaGuias();

    /**
     * Metodo que permite recuperar los nombres de los itinerarios.
     *
     * @return Una lista con los itinerarios.
     */
    public List<Itinerario> recuperaNombreItinerario();

    /**
     * Metodo que permite buscar un itinerario por el nombre de la misma
     *
     * @param nombre Es el nombre del itinerario.
     * @return El itinerario que coincide con el nombre.
     */
    public Itinerario buscarItinerarioRecorrido(ObjectId id);

    /**
     * Metodo para guardar un itinerario en la base de datos.
     *
     * @param itinerario Es el itineario que se desea guardar.
     * @return El id generado del itinerario agregado.
     */
    public ObjectId guardarItinerario(Itinerario itinerario);
    /**
     * Metodo que permite guardar una queja en la base de datos.
     * @param queja Es la queja que se desea agregar.
     */
     public Queja guardarQueja(Queja queja);
     
    public void insertarHabitats();
    public void insertarZonas(Especie especie, Especie especie2, Especie especie3);
    public void insertarEspecies(Habitat habitat1,Habitat habitat2,Habitat habitat3);
    public void InsertarAnimales(Especie especie, Especie especie2, Especie especie3);
    public ObjectId insertarRecorrido(Recorrido recorrido);
    public List<Especie> recuperarTodasEspecies();
    public Recorrido recuperarRecorrido(String nombre);
    public Itinerario buscarItineario(String nombre );
    public void actualizarItineario(Itinerario itinerario);
    public void actualizarRecorrido(Recorrido recorrido);
    public void agregarGuia();
    public List<Itinerario> recuperarItinerarios();
}
