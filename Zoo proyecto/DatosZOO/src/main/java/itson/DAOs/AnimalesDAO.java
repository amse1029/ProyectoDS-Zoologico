/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Animal;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

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
    
    public List<Animal> recupera(){
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Animal.class);
       List<Animal> animales = new LinkedList<>();
       coleccion.find().into(animales);
       return animales; 
    }
    
    public Animal guardar(Animal animal){
        Animal animal = new Animal();
    }
}
