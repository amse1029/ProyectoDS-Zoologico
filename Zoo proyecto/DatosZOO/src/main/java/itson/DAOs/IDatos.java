/**
* IDatos.java
* May 8, 2023 6:39:56 PM
*/ 

package itson.DAOs;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import java.util.List;

/**
 * Descripción de la interface: 
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface IDatos {

    public List<Clima> recuperarClima();
    public void insertarClimas();
    public List<Continente> recuperarContinente();
    public void insertarContinentes();
    public List<Vegetacion> recuperarVegetacion();
    public void insertarVegetacion();
    public Habitat buscarHabitat(String nombre);
    public boolean guardarHabitat(Habitat habitat);
    public List<Habitat> recuperarHabitats();
}
