/**
* CtrlRegistrarQueja.java
* May 13, 2023 3:33:33 PM
*/ 

package itson.Control;

import Dominio.Animal;
import Dominio.Itinerario;
import Dominio.Queja;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import java.util.List;

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926 
 */
public class CtrlRegistrarQueja {
    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarQueja(){
        this.datos = FabricaDatos.crearInstancia();
    }

    public Queja guardar(Queja queja) {
         datos.guardarQueja(queja);
        return queja;
    }
    
    public List<Itinerario> recuperarItinerarios(){
        List<Itinerario> itinearios = datos.recuperarItinerarios();
        return itinearios;
    }
    
    
}
