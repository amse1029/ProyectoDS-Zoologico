/**
 * ZonaDAO.java
 * May 13, 2023 5:05:48 PM
 */
package itson.DAOs;

import Dominio.Zona;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que permite gestionar los metodos referentes a la Zona 
 * en la base de datos.
 *
 * @author 
 */
public class ZonaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Zonas";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public ZonaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    /**
     * Metodo que permite recuperar las zonas que estan registradas en la base
     * de datos.
     * @return Una lista de las zonas que existen en el zoo
     */
    public List<Zona> recuperar() {
        MongoCollection<Zona> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Zona.class);
        List<Zona> zonas = new LinkedList<>();
        coleccion.find().into(zonas);
        return zonas;
    }

}
