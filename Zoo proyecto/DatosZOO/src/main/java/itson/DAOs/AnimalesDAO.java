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
 * Clase que permite gestionar los metodos referentes a los Animales 
 * en la base de datos.
 * @author julio
 */
public class AnimalesDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Animales";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public AnimalesDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodo que permite recuperar los animales que cuenten con el id de
     * especie del parametro.
     *
     * @param idEspecie Es el id de la especie.
     * @return Una lista con todas las coincidencias.
     */
    public List<Animal> recupera(ObjectId idEspecie) {
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);
        List<Animal> animales = new LinkedList<>();
        coleccion.find(eq("especieId", idEspecie)).into(animales);
        return animales;
    }

    /**
     * Metodo que permite guardar un animal en la base de datos.
     *
     * @param animal Es el animal que se desea guardar.
     */
    public void guardar(Animal animal) {
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);
        coleccion.insertOne(animal);
    }

    /**
     * Metodo que permite eliminar un animal de la base de datos.
     *
     * @param animal Es el animal que se desea eliminar.
     */
    public void eliminar(Animal animal) {
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);
        coleccion.deleteOne(eq("_id", animal.getId()));
    }

    /**
     * Metodo que permite consultar el animal que cuenta con el mismo nombre.
     *
     * @param nombre Es el nombre del animal.
     * @return El animal que coincida con el nombre.
     */
    public Animal consulta(String nombre) {
        MongoCollection<Animal> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);

        Animal animal = new Animal();
        animal = coleccion.find(regex("nombre", nombre)).first();
        return animal;
    }
}
