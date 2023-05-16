/**
 * ZonaDAO.java
 * May 13, 2023 5:05:48 PM
 */
package itson.DAOs;

import Dominio.Continente;
import Dominio.Especie;
import Dominio.Zona;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que permite gestionar los metodos referentes a la Zona en la base de
 * datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926
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
     *
     * @return Una lista de las zonas que existen en el zoo
     */
    public List<Zona> recuperar() {
        MongoCollection<Zona> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Zona.class);
        List<Zona> zonas = new LinkedList<>();
        coleccion.find().into(zonas);
        return zonas;
    }

    public void insertarZonas(Especie especie, Especie especie2, Especie especie3) {
        Zona zona1 = new Zona("Zona de los Felinos", Arrays.asList(especie.getId()));
        Zona zona2 = new Zona("Zona de las Serpientes", Arrays.asList(especie2.getId()));
        Zona zona3 = new Zona("Zona del Ártico", Arrays.asList(especie3.getId()));
        
         MongoCollection<Zona> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Zona.class);
         coleccion.insertMany(Arrays.asList(zona1,zona2,zona3));

    }

}
