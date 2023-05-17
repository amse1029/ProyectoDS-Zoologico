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
import itson.DAOs.ItinerarioDAO;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
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
    public List<Zona> recuperarZonas() {
        List<Zona> zonas = new LinkedList<>();
        zonas = datos.recuperaZonas();
        return zonas;
    }

    /**
     * Método que recupera los guías.
     *
     * @return Lista de guías.
     */
    public List<Guia> recuperarGuias() {
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
    public ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido) {

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
    public Itinerario buscarItinerario(String nombre) {

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
    List<Itinerario> recuperaNombreItinerario() {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        return itinerarioDAO.recupera();
    }

    /**
     * Método que inserta hábitats.
     */
    public void insertarHabitats() {
        datos.insertarHabitats();
    }

    /**
     * Método que inserta zonas.
     */
    public void insertarZonas(Especie especie, Especie especie2, Especie especie3) {
        datos.insertarZonas(especie, especie2, especie3);
    }

    /**
     * Método que inserta especies.
     */
    public void insertarEspecies(Habitat habitat1, Habitat habitat2, Habitat habitat3) {
        datos.insertarEspecies(habitat1, habitat2, habitat3);
    }

    /**
     * Método que inserta animales.
     */
    public void InsertarAnimales(Especie especie, Especie especie2, Especie especie3) {
        datos.InsertarAnimales(especie, especie2, especie3);
    }

    /**
     * Método que inserta un recorrido.
     *
     * @param recorrido Recorrido que se quiere insertar.
     * @return Id del recorrido insertado.
     */
    public ObjectId insertarRecorrido(Recorrido recorrido) {
        datos.insertarRecorrido(recorrido);
        return recorrido.getId();
    }

    /**
     * Método que busca a un recorrido por su nombre.
     *
     * @param nombre Nombre del recorrido que se quiere buscar.
     * @return Recorrido encontrado.
     */
    public Recorrido buscarRecorrido(String nombre) {
        Recorrido recorrido = datos.recuperarRecorrido(nombre);
        return recorrido;
    }

    /**
     * Método que actualiza un itinerario.
     *
     * @param itinerario Itinerario que se quiere actualizar.
     */
    public void actualizarItinerario(Itinerario itinerario) {
        datos.actualizarItineario(itinerario);
    }

    /**
     * Método que actualiza un recorrido.
     *
     * @param recorrido Recorrido que se quiere actualizar.
     */
    public void actualizarRecorrido(Recorrido recorrido) {
        datos.actualizarRecorrido(recorrido);
    }

    List<Animal> recuperarAnimales(ObjectId idEspecie) {
        return datos.recuperaAnimales(idEspecie);
    }
    

}
