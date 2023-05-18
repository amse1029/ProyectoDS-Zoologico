/**
* CtrlRegistrarQueja.java
* May 13, 2023 3:33:33 PM
*/ 
package itson.Control;

import Dominio.Itinerario;
import Dominio.Queja;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import java.util.List;

/**
 * Clase que permite controlar los metodos de registrar queja.
 *
 * @author
 */
public class CtrlRegistrarQueja {

    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarQueja() {
        this.datos = FabricaDatos.crearInstancia();
    }

    /**
     * Método que guarda una queja.
     *
     * @param queja Queja que se quiere guardar.
     * @return Queja que se guardó.
     */
    protected Queja guardar(Queja queja) {
        datos.guardarQueja(queja);
        return queja;
    }

    /**
     * Método que recupera una lista de los itinerarios existentes.
     *
     * @return Lista de itinerarios.
     */
    protected List<Itinerario> recuperarItinerarios() {
        List<Itinerario> itinearios = datos.recuperarItinerarios();
        return itinearios;
    }
}
