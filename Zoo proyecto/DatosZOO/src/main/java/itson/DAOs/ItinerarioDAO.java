/**
 * ItinerarioDAO.java
 * May 13, 2023 5:06:12 PM
 */
package itson.DAOs;

import Dominio.Itinerario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar todos los metodos necesarios para generar
 * itinerarios en la base de datos.
 *
 * @author
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
     * Método que busca un recorrido por su ID
     *
     * @param id Id del recorrido
     * @return Itinerario al que corresponde el recorrido.
     */
    protected Itinerario buscarRecorrido(ObjectId id) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        Itinerario itinerario = new Itinerario();
        itinerario = coleccion.find(eq("recorridoId", id)).first();
        return itinerario;
    }
/**
     * Metodo que busca un itinerario por el nombre del parametro.
     * @param nombre es el nombre del itinerario.
     * @return el itinerario buscado
     */
    protected Itinerario buscar(String nombre) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        Itinerario itinerario = new Itinerario();
        itinerario = coleccion.find(new Document("nombreItinerario", new Document("$regex", nombre).append("$options", "i"))).first();
        System.out.println(itinerario);
        return itinerario;
    }

    /**
     * Metodo que permite guardar un itinerario en la base de datos.
     *
     * @param itinerario Es el itinerario que se desea guardar.
     * @return El id del itinerario que se guardo
     */
    protected ObjectId guardar(Itinerario itinerario) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        coleccion.insertOne(itinerario);
        return itinerario.getId();
    }

    /**
     * Metodo que permite recuperar todos los itinerarios existentes en la base
     * de datos.
     *
     * @return Una lista con los itinerarios existentes.
     */
    protected List<Itinerario> recupera() {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);
        List<Itinerario> itinerarios = new LinkedList<>();
        coleccion.find().into(itinerarios);
        return itinerarios;
    }
/**
     * Metodo que permite actualizar un itinerario.
     * @param itinerario es el itinerario a actualizar.
     */
    protected void actualizar(Itinerario itinerario) {
        MongoCollection<Itinerario> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Itinerario.class);

        coleccion.replaceOne(eq("_id", itinerario.getId()), itinerario);
    }

}
