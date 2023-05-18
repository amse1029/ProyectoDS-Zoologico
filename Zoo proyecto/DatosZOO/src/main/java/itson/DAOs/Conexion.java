/**
* Conexion.java
* May 8, 2023 6:38:14 PM
*/ 

package itson.DAOs;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Clase que permite generar la conexion con la base de datos.
 *
 * @author
 */
public class Conexion {

    private static MongoDatabase baseDatos;

    /**
     * Metodo constructor por defecto.
     */
    public Conexion() {

    }

    /**
     * Metodo que permite crear la instancia con Mongo.
     *
     * @return la instancia con mongo.
     */
    protected static MongoDatabase dameInstancia() {
        if (baseDatos == null) {
            CodecRegistry codec = fromRegistries(
                    MongoClientSettings.getDefaultCodecRegistry(),
                    fromProviders(PojoCodecProvider.builder().automatic(true).build()));
            MongoClientSettings setting = MongoClientSettings.builder().codecRegistry(codec).build();
            MongoClient conexion = MongoClients.create(setting);
            baseDatos = conexion.getDatabase("zoo");
        }
        return baseDatos;
    }
}
