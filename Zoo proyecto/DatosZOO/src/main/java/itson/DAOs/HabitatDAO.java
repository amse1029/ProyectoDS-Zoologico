/**
 * HabitatDAO.java
 * May 8, 2023 6:37:13 PM
 */
package itson.DAOs;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 * Clase que permite gestionar todos los metodos referente a los habitats en la
 * base de datos.
 *
 * @author 
 */
public class HabitatDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Habitats";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public HabitatDAO() {
        CodecProvider codecProvider = PojoCodecProvider.builder()
                .register("Dominio")
                .register(Clima.class)
                .register(Continente.class)
                .register(Vegetacion.class)
                .build();
        CodecRegistry codecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(codecProvider));
        this.BASE_DATOS = Conexion.dameInstancia().withCodecRegistry(codecRegistry);
    }

    /**
     * Metodo que permite buscar un habitat por su nombre.
     *
     * @param nombre Es el nombre del habitar.
     * @return El habitat que concuerda con el nombre.
     */
    protected Habitat buscarHabitat(String nombre) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);

        Habitat habitat = new Habitat();
        habitat = coleccion.find(eq("nombre", nombre)).first();
        return habitat;
    }

    /**
     * Metodo que permite guardar un habitat.
     *
     * @param habitat Es el habitat que se desea guardar.
     * @return true si se pudo guardar, false en caso contrario.
     */
    protected boolean guardarHabitat(Habitat habitat) {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        coleccion.insertOne(habitat);
        if (habitat.getId() != null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que permite recuperar los habitats existentes en la base de datos.
     *
     * @return Una lista con todos los habitats existentes.
     */
    protected List<Habitat> recupera() {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        List<Habitat> habitats = new LinkedList<>();
        coleccion.find().into(habitats);
        return habitats;
    }

    /**
     * Método que inserta hábitats a la base de datos.
     */
    protected void insertar() {
        MongoCollection<Habitat> coleccion = BASE_DATOS.getCollection(NOMBRE_COLECCION, Habitat.class);
        Clima clima1 = new Clima("Clima tropical");
        Continente continente1 = new Continente("America");
        Vegetacion vegetacion1 = new Vegetacion("Selvas tropicales");
        List<Continente> continentes1 = new ArrayList<>();
        continentes1.add(continente1);

        Habitat habitat1 = new Habitat("Selva Amazónica", clima1, continentes1, vegetacion1);

        Clima clima2 = new Clima("Clima templado");
        Continente continente2 = new Continente("Africa");
        Vegetacion vegetacion2 = new Vegetacion("Desiertos");
        List<Continente> continentes2 = new ArrayList<>();
        continentes2.add(continente2);

        Habitat habitat2 = new Habitat("Desierto del Sahara", clima2, continentes2, vegetacion2);

        Clima clima3 = new Clima("Clima templado");
        Continente continente3_1 = new Continente("Europa");
        Continente continente3_2 = new Continente("Asia");
        Vegetacion vegetacion3 = new Vegetacion("Bosques templados");
        List<Continente> continentes3 = new ArrayList<>();
        continentes3.add(continente3_1);
        continentes3.add(continente3_2);

        Habitat habitat3 = new Habitat("Bosque Boreal", clima3, continentes3, vegetacion3);

        coleccion.insertMany(Arrays.asList(habitat1, habitat2, habitat3));
    }

}
