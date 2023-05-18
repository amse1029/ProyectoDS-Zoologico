/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Animal;
import Dominio.Especie;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.regex;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar los metodos referentes a los Animales en la base
 * de datos.
 *
 * @author
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
    protected List<Animal> recupera(ObjectId idEspecie) {
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
    protected void guardar(Animal animal) {
        MongoCollection<Animal> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);
        coleccion.insertOne(animal);
    }

    /**
     * Metodo que permite eliminar un animal de la base de datos.
     *
     * @param animal Es el animal que se desea eliminar.
     */
    protected void eliminar(Animal animal) {
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
    protected Animal consulta(String nombre) {
        MongoCollection<Animal> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);

        Animal animal = new Animal();
        animal = coleccion.find(new Document("nombre", new Document("$regex", nombre).append("$options", "i"))).first();
        return animal;
    }
  /**
     * Metodo que permite insertar animales en especies.
     * @param especie especie 1 a agregar.
     * @param especie2 especie 2 a agregar.
     * @param especie3 especie 3 a agregar.
     */
    protected void InsertarAnimales(Especie especie, Especie especie2, Especie especie3) {
        Animal tigre1 = new Animal("Tigre de Bengala", "Panthera tigris tigris", 5, especie.getId(), "Macho");
        Animal tigre2 = new Animal("Tigre Siberiano", "Panthera tigris altaica", 7, especie.getId(), "Hembra");
        Animal tigre3 = new Animal("Tigre Malayo", "Panthera tigris jacksoni", 4, especie.getId(), "Macho");

        Animal cobra1 = new Animal("Cobra India", "Ophiophagus hannah", 3, especie2.getId(), "Hembra");
        Animal cobra2 = new Animal("Cobra Filipina", "Ophiophagus hannah", 5, especie2.getId(), "Macho");
        Animal cobra3 = new Animal("Cobra de Malasia", "Ophiophagus hannah", 4, especie2.getId(), "Hembra");

        Animal oso1 = new Animal("Oso Polar del Ártico", "Ursus maritimus maritimus", 8, especie3.getId(), "Macho");
        Animal oso2 = new Animal("Oso Polar del Subártico", "Ursus maritimus marinus", 6, especie3.getId(), "Hembra");
        Animal oso3 = new Animal("Oso Polar de la Bahía de Hudson", "Ursus maritimus hudsonicus", 10, especie3.getId(), "Macho");

        MongoCollection<Animal> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Animal.class);

        coleccion.insertMany(Arrays.asList(tigre1, tigre2, tigre3, cobra1, cobra2, cobra3, oso1, oso2, oso3));

    }
}
