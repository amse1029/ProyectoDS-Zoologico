/**
 * HabitatDAO.java
 * May 8, 2023 6:37:13 PM
 */
package itson.DAOs;

import Dominio.Habitat;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import java.util.LinkedList;
import java.util.List;
import org.bson.conversions.Bson;



/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class HabitatDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Habitats";

    /**
     *
     */
    public HabitatDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    public Habitat buscarHabitat(String nombre) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
 
        Habitat habitat = new Habitat();
        habitat = coleccion.find(regex("nombre", nombre)).first();
        return habitat;  
    }
    
    public boolean guardarHabitat(Habitat habitat){
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        coleccion.insertOne(habitat);
        if(habitat.getId() != null){
            return true;
        }else{
            return false;
        }  
    }
    
    public List<Habitat> recupera(){
       MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
       List<Habitat> habitats = new LinkedList<>();
       coleccion.find().into(habitats);
       return habitats;
    }

}
