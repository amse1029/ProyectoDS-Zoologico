/**
* CtrlRegistrarQueja.java
* May 13, 2023 3:33:33 PM
*/ 

package itson.Control;

import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;

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
    
}
