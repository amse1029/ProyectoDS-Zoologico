/**
* IDatos.java
* May 8, 2023 6:39:56 PM
*/ 

package itson.DAOs;

import Dominio.Animal;
import Dominio.CargoEspecie;
import Dominio.Clima;
import Dominio.Continente;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import Dominio.Vegetacion;
import java.util.List;
import org.bson.types.ObjectId;

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
    public List<Cuidador> recuperarCuidadores();
    public List<Animal> recuperaAnimales(ObjectId idEspecie);
    public Animal consultaAnimal(String nombre);
    public void guardarAnimal(Animal animal);
    public void eliminarAnimal(Animal animal);
    public Especie recuperaEspecieNombre(String nombre);
    public Especie buscarNombreCientificoEspecie(String nombreCientifico);
    public ObjectId guardarEspecie(Especie especie);
    public ObjectId actualizarEspecie(Especie especie);
    public void guardarCargoEspecie(CargoEspecie cargoEspecie);
    public void eliminarCargoEspecie(CargoEspecie cargoEspecie);
    public List<CargoEspecie> consultaEspeciesCargoEspecie(Especie especie);
     public List<CargoEspecie> consultaCuidadorCargoEspecie(Cuidador cuidador);
    public List<Cuidador> recuperarIdCuidador(ObjectId idCuidador);
    public void agregarCuiadadores();
}
