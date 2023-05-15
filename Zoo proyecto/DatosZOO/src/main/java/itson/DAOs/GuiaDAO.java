/**
 * GuiaDAO.java
 * May 13, 2023 5:05:59 PM
 */
package itson.DAOs;

import Dominio.Guia;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que permite gestionar todos los metodos referentes con el guia en la
 * base de datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class GuiaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Guias";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public GuiaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    /**
     * Metodo que permite recuperar todos los guias que estan registrados.
     * @return Una lista de los guias que existen en el zoo.
     */
    public List<Guia> recuperar() {
        MongoCollection<Guia> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
        List<Guia> guias = new LinkedList<>();
        coleccion.find().into(guias);
        return guias;
    }
}
