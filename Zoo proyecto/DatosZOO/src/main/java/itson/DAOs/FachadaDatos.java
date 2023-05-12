/**
 * FachadaDatos.java
 * May 8, 2023 6:39:22 PM
 */
package itson.DAOs;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import java.util.List;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class FachadaDatos implements IDatos {

    /**
     *
     */
    public FachadaDatos() {

    }

    @Override
    public List<Clima> recuperarClima() {
        ClimaDAO climaDAO = new ClimaDAO();
        List<Clima> climas = climaDAO.recupera();
        return climas;
    }

    @Override
    public void insertarClimas() {
        ClimaDAO climaDAO = new ClimaDAO();
        climaDAO.insertarClimas();
    }

    @Override
    public List<Continente> recuperarContinente() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        List<Continente> continentes = continenteDAO.recupera();
        return continentes;

    }

    @Override
    public void insertarContinentes() {
        ContinenteDAO continenteDAO = new ContinenteDAO();
        continenteDAO.insertarContinentes();
    }

    @Override
    public List<Vegetacion> recuperarVegetacion() {
        VegetacionDAO vegetacionDAO = new VegetacionDAO();
        List<Vegetacion> vegetaciones = vegetacionDAO.recupera();
        return vegetaciones;
    }
    @Override
    public void insertarVegetacion() {
       VegetacionDAO vegetacionDAO = new VegetacionDAO();
       vegetacionDAO.insertarVegetaciones();
    }

    @Override
    public Habitat buscarHabitat(String nombre) {
        Habitat habitat = new Habitat();
        HabitatDAO habitatDAO = new HabitatDAO();
        habitat = habitatDAO.buscarHabitat(nombre);
        return habitat;
    }

    @Override
    public boolean guardarHabitat(Habitat habitat) {
        Boolean bandera;
        HabitatDAO habitatDAO = new HabitatDAO();
        bandera = habitatDAO.guardarHabitat(habitat);
        return bandera;
    }

    @Override
    public List<Habitat> recuperarHabitats() {
        HabitatDAO habitatDAO = new HabitatDAO();
        List<Habitat> habitats = habitatDAO.recupera();
        return habitats;
    }

    
}
