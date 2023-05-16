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
 * Clase que permite gestionar los metodos referentes a el continente
 * en la base de datos.
 * @author Joel Antonio Lopez Cota ID:228926 
 */
public class ContinenteDAO {

     private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Continentes";
    
    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public ContinenteDAO(){
      this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    /**
     * Metodo que permite insertar los continentes en la base de datos.
     */
    public void insertarContinentes(){
        Continente continente = new Continente("America");
        Continente continente2 = new Continente("Asia");
        Continente continente3 = new Continente("Africa");
        Continente continente4 = new Continente("Antartida");
        Continente continente5 = new Continente("Oceania");
        Continente continente6 = new Continente("Europa");
        
        MongoCollection<Continente> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Continente.class);
        coleccion.insertMany(Arrays.asList(continente,continente2,continente3,continente4,continente5,continente6));
    }
    
    /**
     * Metodo que permite recuperar todos los continentes existentes en la base
     * de datos
     * @return Una lista con los continentes existentes.
     */
    public List<Continente> recupera(){
        MongoCollection<Continente> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Continente.class);
       List<Continente> continentes = new LinkedList<>();
       coleccion.find().into(continentes);
       return continentes;
    }

   
}
