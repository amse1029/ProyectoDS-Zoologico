package itson.Control;

/**
 * FachadaLogica.java May 8, 2023 11:42:32 PM
 */
import Dominio.Animal;
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
import java.util.LinkedList;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 *
 * @author 
 */
public class FachadaLogica implements ILogica {

    /**
     * Constructor por defecto.
     */
    public FachadaLogica() {

    }

    /**
     * Recupera los datos de los hábitats.
     * @return Una lista enlazada con los datos de los hábitats.
     */
    @Override
    public LinkedList<Object> recuperarDatosHabitats() {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();

        List<Continente> listaContinentes = control.recuperarContiente();
        List<Vegetacion> listaVegetaciones = control.recuperarVegetacion();
        List<Clima> listaClimas = control.recuperarClimas();

        LinkedList<Object> arreglo = new LinkedList<>();
        arreglo.add(0, listaContinentes);
        arreglo.add(1, listaVegetaciones);
        arreglo.add(2, listaClimas);

        return arreglo;
    }

    /**
     * Busca un hábitat por su nombre.
     * @param nombre El nombre del hábitat a buscar.
     * @return El hábitat encontrado.
     */
    @Override
    public Habitat buscarHabitat(String nombre) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Habitat habitat = new Habitat();
        habitat = control.buscarHabitat(nombre);
        return habitat;
    }

    /**
     * Guarda un hábitat.
     * @param habitat El hábitat a guardar.
     * @return true si se guardó correctamente, false en caso contrario.
     */
    @Override
    public Boolean guardarHabitat(Habitat habitat) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Boolean bandera;
        bandera = control.guardarHabitat(habitat);
        return bandera;
    }

    /**
     * Recupera una lista de cuidadores.
     * @return Una lista de cuidadores.
     */
    @Override
    public List<Cuidador> recuperarCuidadores() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Cuidador> cuidadores = control.recuperarCuidadores();
        return cuidadores;
    }

    /**
     * Recupera una lista de hábitats.
     * @return Una lista de hábitats.
     */
    @Override
    public List<Habitat> recuperarHabitats() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Habitat> habitats = control.recuperarHabitats();
        return habitats;

    }

    /**
     * Consulta si existe una especie por su nombre científico.
     * @param nombreCientifico El nombre científico de la especie a consultar.
     * @return true si la especie existe, false en caso contrario.
     */
    @Override
    public boolean consultaEspecieNombreCientifico(String nombreCientifico) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        boolean bandera = control.consultaEspecieNombreCientifico(nombreCientifico);
        return bandera;

    }

    /**
     * Consulta un animal por su nombre.
     * @param nombre El nombre del animal a consultar.
     * @return El animal encontrado.
     */
    @Override
    public Animal consultaAnimal(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Animal animal = control.consultaAnimal(nombre);
        return animal;
    }

    /**
     * Consulta una especie por su nombre.
     * @param nombre El nombre de la especie a consultar.
     * @return La especie encontrada.
     */
    @Override
    public Especie recuperarEspecie(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Especie especie = control.recuperarEspecie(nombre);
        return especie;

    }

    /**
     * Guarda una especie.
     * @param especie La especie a guardar.
     * @return Id de la especie guardada.
     */
    @Override
    public ObjectId guardarEspecie(Especie especie) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        ObjectId id = control.guardarEspecie(especie);
        return id;
    }

    /**
     * Recupera los datos de un itinerario.
     * @return Una lista enlazada con los datos del itinerario.
     */
    @Override
    public LinkedList<Object> recuperaDatosItinerario() {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        CtrlRegistrarHabitat controlHabitat = new CtrlRegistrarHabitat();
        CtrlRegistrarEspecie controlEspecie = new CtrlRegistrarEspecie();
        if (control.recuperarZonas().isEmpty()) {
            control.insertarHabitats();
            List<Habitat> habitats = controlHabitat.recuperarHabitats();
            control.insertarEspecies(habitats.get(0), habitats.get(1), habitats.get(2));
            List<Especie> especies = controlEspecie.recuperarEspecies();
            control.InsertarAnimales(especies.get(0), especies.get(1), especies.get(2));
            control.insertarZonas(especies.get(0), especies.get(1), especies.get(2));
        }
        List<Zona> listaZonas = control.recuperarZonas();
        List<Guia> listaGuias = control.recuperarGuias();
        LinkedList<Object> datos = new LinkedList<>();
        datos.add(listaZonas);
        datos.add(listaGuias);
        return datos;
    }

    /**
     * Busca un itinerario por su nombre.
     * @param nombre El nombre del itinerario a buscar.
     * @return El itinerario encontrado.
     */
    @Override
    public Itinerario buscarItinerario(String nombre) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        Itinerario itinerario = new Itinerario();
        itinerario = control.buscarItinerario(nombre);
        return itinerario;
    }

    /**
     * Guarda un itinerario junto con su recorrido.
     * @param itinerario El itinerario a guardar.
     * @param recorrido El recorrido asociado al itinerario.
     * @return El ID del itinerario guardado.
     */
    @Override
    public ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        return control.guardarItinerario(itinerario, recorrido);
    }

    /**
     * Recupera una lista de nombres de itinerarios.
     * @return Una lista de itinerarios.
     */
    @Override
    public List<Itinerario> recuperaNombreItinerarios() {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Itinerario> itinerarios = control.recuperaNombreItinerario();
        return itinerarios;
    }

    /**
     * Guarda una queja.
     * @param queja La queja a guardar.
     * @return El ID de la queja guardada.
     */
    @Override
    public ObjectId guardarQueja(Queja queja) {
        CtrlRegistrarQueja control = new CtrlRegistrarQueja();
        control.guardar(queja);
        return queja.getId();
    }

    /**
     * Busca un recorrido por su nombre.
     * @param nombre El nombre del recorrido a buscar.
     * @return El recorrido encontrado.
     */
    @Override
    public Recorrido buscarRecorrido(String nombre) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        Recorrido recorrido = control.buscarRecorrido(nombre);
        return recorrido;
    }

    /**
     * Actualiza un recorrido.
     * @param recorrido El recorrido a actualizar.
     */
    @Override
    public void actualizarRecorrido(Recorrido recorrido) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        control.actualizarRecorrido(recorrido);

    }

    /**
     * Actualiza un itinerario.
     * @param itinerario El itinerario a actualizar.
     */
    @Override
    public void actualizarItieneracio(Itinerario itinerario) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        control.actualizarItinerario(itinerario);
    }

    /**
     * Recupera una lista de itinerarios.
     * @return Una lista de itinerarios.
     */
    @Override
    public List<Itinerario> recuperarItinerarios() {
       CtrlRegistrarQueja control = new CtrlRegistrarQueja();
        List<Itinerario> itinerarios = control.recuperarItinerarios();
        return itinerarios;
    }

    /**
     * Recupera una lista de animales de una especie.
     * @param idEspecie El ID de la especie.
     * @return Una lista de animales.
     */
    @Override
    public List<Animal> recupearaAnimales(ObjectId idEspecie) {
     CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Animal> animales = control.recuperarAnimales(idEspecie);
        return animales;
    }

   
}
