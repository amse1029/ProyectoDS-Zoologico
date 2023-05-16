/**
 * CtrlRegistrarItinerario.java
 * May 13, 2023 3:33:04 PM
 */
package itson.Control;

import Dominio.Guia;
import Dominio.Itinerario;
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
     * Método que recupera las zonas existentes.
     * @return Lista de zonas.
     */
    public List<Zona> recuperarZonas() {
        List<Zona> zonas = new LinkedList<>();
        zonas = datos.recuperaZonas();
        return zonas;
    }

    /**
     * Método que recupera los guías existentes.
     * @return Lista de guías
     */
    public List<Guia> recuperarGuias() {
        List<Guia> guias = new LinkedList<>();
        guias = datos.recuperaGuias();
        return guias;
    }

    /**
     * Método que guarda un itinerario.
     * @param itinerario Itinerario que se quiere guardar.
     * @return Id del itinerario guardado.
     */
    public ObjectId guardarItinerario(Itinerario itinerario) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
      return itinerarioDAO.guardar(itinerario);
    }

    /**
     * Método que busca un itinerario por su nombre.
     * @param nombre Nombre del itinerario que se quiere buscar.
     * @return Itinerario encontrado.
     */
    public Itinerario buscarItinerario(String nombre) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        Itinerario itinerario = itinerarioDAO.buscar(nombre);
        return itinerario;
    }

    /**
     * Método que recupera las nombres de los itinerarios existentes.
     * @return Lista de itinerarios
     */
    List<Itinerario> recuperaNombreItinerario() {
        ItinerarioDAO itinerarioDAO= new ItinerarioDAO();
       return itinerarioDAO.recupera();
    }
}
