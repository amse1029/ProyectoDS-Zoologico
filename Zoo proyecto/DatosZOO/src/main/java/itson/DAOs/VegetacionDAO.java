/**
 * VegetacionDAO.java
 * May 8, 2023 6:36:35 PM
 */
package itson.DAOs;

import Dominio.Vegetacion;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class VegetacionDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Vegetaciones";

    /**
     *
     */
    public VegetacionDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public void insertarVegetaciones(){
        Vegetacion vegetacion = new Vegetacion("Bosques templados");
        Vegetacion vegetacion2 = new Vegetacion("Bosques tropicales");
        Vegetacion vegetacion3 = new Vegetacion("Sabanas");
        Vegetacion vegetacion4 = new Vegetacion("Desiertos");
        Vegetacion vegetacion5 = new Vegetacion("Tundra");
        Vegetacion vegetacion6 = new Vegetacion("Selvas tropicales");
        
         MongoCollection<Vegetacion> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Vegetacion.class);
        coleccion.insertMany(Arrays.asList(vegetacion,vegetacion2,vegetacion3,vegetacion4,vegetacion5,vegetacion6));
    }
    
    public List <Vegetacion> recupera(){
         MongoCollection<Vegetacion> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Vegetacion.class);
       List<Vegetacion> vegetaciones = new LinkedList<>();
       coleccion.find().into(vegetaciones);
       return vegetaciones;
    }

}
