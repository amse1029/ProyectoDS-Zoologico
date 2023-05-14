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
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.regex;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class EspeciesDAO {
     private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Especies";
    
    public EspeciesDAO() {
        CodecProvider codecProvider = PojoCodecProvider.builder()
                .register("Dominio")
                .register(Habitat.class)
                .build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(codecProvider));
        this.BASE_DATOS = Conexion.dameInstancia().withCodecRegistry(codecRegistry);
    }
    
    public Especie recupera(String nombre){
         MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
 
        Especie especie = new Especie();
        especie = coleccion.find(eq("nombre", nombre)).first();
        return especie;  
    }
    
    public Especie buscarNombreCientifico(String nombreCientifico){
        MongoCollection<Especie> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Especie.class);
 
        Especie especie = new Especie();
        especie = coleccion.find(eq("nombreCientifico", nombreCientifico)).first();
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
