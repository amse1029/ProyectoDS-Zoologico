/**
 * GuiaDAO.java
 * May 13, 2023 5:05:59 PM
 */
package itson.DAOs;

import Dominio.Guia;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que permite gestionar todos los metodos referentes con el guia en la
 * base de datos.
 *
 * @author
 */
public class GuiaDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Guias";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public GuiaDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodo que permite recuperar todos los guias que estan registrados.
     *
     * @return Una lista de los guias que existen en el zoo.
     */
    public List<Guia> recuperar() {
        MongoCollection<Guia> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
        List<Guia> guias = new LinkedList<>();
        coleccion.find().into(guias);
        return guias;
    }

    public void insertarGuias() {
        MongoCollection<Guia> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Guia juan = new Guia("Juan Pérez", "Calle 123, Ciudad Ejemplo", "555-123-4567", formatoFecha.parse("10/05/1980"));
            Guia maria = new Guia("María Rodríguez", "Avenida Principal, Pueblo X", "555-987-6543", formatoFecha.parse("15/12/1992"));
            Guia pedro = new Guia("Pedro Gómez", "Calle 456, Ciudad Ejemplo", "555-789-1234", formatoFecha.parse("03/07/1975"));
            Guia laura = new Guia("Laura López", "Avenida Central, Pueblo Y", "555-456-7890", formatoFecha.parse("28/09/1988"));
            Guia carlos = new Guia("Carlos Sánchez", "Calle 789, Ciudad Ejemplo", "555-321-6549", formatoFecha.parse("19/02/1995"));
            coleccion.insertMany(Arrays.asList(juan, laura, pedro, maria, carlos));
        } catch (ParseException ex) {
            Logger.getLogger(GuiaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
