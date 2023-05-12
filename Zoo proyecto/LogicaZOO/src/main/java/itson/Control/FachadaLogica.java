package itson.Control;

/**
 * FachadaLogica.java May 8, 2023 11:42:32 PM
 */
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
public class FachadaLogica implements ILogica {

    /**
     *
     */
    public FachadaLogica() {

    }

    @Override
    public Object[] recuperarDatosHabitats() {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();

        List<Continente> listaContinentes = control.recuperarContiente();
        List<Vegetacion> listaVegetaciones = control.recuperarVegetacion();
        List<Clima> listaClimas = control.recuperarClimas();

        Object[] datos = new Object[3];
        datos[0] = listaContinentes;
        datos[1] = listaVegetaciones;
        datos[2] = listaClimas;

        return datos;
    }

    @Override
    public Habitat buscarHabitat(String nombre) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Habitat habitat = new Habitat();
        habitat = control.buscarHabitat(nombre);
        return habitat;
    }

    @Override
    public Boolean guardarHabitat(Habitat habitat) {
        CtrlRegistrarHabitat control = new CtrlRegistrarHabitat();
        Boolean bandera;
        bandera = control.guardarHabitat(habitat);
        return bandera;
    }

}
