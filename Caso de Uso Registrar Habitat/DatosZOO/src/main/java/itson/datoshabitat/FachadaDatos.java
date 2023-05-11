/**
* FachadaDatos.java
* May 8, 2023 6:39:22 PM
*/ 

package itson.datoshabitat;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import itson.Interfaces.IDatos;

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926 
 */
public class FachadaDatos implements IDatos {

    /**
     * 
     */
    public FachadaDatos(){

    }

    @Override
    public Clima recuperarClima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Continente recuperarContinente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vegetacion recuperarVegetacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Habitat buscarHabitat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void guardarHabitat(Habitat habitat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
