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

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class CtrlRegistrarItinerario {

    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarItinerario() {
        this.datos = FabricaDatos.crearInstancia();

    }

    public List<Zona> recuperarZonas() {
        List<Zona> zona = new LinkedList<>();
        zona = datos.recuperaZonas();
    }

    public List<Guia> recuperarGuias() {
        List<Guia> guias = new LinkedList<>();
        guias = datos.recuperaGuias();
    }

    public Boolean guardarItinerario(Itinerario itinerario) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        itinerarioDAO.guardar(itinerario);
    }

    Itinerario buscarItinerario(String nombre) {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        Itinerario itinerario = itinerarioDAO.buscar(nombre);
        return itinerario;
    }
}
