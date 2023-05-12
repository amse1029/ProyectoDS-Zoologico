/**
* ContinenteDAO.java
* May 8, 2023 6:37:00 PM
*/ 

package itson.DAOs;


import Dominio.Continente;
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
public class ContinenteDAO {

     private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Continentes";
    
    /**
     * 
     */
    public ContinenteDAO(){
      this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public void insertarContinentes(){
        Continente continente = new Continente("America");
        Continente continente2 = new Continente("Asia");
        Continente continente3 = new Continente("Africa");
        Continente continente4 = new Continente("Antartida");
        Continente continente5 = new Continente("Oceania");
        
        MongoCollection<Continente> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Continente.class);
        coleccion.insertMany(Arrays.asList(continente,continente2,continente3,continente4,continente5));
    }
    
    public List<Continente> recupera(){
        MongoCollection<Continente> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Continente.class);
       List<Continente> continentes = new LinkedList<>();
       coleccion.find().into(continentes);
       return continentes;
    }

   
}
