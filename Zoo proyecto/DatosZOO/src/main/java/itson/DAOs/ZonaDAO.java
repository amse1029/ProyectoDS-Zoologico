/**
 * ZonaDAO.java
 * May 13, 2023 5:05:48 PM
 */
package itson.DAOs;

import Dominio.Continente;
import Dominio.Zona;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class ZonaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Zonas";

    /**
     *
     */
    public ZonaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    public List<Zona> recuperar() {
        MongoCollection<Zona> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Zona.class);
        List<Zona> zonas = new LinkedList<>();
        coleccion.find().into(zonas);
                System.out.println(zonas);
        return zonas;
    }

}
