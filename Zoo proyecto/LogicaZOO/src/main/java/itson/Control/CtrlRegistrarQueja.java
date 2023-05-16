/**
* CtrlRegistrarQueja.java
* May 13, 2023 3:33:33 PM
*/ 

package itson.Control;

import Dominio.Queja;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import itson.DAOs.QuejaDAO;
import org.bson.types.ObjectId;

/**
 *
 * 
 * @author 
 */
public class CtrlRegistrarQueja {
    
    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarQueja(){
        this.datos = FabricaDatos.crearInstancia();
    }

    /**
     * Método que guarda una queja.
     * @param queja Queja que se quiere guardar.
     * @return Id de la queja guardada.
     */
    public ObjectId guardar(Queja queja) {
        QuejaDAO quejaDAO = new QuejaDAO();
        return quejaDAO.guardarQueja(queja);
    }
    
    
    
}
