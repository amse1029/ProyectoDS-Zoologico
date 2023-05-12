/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.Control;

/**
 *
 * @author julio
 */
public class FabricaLogica {
    
    
    public static ILogica crearInstancia(){
        return new FachadaLogica();
    }
}
