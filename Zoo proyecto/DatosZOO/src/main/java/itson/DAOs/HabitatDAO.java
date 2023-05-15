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
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Clase que permite gestionar todos los metodos referente a los habitats en la
 * base de datos.
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class HabitatDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Habitats";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
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

   /**
     * Metodo que permite buscar un habitat por su nombre.
     * @param nombre Es el nombre del habitar.
     * @return El habitat que concuerda con el nombre.
     */
    public Habitat buscarHabitat(String nombre) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);

        Habitat habitat = new Habitat();
        habitat = coleccion.find(eq("nombre", nombre)).first();
        return habitat;
    }

    /**
     * Metodo que permite guardar un habitat.
     * @param habitat Es el habitat que se desea guardar.
     * @return true si se pudo guardar, false en caso contrario.
     */
    public boolean guardarHabitat(Habitat habitat) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        coleccion.insertOne(habitat);
        if (habitat.getId() != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que permite recuperar los habitats existentes en la base de datos.
     * @return Una lista con todos los habitats existentes.
     */ 
    public List<Habitat> recupera() {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        List<Habitat> habitats = new LinkedList<>();
        coleccion.find().into(habitats);
        return habitats;
    }

}
