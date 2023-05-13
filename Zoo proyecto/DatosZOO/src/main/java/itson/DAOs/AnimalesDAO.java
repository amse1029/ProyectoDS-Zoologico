/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Animal;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class AnimalesDAO {
    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Animales";

    public AnimalesDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public List<Animal> recupera(ObjectId idEspecie){
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Animal.class);
       List<Animal> animales = new LinkedList<>();
       coleccion.find(eq("especieId",idEspecie)).into(animales);
       return animales; 
    }
    
    public void guardar(Animal animal){
         MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Animal.class);
         coleccion.insertOne(animal);  
    }
    
    public void eliminar(Animal animal){
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Animal.class);
        coleccion.deleteOne(eq("id",animal.getId()));
    }
    
    public Animal consulta(String nombre){
         MongoCollection<Animal> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);
 
        Animal animal = new Animal();
        animal = coleccion.find(regex("nombre", nombre)).first();
        return animal;  
    }
}
