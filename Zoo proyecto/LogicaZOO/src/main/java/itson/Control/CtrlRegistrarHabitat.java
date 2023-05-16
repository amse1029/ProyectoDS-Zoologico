/**
 * CtrlLogica.java
 * May 8, 2023 11:43:29 PM
 */
package itson.Control;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import java.util.LinkedList;
import java.util.List;

public class CtrlRegistrarHabitat {

    private IDatos datos;

    public CtrlRegistrarHabitat() {
        this.datos = FabricaDatos.crearInstancia();
    }

    public List<Clima> recuperarClimas() {
        List<Clima> climas = new LinkedList<>();
        climas = datos.recuperarClima();
        if (climas.isEmpty()) {
            datos.insertarClimas();
            climas = datos.recuperarClima();
            return climas;
        } else {
            return climas;
        }
    }

    public List<Vegetacion> recuperarVegetacion() {
        List<Vegetacion> vegetaciones = new LinkedList<>();
        vegetaciones = datos.recuperarVegetacion();
        if (vegetaciones.isEmpty()) {
            datos.insertarVegetacion();
            vegetaciones = datos.recuperarVegetacion();
            return vegetaciones;
        } else {
            return vegetaciones;
        }
    }

    public List<Continente> recuperarContiente() {
        List<Continente> continentes = new LinkedList<>();
        continentes = datos.recuperarContinente();
        if (continentes.isEmpty()) {
            datos.insertarContinentes();
            continentes = datos.recuperarContinente();
            return continentes;
        } else {
            return continentes;
        }
    }

    public Habitat buscarHabitat(String nombre) {
        Habitat habitat = new Habitat();
        habitat = datos.buscarHabitat(nombre);
        return habitat;
    }

    public boolean guardarHabitat(Habitat habitat) {
        Boolean bandera;
        if (this.buscarHabitat(habitat.getNombre()) == null) {
            bandera = datos.guardarHabitat(habitat);
            return bandera;
        } else {
            return false;
        }

    }

}
