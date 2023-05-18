/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Recorrido;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.types.ObjectId;

/**
 * Clase que permite gestionar todos los metodos referentes con los recorridos
 * en la base de datos.
 *
 */
public class RecorridosDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Recorridos";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    public RecorridosDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    /**
     * Metodoo que permite insertar un recorrido en la base de datos.
     *
     * @param recorrido es el recorrido a agregar.
     * @return el id del recorrido agregado.
     */
    protected ObjectId insertar(Recorrido recorrido) {
        MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);
        coleccion.insertOne(recorrido);
        return recorrido.getId();
    }

    /**
     * Metodo que recupera el recorrido con el nombre dado por el parametro.
     *
     * @param nombre es el nombre del recorrido.
     * @return el recorrido que se recupero.
     */
    protected Recorrido recuperar(String nombre) {
        MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);
        Recorrido recorrido = coleccion.find(eq("nombre", nombre)).first();
        return recorrido;
    }

    /**
     * Metodo que permite actualizar un recorrido.
     *
     * @param recorrido es el itinerario a actualizar.
     */
    protected void actualizar(Recorrido recorrido) {
        MongoCollection<Recorrido> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Recorrido.class);

        coleccion.replaceOne(eq("_id", recorrido.getId()), recorrido);
    }
}
