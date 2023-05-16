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
     * Método que recupera los datos de las hábitats existentes.
     * @return Lista con todos los datos de las hábitats.
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
     * Método que busca un hábitat por su nombre.
     * @param nombre Nombre del hábitat que se quiere buscar.
     * @return Habitat que se encontró.
     */
    @Override
    public Habitat buscarHabitat(String nombre) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Habitat habitat = new Habitat();
        habitat = control.buscarHabitat(nombre);
        return habitat;
    }

    /**
     * Método que guarda un hábitat.
     * @param habitat Hábitat que se quiere guardar.
     * @return true en caso de haber guardado, false en caso contrario.
     */
    @Override
    public Boolean guardarHabitat(Habitat habitat) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Boolean bandera;
        bandera = control.guardarHabitat(habitat);
        return bandera;
    }

    /**
     * Método que recupera los cuidadores existentes.
     * @return Lista de cuidadores
     */
    @Override
    public List<Cuidador> recuperarCuidadores() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Cuidador> cuidadores = control.recuperarCuidadores();
        return cuidadores;
    }

    /**
     * Método que recupera las hábitats existentes.
     * @return Lista de hábitats.
     */
    @Override
    public List<Habitat> recuperarHabitats() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Habitat> habitats = control.recuperarHabitats();
        return habitats;

    }

    /**
     * Método que consulta una especie por su nombre científico.
     * @param nombreCientifico Nombre científico por el cual se quiere buscar.
     * @return true en caso de encontrarse, false en caso contrario.
     */
    @Override
    public boolean consultaEspecieNombreCientifico(String nombreCientifico) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        boolean bandera = control.consultaEspecieNombreCientifico(nombreCientifico);
        return bandera;

    }

    /**
     * Método que consulta un animal.
     * @param nombre Nombre del animal que se quiere consultar.
     * @return Animal consultado.
     */
    @Override
    public Animal consultaAnimal(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Animal animal = control.consultaAnimal(nombre);
        return animal;
    }

    /**
     * Método que recupera una especie.
     * @param nombre Nombre de la especie que se quiere recuperar.
     * @return Especie recuperada.
     */
    @Override
    public Especie recuperarEspecie(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Especie especie = control.recuperarEspecie(nombre);
        return especie;

    }

    /**
     * Método que guarda una especie.
     * @param especie Especie que se quiere guardar.
     * @return Id de la especie guardada.
     */
    @Override
    public ObjectId guardarEspecie(Especie especie) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        ObjectId id = control.guardarEspecie(especie);
        return id;
    }

    /**
     * Método que recupera los datos de un itinerario.
     * @return Arreglo con los datos de un itinerario.
     */
    @Override
    public Object[] recuperaDatosItinerario() {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Zona> listaZonas = control.recuperarZonas();
        List<Guia> listaGuias = control.recuperarGuias();
        Object[] datos = new Object[2];
        datos[0] = listaZonas;
        datos[1] = listaGuias;
        return datos;
    }

    /**
     * Método que busca un itinerario por su nombre.
     * @param nombre Nombre del itinerario que se quiere buscar.
     * @return Itinerario encontrado.
     */
    @Override
    public Itinerario buscarItinerario(String nombre) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        Itinerario itinerario = new Itinerario();
        itinerario = control.buscarItinerario(nombre);
        return itinerario;
    }

    /**
     * Método que guarda un itinerario.
     * @param itinerario Itinerario que se quiere guardar.
     * @return Id del itinerario guardado.
     */
    @Override
    public ObjectId guardarItinerario(Itinerario itinerario) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        return control.guardarItinerario(itinerario);
    }

    /**
     * Método que recupera los nombres de los itinerarios existentes.
     * @return Lista de itinerarios
     */
    @Override
    public List<Itinerario> recuperaNombreItinerarios() {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Itinerario> itinerarios=control.recuperaNombreItinerario();
        return itinerarios;
    }

    /**
     * Método que guarda una queja.
     * @param queja Queja que se quiere guardar.
     * @return Id de la queja guardada.
     */
    @Override
    public ObjectId guardarQueja(Queja queja) {
        CtrlRegistrarQueja control= new CtrlRegistrarQueja();
        return control.guardar(queja);
    }
    
}
