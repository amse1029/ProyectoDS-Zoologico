/**
* FabricaDatos.java
* May 8, 2023 11:06:01 PM
*/ 

package itson.DAOs;

/**
 * Clase que permite generar la instancia necesaria para comunicarse con la 
 * fachada
 * @author Joel Antonio Lopez Cota ID:228926 
 */
public class FabricaDatos {

    /**
     * Metodo que permite crear una instancia de la fachadaDatos.
     * @return la fachada datos.
     */
    public static IDatos crearInstancia(){
        return new FachadaDatos();
    }
}
