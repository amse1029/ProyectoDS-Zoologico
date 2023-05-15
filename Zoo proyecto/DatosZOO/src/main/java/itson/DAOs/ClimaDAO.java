/**
 * ClimaDAO.java
 * May 8, 2023 6:36:21 PM
 */
package itson.DAOs;

import Dominio.Clima;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que permite gestionar los metodos referentes a el clima en la base de
 * datos.
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class ClimaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Climas";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public ClimaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodo que permite insertar los climas en la base de datos.
     */
    public void insertarClimas() {
        Clima clima = new Clima("Clima tropical");
        Clima clima2 = new Clima("Clima desértico");
        Clima clima3 = new Clima("Clima templado");
        Clima clima4 = new Clima("Clima Polar");
        Clima clima5 = new Clima("Clima de alta montaña");
        MongoCollection<Clima> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Clima.class);
        coleccion.insertMany(Arrays.asList(clima, clima2, clima3, clima4, clima5));
    }

    /**
     * Metodo que permite recuperar los climas exitentes en la base de datos.
     *
     * @return Una lista con los climas existentes.
     */
    public List<Clima> recupera() {
        MongoCollection<Clima> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Clima.class);
        List<Clima> climas = new LinkedList<>();
        coleccion.find().into(climas);
        return climas;
    }

}
