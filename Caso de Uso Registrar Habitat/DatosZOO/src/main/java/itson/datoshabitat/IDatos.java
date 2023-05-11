/**
* IDatos.java
* May 8, 2023 6:39:56 PM
*/ 

package itson.Interfaces;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;

/**
 * Descripción de la interface: 
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface IDatos {

    public Clima recuperarClima();
    public Continente recuperarContinente();
    public Vegetacion recuperarVegetacion();
    public Habitat buscarHabitat();
    public void guardarHabitat(Habitat habitat);
}
