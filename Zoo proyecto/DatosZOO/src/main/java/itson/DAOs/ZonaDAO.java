/**
 * ZonaDAO.java
 * May 13, 2023 5:05:48 PM
 */
package itson.DAOs;

import Dominio.Zona;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
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
    
    public void insertarZonas(){
        MongoCollection<Zona> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Zona.class);
        Zona zona1=new Zona("Zona1",100.4f);
        Zona zona2=new Zona("Zona2",60.6f);
        Zona zona3=new Zona("Zona3",20.7f);
        Zona zona4=new Zona("Zona4",80.8f);
        Zona zona5=new Zona("Zona5",50.2f);
        Zona zona6=new Zona("Zona6",18.1f);
        coleccion.insertMany(Arrays.asList(zona1,zona2,zona3,zona4,zona5,zona6));
    }

}
