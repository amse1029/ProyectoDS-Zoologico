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

    /**
     * Constructor que instancia la fabrica de datos
     */
    public CtrlRegistrarHabitat() {
        this.datos = FabricaDatos.crearInstancia();
    }

    /**
     * Método que permite recuperar las hábitats existentes.
     * @return Lista de climas
     */
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

    /**
     * Método que permite recuperar las vegetaciones existentes.
     * @return Lista de vegetaciones
     */
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

    /**
     * Método que permite recuperar los continentes existentes.
     * @return Lista de continentes
     */
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

    /**
     * Método que busca un hábitat por su nombre.
     * @param nombre Nombre del hábitat que se quiere buscar.
     * @return Hábitat encontrada.
     */
    public Habitat buscarHabitat(String nombre) {
        Habitat habitat = new Habitat();
        habitat = datos.buscarHabitat(nombre);
        return habitat;
    }

    /**
     * Método que guarda un hábitat.
     * @param habitat Hábitat que se quiere guardar.
     * @return true si se pudo guardar, false en caso contrario.
     */
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
