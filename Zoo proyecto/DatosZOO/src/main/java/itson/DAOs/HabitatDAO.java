/**
 * HabitatDAO.java
 * May 8, 2023 6:37:13 PM
 */
package itson.DAOs;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.regex;
import java.util.LinkedList;
import java.util.List;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

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
        CodecProvider codecProvider = PojoCodecProvider.builder()
                .register("Dominio")
                .register(Clima.class)
                .register(Continente.class)
                .register(Vegetacion.class)
                .build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(codecProvider));
        this.BASE_DATOS = Conexion.dameInstancia().withCodecRegistry(codecRegistry);
    }

    public Habitat buscarHabitat(String nombre) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);

        Habitat habitat = new Habitat();
        habitat = coleccion.find(eq("nombre", nombre)).first();
        return habitat;
    }

    public boolean guardarHabitat(Habitat habitat) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        coleccion.insertOne(habitat);
        if (habitat.getId() != null) {
            return true;
        } else {
            return false;
        }
    }

    public List<Habitat> recupera() {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        List<Habitat> habitats = new LinkedList<>();
        coleccion.find().into(habitats);
        return habitats;
    }

}
