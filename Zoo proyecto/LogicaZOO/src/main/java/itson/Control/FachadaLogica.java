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
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class FachadaLogica implements ILogica {

    /**
     *
     */
    public FachadaLogica() {

    }

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

    @Override
    public Habitat buscarHabitat(String nombre) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Habitat habitat = new Habitat();
        habitat = control.buscarHabitat(nombre);
        return habitat;
    }

    @Override
    public Boolean guardarHabitat(Habitat habitat) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Boolean bandera;
        bandera = control.guardarHabitat(habitat);
        return bandera;
    }

    @Override
    public List<Cuidador> recuperarCuidadores() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Cuidador> cuidadores = control.recuperarCuidadores();
        return cuidadores;
    }

    @Override
    public List<Habitat> recuperarHabitats() {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        List<Habitat> habitats = control.recuperarHabitats();
        return habitats;

    }

    @Override
    public boolean consultaEspecieNombreCientifico(String nombreCientifico) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        boolean bandera = control.consultaEspecieNombreCientifico(nombreCientifico);
        return bandera;

    }

    @Override
    public Animal consultaAnimal(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Animal animal = control.consultaAnimal(nombre);
        return animal;
    }

    @Override
    public Especie recuperarEspecie(String nombre) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        Especie especie = control.recuperarEspecie(nombre);
        return especie;

    }

    @Override
    public ObjectId guardarEspecie(Especie especie) {
        CtrlRegistrarEspecie control = new CtrlRegistrarEspecie();
        ObjectId id = control.guardarEspecie(especie);
        return id;
    }

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

    @Override
    public Itinerario buscarItinerario(String nombre) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        Itinerario itinerario = new Itinerario();
        itinerario = control.buscarItinerario(nombre);
        return itinerario;
    }

    @Override
    public ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        return control.guardarItinerario(itinerario, recorrido);
    }

    @Override
    public List<Itinerario> recuperaNombreItinerarios() {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Itinerario> itinerarios = control.recuperaNombreItinerario();
        return itinerarios;
    }

    @Override
    public ObjectId guardarQueja(Queja queja) {
        CtrlRegistrarQueja control = new CtrlRegistrarQueja();
        control.guardar(queja);
        return queja.getId();
    }

    @Override
    public Recorrido buscarRecorrido(String nombre) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        Recorrido recorrido = control.buscarRecorrido(nombre);
        return recorrido;
    }

    @Override
    public void actualizarRecorrido(Recorrido recorrido) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        control.actualizarRecorrido(recorrido);

    }

    @Override
    public void actulizarItieneracio(Itinerario itinerario) {
        CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        control.actualizarItinerario(itinerario);
    }

    @Override
    public List<Itinerario> recuperarItinerarios() {
       CtrlRegistrarQueja control = new CtrlRegistrarQueja();
        List<Itinerario> itinerarios = control.recuperarItinerarios();
        return itinerarios;
    }

    @Override
    public List<Animal> recupearaAnimales(ObjectId idEspecie) {
     CtrlRegistrarItinerario control = new CtrlRegistrarItinerario();
        List<Animal> animales = control.recuperarAnimales(idEspecie);
        return animales;
    }

   
}
