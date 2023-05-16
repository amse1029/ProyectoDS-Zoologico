/**
 * ItinerarioDAO.java
 * May 13, 2023 5:06:12 PM
 */
package itson.DAOs;

import Dominio.Itinerario;
import Dominio.Recorrido;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar todos los metodos necesarios para 
 * generar itinerarios en la base de datos.
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class ItinerarioDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Itinerarios";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public ItinerarioDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodo que permite buscar un itinerario en base a su nombre.
     *
     * @param nombre Es el nombre del itinerario que se desea buscar.
     * @return Un itinerario en caso de existir, vacio en caso contrario.
     */
    public Itinerario buscarRecorrido(ObjectId id) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        Itinerario itinerario = new Itinerario();
        itinerario = coleccion.find(eq("recorridoId", id)).first();
        return itinerario;
    }
    public Itinerario buscar(String nombre ) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        Itinerario itinerario = new Itinerario();
        itinerario = coleccion.find(eq("nombreItinerario", nombre)).first();
        return itinerario;
    }

    /**
     * Metodo que permite guardar un itinerario en la base de datos.
     *
     * @param itinerario Es el itinerario que se desea guardar.
     * @return El id del itinerario que se guardo
     */
    public ObjectId guardar(Itinerario itinerario) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        coleccion.insertOne(itinerario);
        return itinerario.getId();
    }
    
    /**
     * Metodo que permite recuperar todos los itinerarios existentes en la base
     * de datos.
     * @return Una lista con los itinerarios existentes.
     */
    public List<Itinerario> recupera() {
       MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
         List<Itinerario> itinerarios = new LinkedList<>();
        coleccion.find().into(itinerarios);
        return itinerarios;
    }
    public void actualizar(Itinerario itinerario) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        
        
        coleccion.replaceOne(eq("_id", itinerario.getId()), itinerario);
    }
   
}
