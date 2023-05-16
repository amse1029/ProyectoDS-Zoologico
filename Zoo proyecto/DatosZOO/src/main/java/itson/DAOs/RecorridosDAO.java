/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Recorrido;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class RecorridosDAO {
    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Recorridos";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public RecorridosDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public ObjectId insertar(Recorrido recorrido){
        MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);
        coleccion.insertOne(recorrido);
        return recorrido.getId();
    }
    
    public Recorrido recuperar(String nombre){
         MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);
         Recorrido recorrido = coleccion.find(eq("nombre",nombre)).first();
         return recorrido;
    }
    
    public void actualizar(Recorrido recorrido) {
        MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);
        
        
        coleccion.replaceOne(eq("_id", recorrido.getId()), recorrido);
    }
}
