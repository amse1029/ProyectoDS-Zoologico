/**
 * QuejaDAO.java
 * May 13, 2023 5:06:32 PM
 */
package itson.DAOs;

import Dominio.Queja;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar todos los metodos referentes a las quejas en la
 * base de datos.
 *
 * @author 
 */
public class QuejaDAO {
    
    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Quejas";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public QuejaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodo que permite guardar una queja en la base de datos.
     * @param queja Es la queja que se desea guardar
     * @return El Id de la queja que se guardó 
     */
    public ObjectId guardarQueja(Queja queja) {
        MongoCollection<Queja> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Queja.class);
        coleccion.insertOne(queja);
        return queja.getId();
    }
}
