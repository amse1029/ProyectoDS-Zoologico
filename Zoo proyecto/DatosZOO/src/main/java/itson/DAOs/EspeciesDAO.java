/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;


import Dominio.Especie;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class EspeciesDAO {
     private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Especies";
    
    public EspeciesDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public Especie recupera(String nombre){
         MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
 
        Especie especie = new Especie();
        especie = coleccion.find(regex("nombre", nombre)).first();
        return especie;  
    }
    
    public Especie buscarNombreCientifico(String nombreCientifico){
        MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
 
        Especie especie = new Especie();
        especie = coleccion.find(regex("nombreCientifico", nombreCientifico)).first();
        return especie; 
    }
    
    public ObjectId guardar(Especie especie){
         MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Especie.class);
         coleccion.insertOne(especie);  
         return especie.getId();
    }
    
    public ObjectId actualizar(Especie especie){
        MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Especie.class);
        coleccion.replaceOne(eq("id",especie.getId()), especie);
        return especie.getId();
    }
}
