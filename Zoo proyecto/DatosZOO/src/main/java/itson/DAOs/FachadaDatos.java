/**
 * FachadaDatos.java
 * May 8, 2023 6:39:22 PM
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
import Dominio.Vegetacion;
import Dominio.Zona;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class FachadaDatos implements IDatos {

    /**
     *
     */
    public FachadaDatos() {

    }

    @Override
    public List<Clima> recuperarClima() {
        ClimaDAO climaDAO = new ClimaDAO();
        List<Clima> climas = climaDAO.recupera();
        return climas;
    }

    @Override
    public void insertarClimas() {
        ClimaDAO climaDAO = new ClimaDAO();
        climaDAO.insertarClimas();
    }

    @Override
    public List<Continente> recuperarContinente() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        List<Continente> continentes = continenteDAO.recupera();
        return continentes;

    }

    @Override
    public void insertarContinentes() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        continenteDAO.insertarContinentes();
    }

    @Override
    public List<Vegetacion> recuperarVegetacion() {
        VegetacionDAO vegetacionDAO = new VegetacionDAO();
        List<Vegetacion> vegetaciones = vegetacionDAO.recupera();
        return vegetaciones;
    }

    @Override
    public void insertarVegetacion() {
        VegetacionDAO vegetacionDAO = new VegetacionDAO();
        vegetacionDAO.insertarVegetaciones();
    }

    @Override
    public Habitat buscarHabitat(String nombre) {
        Habitat habitat = new Habitat();
        HabitatDAO habitatDAO = new HabitatDAO();
        habitat = habitatDAO.buscarHabitat(nombre);
        return habitat;
    }

    @Override
    public boolean guardarHabitat(Habitat habitat) {
        Boolean bandera;
        HabitatDAO habitatDAO = new HabitatDAO();
        bandera = habitatDAO.guardarHabitat(habitat);
        return bandera;
    }

    @Override
    public List<Habitat> recuperarHabitats() {
        HabitatDAO habitatDAO = new HabitatDAO();
        List<Habitat> habitats = habitatDAO.recupera();
        return habitats;
    }

    @Override
    public List<Cuidador> recuperarCuidadores() {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        List<Cuidador> cuidadores = cuidadoresDAO.recuperar();
        return cuidadores;
    }

    @Override
    public List<Animal> recuperaAnimales(ObjectId idEspecie) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        List<Animal> animales = animalesDAO.recupera(idEspecie);
        return animales;
    }

    @Override
    public Animal consultaAnimal(String nombre) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        Animal animal = animalesDAO.consulta(nombre);
        return animal;
    }

    @Override
    public void guardarAnimal(Animal animal) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        animalesDAO.guardar(animal);
    }

    @Override
    public void eliminarAnimal(Animal animal) {
        AnimalesDAO animalesDAO = new AnimalesDAO();
        animalesDAO.eliminar(animal);
    }

    @Override
    public Especie recuperaEspecieNombre(String nombre) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        Especie especie = especiesDAO.recupera(nombre);
        return especie;
    }

    @Override
    public Especie buscarNombreCientificoEspecie(String nombreCientifico) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        Especie especie = especiesDAO.buscarNombreCientifico(nombreCientifico);
        return especie;
    }

    @Override
    public ObjectId guardarEspecie(Especie especie) {
        EspeciesDAO especiesDAO = new EspeciesDAO();
        ObjectId idEspecie = especiesDAO.guardar(especie);
        return idEspecie;
    }

    @Override
    public ObjectId actualizarEspecie(Especie especie) {
        ObjectId idEspecie;
        EspeciesDAO especiesDAO = new EspeciesDAO();
        idEspecie = especiesDAO.actualizar(especie);
        return idEspecie;
    }

    @Override
    public void guardarCargoEspecie(CargoEspecie cargoEspecie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        cargoEspecieDAO.guardar(cargoEspecie);
    }

    @Override
    public void eliminarCargoEspecie(CargoEspecie cargoEspecie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        cargoEspecieDAO.eliminar(cargoEspecie);
    }

    @Override
    public List<CargoEspecie> consultaEspeciesCargoEspecie(Especie especie) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        List<CargoEspecie> listaCargoEspecies = cargoEspecieDAO.consultaEspecies(especie);
        return listaCargoEspecies;
    }

    @Override
    public List<Cuidador> recuperarIdCuidador(ObjectId idCuidador) {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        List<Cuidador> cuidadores = cuidadoresDAO.recuperarId(idCuidador);
        return cuidadores;
    }

    @Override
    public void agregarCuiadadores() {
        CuidadoresDAO cuidadoresDAO = new CuidadoresDAO();
        cuidadoresDAO.agregarCuiadadores();
    }

    @Override
    public List<CargoEspecie> consultaCuidadorCargoEspecie(Cuidador cuidador) {
        CargoEspecieDAO cargoEspecieDAO = new CargoEspecieDAO();
        List<CargoEspecie> listaCargoEspecies = cargoEspecieDAO.consultaCuidador(cuidador);
        return listaCargoEspecies;

    }

    @Override
    public List<Zona> recuperaZonas() {
        ZonaDAO zonaDAO= new ZonaDAO();
       List<Zona> listaZonas=zonaDAO.recuperar();
       return listaZonas;
    }

    @Override
    public List<Guia> recuperaGuias() {
        GuiaDAO guiaDAO = new GuiaDAO();
        List<Guia>listaGuias=guiaDAO.recuperar();
        return listaGuias;
    }

    @Override
    public List<Itinerario> recuperaNombreItinerario() {
        ItinerarioDAO itinerarioDAO= new ItinerarioDAO();
        List<Itinerario> listaItinerarios= itinerarioDAO.recupera();
        return listaItinerarios;
    }

}
