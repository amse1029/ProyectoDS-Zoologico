/**
 * FachadaDatos.java
 * May 8, 2023 6:39:22 PM
 */
package itson.DAOs;

import Dominio.*;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar los metodos de las daos.
 *
 * @author 
 */
public class FachadaDatos implements IDatos {

    /**
     * Metodo constructo vacio.
     */
    public FachadaDatos() {

    }

    /**
     * Metodo que permite recuperar los climas exitentes en la base de datos.
     *
     * @return Una lista con los climas existentes.
     */
    @Override
    public List<Clima> recuperarClima() {
        ClimaDAO climaDAO = new ClimaDAO();
        List<Clima> climas = climaDAO.recupera();
        return climas;
    }

    /**
     * Metodo que permite insertar los climas en la base de datos.
     */
    @Override
    public void insertarClimas() {
        ClimaDAO climaDAO = new ClimaDAO();
        climaDAO.insertarClimas();
    }

    /**
     * Metodo que permite recuperar todos los continentes existentes en la base
     * de datos
     *
     * @return Una lista con los continentes existentes.
     */
    @Override
    public List<Continente> recuperarContinente() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        List<Continente> continentes = continenteDAO.recupera();
        return continentes;

    }

    /**
     * Metodo que permite insertar los continentes en la base de datos.
     */
    @Override
    public void insertarContinentes() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        continenteDAO.insertarContinentes();
    }

    /**
     * Metodo que permite recuperar las vegetaciones existentes en la base de
     * datos.
     *
     * @return Una lista con todas las vegetaciones existentes.
     */
    @Override
    public List<Vegetacion> recuperarVegetacion() {
        VegetacionDAO vegetacionDAO = new VegetacionDAO();
        List<Vegetacion> vegetaciones = vegetacionDAO.recupera();
        return vegetaciones;
    }

    /**
     * Metodo que permite insertar las vegetaciones en la base de datos.
     */
    @Override
    public void insertarVegetacion() {
        VegetacionDAO vegetacionDAO = new VegetacionDAO();
        vegetacionDAO.insertarVegetaciones();
    }

    /**
     * Metodo que permite buscar un habitat por su nombre.
     *
     * @param nombre Es el nombre del habitar.
     * @return El habitat que concuerda con el nombre.
     */
    @Override
    public Habitat buscarHabitat(String nombre) {
        Habitat habitat = new Habitat();
        HabitatDAO habitatDAO = new HabitatDAO();
        habitat = habitatDAO.buscarHabitat(nombre);
        return habitat;
    }

    /**
     * Metodo que permite guardar un habitat.
     *
     * @param habitat Es el habitat que se desea guardar.
     * @return true si se pudo guardar, false en caso contrario.
     */
    @Override
    public boolean guardarHabitat(Habitat habitat) {
        Boolean bandera;
        HabitatDAO habitatDAO = new HabitatDAO();
        bandera = habitatDAO.guardarHabitat(habitat);
        return bandera;
    }

    /**
     * Metodo que permite recuperar los habitats existentes en la base de datos.
     *
     * @return Una lista con todos los habitats existentes.
     */
    @Override
    public List<Habitat> recuperarHabitats() {
        HabitatDAO habitatDAO = new HabitatDAO();
        List<Habitat> habitats = habitatDAO.recupera();
        return habitats;
    }

    /**
     * Metodo que permite recuperar los cuidadores existentes en la base de
     * datos.
     *
     * @return Una lista con todos los cuidadores existentes.
     */
    @Override
    public List<Cuidador> recuperarCuidadores() {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        List<Cuidador> cuidadores = cuidadoresDAO.recuperar();
        return cuidadores;
    }

    /**
     * Metodo que permite recuperar los animales que cuenten con el id de
     * especie del parametro.
     *
     * @param idEspecie Es el id de la especie.
     * @return Una lista con todas las coincidencias.
     */
    @Override
    public List<Animal> recuperaAnimales(ObjectId idEspecie) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        List<Animal> animales = animalesDAO.recupera(idEspecie);
        return animales;
    }

    /**
     * Metodo que permite consultar el animal que cuenta con el mismo nombre.
     *
     * @param nombre Es el nombre del animal.
     * @return El animal que coincida con el nombre.
     */
    @Override
    public Animal consultaAnimal(String nombre) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        Animal animal = animalesDAO.consulta(nombre);
        return animal;
    }

    /**
     * Metodo que permite guardar un animal en la base de datos.
     *
     * @param animal Es el animal que se desea guardar.
     */
    @Override
    public void guardarAnimal(Animal animal) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        animalesDAO.guardar(animal);
    }

    /**
     * Metodo que permite eliminar un animal de la base de datos.
     *
     * @param animal Es el animal que se desea eliminar.
     */
    @Override
    public void eliminarAnimal(Animal animal) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        animalesDAO.eliminar(animal);
    }

    /**
     * Metodo que permite recuperar la especie que cuente con el nombre dado en
     * el parametro.
     *
     * @param nombre Es el nombre de la especie.
     * @return La especie que cuente con el nombre del parametro.
     */
    @Override
    public Especie recuperaEspecieNombre(String nombre) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        Especie especie = especiesDAO.recupera(nombre);
        return especie;
    }

    /**
     * Metodo que permite buscar una especie por su nombre cientifico.
     *
     * @param nombreCientifico Es el nombre cientifico de la especie.
     * @return La especie que cuente con el nombre cientifico del parametro.
     */
    @Override
    public Especie buscarNombreCientificoEspecie(String nombreCientifico) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        Especie especie = especiesDAO.buscarNombreCientifico(nombreCientifico);
        return especie;
    }

    /**
     * Metodo que permite guardar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea guardar.
     * @return Es el id que se genero al guardarlo.
     */
    @Override
    public ObjectId guardarEspecie(Especie especie) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        ObjectId idEspecie = especiesDAO.guardar(especie);
        return idEspecie;
    }

    /**
     * Metodo que permite actualizar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea actualizar.
     * @return Es el id de la especie que se actualizo.
     */
    @Override
    public ObjectId actualizarEspecie(Especie especie) {
        ObjectId idEspecie;
        EspeciesDAO especiesDAO = new EspeciesDAO();
        idEspecie = especiesDAO.actualizar(especie);
        return idEspecie;
    }

    /**
     * Metodo que permite guardar el cuidador que esta a cargo de la especie.
     *
     * @param cargoEspecie Es el cuidador que esta a cargo de la especie.
     */
    @Override
    public void guardarCargoEspecie(CargoEspecie cargoEspecie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        cargoEspecieDAO.guardar(cargoEspecie);
    }

    /**
     * Metodo uqe permite eliminar el cargo que tiene un cuidador a una especie.
     *
     * @param cargoEspecie Es quien esta a cargo de la especie que se desea
     * elimnar.
     */
    @Override
    public void eliminarCargoEspecie(CargoEspecie cargoEspecie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        cargoEspecieDAO.eliminar(cargoEspecie);
    }

    /**
     * Metodo que permite consultar todos los cuidadores ques estan a cargo de
     * una especie.
     *
     * @param especie Es la especie de la cual se quieren obtener los cargos.
     * @return Una lista con todos los que estan a cargo de una especie.
     */
    @Override
    public List<CargoEspecie> consultaEspeciesCargoEspecie(Especie especie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        List<CargoEspecie> listaCargoEspecies = cargoEspecieDAO.consultaEspecies(especie);
        return listaCargoEspecies;
    }

    /**
     * Metodo que permite consultar todas las especies que tiene a cargo un
     * cuidador.
     *
     * @param cuidador Es el cuidador del que se desean obtener los cargos.
     * @return Una lista de los cargos que tiene el cuidador.
     */
    @Override
    public List<Cuidador> recuperarIdCuidador(ObjectId idCuidador) {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        List<Cuidador> cuidadores = cuidadoresDAO.recuperarId(idCuidador);
        return cuidadores;
    }

    /**
     * Metodo que permite agregar cuidadores en la base de datos.
     */
    @Override
    public void agregarCuiadadores() {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        cuidadoresDAO.agregarCuiadadores();
    }

    /**
     * Metodo que permite recuperar el cuidador que tiene el mismo id.
     *
     * @param idCuidador Es el id del cuidador.
     * @return una lista de cuidadores.
     */
    @Override
    public List<CargoEspecie> consultaCuidadorCargoEspecie(Cuidador cuidador) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        List<CargoEspecie> listaCargoEspecies = cargoEspecieDAO.consultaCuidador(cuidador);
        return listaCargoEspecies;

    }

    /**
     * Metodo que permite recuperar las zonas existentes en la base de datos.
     *
     * @return Una lista con todas las zonas existentes.
     */
    @Override
    public List<Zona> recuperaZonas() {
        ZonaDAO zonaDAO = new ZonaDAO();
        List<Zona> listaZonas = zonaDAO.recuperar();
        return listaZonas;
    }

    /**
     * Metodo que permite recuperar los guias existentes en la base de datos
     *
     * @return Una lista con todos los guias existentes
     */
    @Override
    public List<Guia> recuperaGuias() {
        GuiaDAO guiaDAO = new GuiaDAO();
        List<Guia> listaGuias = guiaDAO.recuperar();
        return listaGuias;
    }

    /**
     * Metodo que permite recuperar los nombres de los itinerarios.
     *
     * @return Una lista con los itinerarios.
     */
    @Override
    public List<Itinerario> recuperaNombreItinerario() {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        List<Itinerario> listaItinerarios = itinerarioDAO.recupera();
        return listaItinerarios;
    }

    /**
     * Metodo que permite buscar un itinerario por el nombre de la misma
     *
     * @param nombre Es el nombre del itinerario.
     * @return El itinerario que coincide con el nombre.
     */
    @Override
    public Itinerario buscarItinerario(String nombre) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        return itinerarioDAO.buscar(nombre);
    }

    /**
     * Metodo para guardar un itinerario en la base de datos.
     *
     * @param itinerario Es el itineario que se desea guardar.
     * @return El id generado del itinerario agregado.
     */
    @Override
    public ObjectId guardarItinerario(Itinerario itinerario) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
       return itinerarioDAO.guardar(itinerario);
    }

    /**
     * Metodo que permite guardar una queja en la base de datos.
     *
     * @param queja Es la queja que se desea agregar.
     */
    @Override
    public void guardarQueja(Queja queja) {
       QuejaDAO quejaDAO= new QuejaDAO();
       quejaDAO.guardarQueja(queja);
    }

}
