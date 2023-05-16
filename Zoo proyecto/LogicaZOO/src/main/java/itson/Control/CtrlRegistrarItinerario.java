/**
 * CtrlRegistrarItinerario.java
 * May 13, 2023 3:33:04 PM
 */
package itson.Control;

import Dominio.Especie;
import Dominio.Guia;
import Dominio.Habitat;
import Dominio.Itinerario;
import Dominio.Recorrido;
import Dominio.Zona;
import itson.DAOs.EspeciesDAO;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import itson.DAOs.ItinerarioDAO;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class CtrlRegistrarItinerario {

    private IDatos datos;

    /**
     * Constructor por defecto que crea la instancia de fabrica datos.
     */
    public CtrlRegistrarItinerario() {
        this.datos = FabricaDatos.crearInstancia();

    }

    public List<Zona> recuperarZonas() {
        List<Zona> zonas = new LinkedList<>();
        zonas = datos.recuperaZonas();
        return zonas;
    }

    public List<Guia> recuperarGuias() {
        List<Guia> guias = new LinkedList<>();
        guias = datos.recuperaGuias();
        return guias;
    }

    public ObjectId guardarItinerario(Itinerario itinerario, Recorrido recorrido) {
        
        if(recorrido.getId()!=null){
            this.actualizarRecorrido(recorrido);
        }else{
            datos.insertarRecorrido(recorrido);
        }
        if(itinerario.getId()!=null){
            itinerario.setRecorridoId(recorrido.getId());
            this.actualizarItinerario(itinerario);
            return itinerario.getId();
        }else{
            itinerario.setRecorridoId(recorrido.getId());
            return datos.guardarItinerario(itinerario);
        }
    }

    public Itinerario buscarItinerario(String nombre) {

        Recorrido recorrido = datos.recuperarRecorrido(nombre);

        Itinerario itinerario = datos.buscarItineario(nombre);
        if (itinerario == null) {
            return itinerario;
        } else {
            itinerario.setRecorrido(recorrido);

            return itinerario;
        }
    }

    List<Itinerario> recuperaNombreItinerario() {
        ItinerarioDAO itinerarioDAO = new ItinerarioDAO();
        return itinerarioDAO.recupera();
    }

    public void insertarHabitats() {
        datos.insertarHabitats();
    }

    public void insertarZonas(Especie especie, Especie especie2, Especie especie3) {
        datos.insertarZonas(especie, especie2, especie3);
    }

    public void insertarEspecies(Habitat habitat1, Habitat habitat2, Habitat habitat3) {
        datos.insertarEspecies(habitat1, habitat2, habitat3);
    }

    public void InsertarAnimales(Especie especie, Especie especie2, Especie especie3) {
        datos.InsertarAnimales(especie, especie2, especie3);
    }

    public ObjectId insertarRecorrido(Recorrido recorrido) {
        datos.insertarRecorrido(recorrido);
        return recorrido.getId();
    }
    
    public Recorrido buscarRecorrido(String nombre){
        Recorrido recorrido = datos.recuperarRecorrido(nombre);
        return recorrido;
    }
    
    public void actualizarItinerario(Itinerario itinerario){
        datos.actualizarItineario(itinerario);
    }
    
    public void actualizarRecorrido(Recorrido recorrido){
        datos.actualizarRecorrido(recorrido);
    }

}
