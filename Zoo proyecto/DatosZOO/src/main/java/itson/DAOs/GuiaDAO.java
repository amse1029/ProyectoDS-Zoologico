/**
 * GuiaDAO.java
 * May 13, 2023 5:05:59 PM
 */
package itson.DAOs;

import Dominio.Guia;
import Dominio.Zona;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class GuiaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Guias";

    /**
     *
     */
    public GuiaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    public List<Guia> recuperar() {
        MongoCollection<Guia> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
        List<Guia> guias = new LinkedList<>();
        coleccion.find().into(guias);
        return guias;
    }
}
