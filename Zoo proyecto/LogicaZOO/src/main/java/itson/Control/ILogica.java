/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.Control;

import Dominio.Animal;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;
import Dominio.Itinerario;
import Dominio.Queja;

/**
 *
 * @author julio
 */
public interface ILogica {
    
    public  LinkedList <Object> recuperarDatosHabitats();
    public Habitat buscarHabitat(String nombre);
    public Boolean guardarHabitat(Habitat habitat);
    public List<Cuidador> recuperarCuidadores();
    public List<Habitat> recuperarHabitats();
    public boolean consultaEspecieNombreCientifico(String nombreCientifico);
    public Animal consultaAnimal(String nombre);
    public Especie recuperarEspecie(String nombre);
    public ObjectId guardarEspecie(Especie especie);
    public Object[] recuperaDatosItinerario();
    public Itinerario buscarItinerario(String nombre);
    public ObjectId guardarItinerario(Itinerario itinerario);
    public List<Itinerario>recuperaNombreItinerarios();
    public ObjectId guardarQueja(Queja Queja);
}
