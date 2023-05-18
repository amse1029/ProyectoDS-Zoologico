/**
 * CtrlRegistrarItinerario.java
 * May 13, 2023 3:33:04 PM
 */
package itson.Control;

import Dominio.Animal;
import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.Recorrido;
import Dominio.Zona;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
  * Clase que permite controlar los metodos de registrar itinerario.
 *
 * @author
 */
public class CtrlRegistrarItinerario {

    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarItinerario() {
        this.datos = FabricaDatos.crearInstancia();

    }

    /**
     * Método que recupera las zonas.
     *
     * @return Lista de zonas.
     */
    protected List<Zona> recuperarZonas() {
        List<Zona> zonas = new LinkedList<>();
        zonas = datos.recuperaZonas();
        return zonas;
    }

    /**
     * Método que recupera los guías.
     *
     * @return Lista de guías.
     */
    protected List<Guia> recuperarGuias() {
        List<Guia> guias = new LinkedList<>();
        guias = datos.recuperaGuias();
        if (guias.isEmpty()) {
            datos.agregarGuia();
            guias = datos.recuperaGuias();
        }
        return guias;
    }

    /**
     * Método que guarda un itinerario.
     *
     * @param itinerario Itinerario que se quiere guardar.
     * @param recorrido Recorrido del itinerario que se quiere guardar.
     * @return Id del itinerario.
     */
    protected ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido) {

        if (recorrido.getId() != null) {
            this.actualizarRecorrido(recorrido);
        } else {
            datos.insertarRecorrido(recorrido);
        }
        if (itinerario.getId() != null) {
            itinerario.setRecorridoId(recorrido.getId());
            this.actualizarItinerario(itinerario);
            return itinerario.getId();
        } else {
            itinerario.setRecorridoId(recorrido.getId());
            return datos.guardarItinerario(itinerario);
        }
    }

    /**
     * Método que busca un itinerario por su nombre.
     *
     * @param nombre Nombre del itinerario a buscar.
     * @return Itinerario encontrado.
     */
    protected Itinerario buscarItinerario(String nombre) {

        Recorrido recorrido = datos.recuperarRecorrido(nombre);

        Itinerario itinerario = datos.buscarItineario(nombre);
        if (itinerario == null) {
            return itinerario;
        } else {
            itinerario.setRecorrido(recorrido);

            return itinerario;
        }
    }

    /**
     * Método que recupera los nombres de los itinerarios.
     *
     * @return Lista de itinerarios.
     */
    protected List<Itinerario> recuperaNombreItinerario() {
        List<Itinerario> itinerarios = new LinkedList<>();
        itinerarios = datos.recuperaNombreItinerario();
        return itinerarios;
    }

    /**
     * Método que inserta hábitats.
     */
    protected void insertarHabitats() {
        datos.insertarHabitats();
    }

    /**
     * Método que inserta zonas.
     */
    protected void insertarZonas(Especie especie, Especie especie2, Especie especie3) {
        datos.insertarZonas(especie, especie2, especie3);
    }

    /**
     * Método que inserta especies.
     */
    protected void insertarEspecies(Habitat habitat1, Habitat habitat2, Habitat habitat3) {
        datos.insertarEspecies(habitat1, habitat2, habitat3);
    }

    /**
     * Método que inserta animales.
     */
    protected void InsertarAnimales(Especie especie, Especie especie2, Especie especie3) {
        datos.InsertarAnimales(especie, especie2, especie3);
    }

    /**
     * Método que inserta un recorrido.
     *
     * @param recorrido Recorrido que se quiere insertar.
     * @return Id del recorrido insertado.
     */
    protected ObjectId insertarRecorrido(Recorrido recorrido) {
        datos.insertarRecorrido(recorrido);
        return recorrido.getId();
    }

    /**
     * Método que busca a un recorrido por su nombre.
     *
     * @param nombre Nombre del recorrido que se quiere buscar.
     * @return Recorrido encontrado.
     */
    protected Recorrido buscarRecorrido(String nombre) {
        Recorrido recorrido = datos.recuperarRecorrido(nombre);
        return recorrido;
    }

    /**
     * Método que actualiza un itinerario.
     *
     * @param itinerario Itinerario que se quiere actualizar.
     */
    protected void actualizarItinerario(Itinerario itinerario) {
        datos.actualizarItineario(itinerario);
    }

    /**
     * Método que actualiza un recorrido.
     *
     * @param recorrido Recorrido que se quiere actualizar.
     */
    protected void actualizarRecorrido(Recorrido recorrido) {
        datos.actualizarRecorrido(recorrido);
    }

    /**
     * Metodo que permite recuperar los animales mediante el id de la especie
     * @param idEspecie es el id de la especie
     * @return una lista de animales con los datos.
     */
    protected List<Animal> recuperarAnimales(ObjectId idEspecie) {
        return datos.recuperaAnimales(idEspecie);
    }

}
