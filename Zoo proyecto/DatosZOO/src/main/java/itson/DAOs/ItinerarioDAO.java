/**
* ItinerarioDAO.java
* May 13, 2023 5:06:12 PM
*/ 

package itson.DAOs;

import Dominio.Itinerario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926 
 */
public class ItinerarioDAO {
    private final MongoDatabase BASE_DATOS;
        private final String NOMBRE_COLECCION = "Itinerarios";

    /**
     * 
     */
    public ItinerarioDAO(){
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    public Itinerario buscar(String nombre) {
     MongoCollection<Itinerario> coleccion = 
             BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        Itinerario itinerario = new Itinerario();
        itinerario = coleccion.find(eq("nombre", nombre)).first();
        return itinerario; 
    }
    
    public ObjectId guardar(Itinerario itinerario) {
    MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Itinerario.class);
         coleccion.insertOne(itinerario);  
         return itinerario.getId();
    }
    public List<Itinerario> recupera(){
        return null;
    }
}
