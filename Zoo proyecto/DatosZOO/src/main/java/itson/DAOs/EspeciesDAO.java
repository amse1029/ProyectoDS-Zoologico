/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Especie;
import Dominio.Habitat;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar los metodos referentes a las especies en la base
 * de datos.
 *
 * @author
 */
public class EspeciesDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Especies";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    protected EspeciesDAO() {
        CodecProvider codecProvider = PojoCodecProvider.builder()
                .register("Dominio")
                .register(Habitat.class)
                .build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(codecProvider));
        this.BASE_DATOS = Conexion.dameInstancia().withCodecRegistry(codecRegistry);
    }

    /**
     * Metodo que permite recuperar la especie que cuente con el nombre dado en
     * el parametro.
     *
     * @param nombre Es el nombre de la especie.
     * @return La especie que cuente con el nombre del parametro.
     */
    protected Especie recupera(String nombre) {
        MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);

        Especie especie = new Especie();
        especie = coleccion.find(eq("nombre", nombre)).first();
        return especie;
    }

    /**
     * Metodo que permite buscar una especie por su nombre cientifico.
     *
     * @param nombreCientifico Es el nombre cientifico de la especie.
     * @return La especie que cuente con el nombre cientifico del parametro.
     */
    protected Especie buscarNombreCientifico(String nombreCientifico) {
        MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);

        Especie especie = new Especie();
        especie = coleccion.find(eq("nombreCientifico", nombreCientifico)).first();
        return especie;
    }

    /**
     * Metodo que permite guardar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea guardar.
     * @return Es el id que se genero al guardarlo.
     */
    protected ObjectId guardar(Especie especie) {
        MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
        coleccion.insertOne(especie);
        return especie.getId();
    }

    /**
     * Metodo que permite actualizar una especie en la base de datos.
     *
     * @param especie Es la especie que se desea actualizar.
     * @return Es el id de la especie que se actualizo.
     */
    protected ObjectId actualizar(Especie especie) {
        MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);

        coleccion.replaceOne(eq("_id", especie.getId()), especie);
        return especie.getId();
    }

    protected void insertar(Habitat habitat1, Habitat habitat2, Habitat habitat3) {
        MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
        Especie especie1 = new Especie("Tigre", "Panthera tigris", "Un felino grande y poderoso", Arrays.asList(habitat1));
        Especie especie2 = new Especie("Cobra Real", "Ophiophagus hannah", "Una serpiente venenosa y ágil", Arrays.asList(habitat2));
        Especie especie3 = new Especie("Oso Polar", "Ursus maritimus", "Un gran mamífero adaptado al frío", Arrays.asList(habitat3));

        coleccion.insertMany(Arrays.asList(especie1, especie3, especie2));
    }

    protected List<Especie> recuperarTodas() {
        MongoCollection<Especie> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
        List<Especie> especies = new ArrayList<>();
        coleccion.find().into(especies);
        return especies;

    }
}
