/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.Control;

/**
 *
 * @author 
 */
public class FabricaLogica {
    
    /**
     * Crea y devuelve una instancia de la lógica de la aplicación.
     *
     * @return Instancia de la interfaz ILogica que representa la lógica de la aplicación.
     */
    public static ILogica crearInstancia(){
        return new FachadaLogica();
    }
}
