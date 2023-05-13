/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;


import Dominio.Cuidador;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class CuidadoresDAO {

    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "Cuidadores";

    public CuidadoresDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }

    public void agregarCuiadadores() {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Cuidador cuidador1 = new Cuidador("Juan Perez", "Calle 123", "555-1234", formatoFecha.parse("15/05/2022"));
            Cuidador cuidador2 = new Cuidador("Maria Lopez", "Avenida 456", "555-5678",formatoFecha.parse("15/04/2021"));
            Cuidador cuidador3 = new Cuidador("Pedro Martinez", "Plaza Principal", "555-9876", formatoFecha.parse("20/10/2022"));
            Cuidador cuidador4 = new Cuidador("Ana Garcia", "Calle 789", "555-4321",formatoFecha.parse("16/05/2022"));
            Cuidador cuidador5 = new Cuidador("Luisa Rodriguez", "Avenida 012", "555-2468", formatoFecha.parse("15/12/2022"));
            Cuidador cuidador6 = new Cuidador("Jorge Gonzalez", "Parque Central", "555-3698", formatoFecha.parse("15/01/2023"));
             MongoCollection<Cuidador> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Cuidador.class);
        coleccion.insertMany(Arrays.asList(cuidador1,cuidador2,cuidador3,cuidador4,cuidador5,cuidador6));
        } catch (Exception e) {
            System.out.println("Error al parsear fecha: " + e.getMessage());
        }
    }

    public List<Cuidador> recuperar() {
        MongoCollection<Cuidador> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Cuidador.class);
        List<Cuidador> cuidadores = new LinkedList<>();
        coleccion.find().into(cuidadores);
        return cuidadores;
    }
    
    public List<Cuidador> recuperarId(ObjectId idCuidador) {
        MongoCollection<Cuidador> coleccion
                = BASE_DATOS.getCollection(NOMBRE_COLECCION, Cuidador.class);
        List<Cuidador> cuidadores = new LinkedList<>();
        coleccion.find(eq("id",idCuidador)).into(cuidadores);
        return cuidadores;
    }

}
