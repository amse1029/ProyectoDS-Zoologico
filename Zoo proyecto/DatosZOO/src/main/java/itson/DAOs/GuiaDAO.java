/**
 * GuiaDAO.java
 * May 13, 2023 5:05:59 PM
 */
package itson.DAOs;

import Dominio.Guia;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
    protected List<Guia> recuperar() {
        MongoCollection<Guia> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
        List<Guia> guias = new LinkedList<>();
        coleccion.find().into(guias);
        return guias;
    }

    /**
     * Método que inserta guías a la base de datos.
     */
    protected void insertarGuias() {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Guia guia1 = new Guia("Ana Torres", "Calle F, Ciudad U", "987654321", formatoFecha.parse("15/05/2022"));
            Guia guia2 = new Guia("Luis Herrera", "Calle G, Ciudad T", "567890123", formatoFecha.parse("15/04/2021"));
            Guia guia3 = new Guia("Sofia Garcia", "Calle H, Ciudad S", "012345678", formatoFecha.parse("20/10/2022"));
            Guia guia4 = new Guia("Diego Gonzalez", "Calle I, Ciudad R", "345678901", formatoFecha.parse("16/05/2022"));
            Guia guia5 = new Guia("Paula Rodriguez", "Calle J, Ciudad Q", "890123456", formatoFecha.parse("15/12/2022"));
            Guia guia6 = new Guia("Laura Martinez", "Calle D, Ciudad W", "0123456789", formatoFecha.parse("15/01/2023"));
            MongoCollection<Guia> coleccion
                    = BASE_DATOS.getCollection(NOMBRE_COLECCION, Guia.class);
            coleccion.insertMany(Arrays.asList(guia1, guia2, guia3, guia4, guia5, guia6));
        } catch (Exception e) {

        }

    }
}
