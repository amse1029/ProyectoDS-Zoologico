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
 * @author 
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
     * Metodo que permite buscar un itinerario por el id de la misma.
     *
     * @param id es el id del itinerario
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
     * @return la queja agregada
     */
     public Queja guardarQueja(Queja queja);
    /**
     * Metodo que permite insertar los habitats en la base de datos.
     */
    public void insertarHabitats();
    /**
     * Metodo que permite insertar especies en zonas.
     * @param especie es la especie 1 a agregar.
     * @param especie2 es la especie 2 a agregar.
     * @param especie3 es la especie 3 a agregar.
     */
    public void insertarZonas(Especie especie, Especie especie2, Especie especie3);
    /**
     * Metodo que permite insertar especies en habitat.
     * @param habitat1 es el habitat 1 a agregar.
     * @param habitat2 es el habitat 2 a agregar.
     * @param habitat3 es el habitat 3 a agregar.
     */
    public void insertarEspecies(Habitat habitat1,Habitat habitat2,Habitat habitat3);
    /**
     * Metodo que permite insertar animales en especies.
     * @param especie especie 1 a agregar.
     * @param especie2 especie 2 a agregar.
     * @param especie3 especie 3 a agregar.
     */
    public void InsertarAnimales(Especie especie, Especie especie2, Especie especie3);
    /**
     * Metodoo que permite insertar un recorrido en la base de datos.
     * @param recorrido es el recorrido a agregar.
     * @return el id del recorrido agregado.
     */
    public ObjectId insertarRecorrido(Recorrido recorrido);
    /**
     * Metodo que permite recuperar todas las especies existentes en la base de datos.
     * @return la lista con todos las especies.
     */
    public List<Especie> recuperarTodasEspecies();
    /**
     * Metodo que recupera el recorrido con el nombre dado por el parametro.
     * @param nombre es el nombre del recorrido.
     * @return el recorrido que se recupero.
     */
    public Recorrido recuperarRecorrido(String nombre);
    /**
     * Metodo que busca un itinerario por el nombre del parametro.
     * @param nombre es el nombre del itinerario.
     * @return el itinerario buscado
     */
    public Itinerario buscarItineario(String nombre );
    /**
     * Metodo que permite actualizar un itinerario.
     * @param itinerario es el itinerario a actualizar.
     */
    public void actualizarItineario(Itinerario itinerario);
    /**
     * Metodo que permite actualizar un recorrido.
     * @param recorrido es el itinerario a actualizar.
     */
    public void actualizarRecorrido(Recorrido recorrido);
    /**
     * Metodo que permite agregar guias en la base de datos.
     */
    public void agregarGuia();
    /**
     * Metodo que permite recuperar los itinerarios existentes en la base de datos.
     * @return una lista con todos los itinerarios.
     */
    public List<Itinerario> recuperarItinerarios();
}
