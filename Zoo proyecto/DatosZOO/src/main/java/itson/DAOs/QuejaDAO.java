/**
 * QuejaDAO.java
 * May 13, 2023 5:06:32 PM
 */
package itson.DAOs;

import Dominio.Queja;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Clase que permite gestionar todos los metodos referentes a las quejas en la
 * base de datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926
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
     *
     * @param queja Es la queja que se desea guardar
     */
     public Queja  guardarQueja(Queja queja) {
        MongoCollection<Queja> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Queja.class);
        coleccion.insertOne(queja);
        return queja;
    }
}
