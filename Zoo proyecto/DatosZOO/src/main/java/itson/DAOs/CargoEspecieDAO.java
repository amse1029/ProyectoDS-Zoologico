/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;


import Dominio.CargoEspecie;
import Dominio.Cuidador;
import Dominio.Especie;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que permite gestionar los metodos referentes a cargoEspecie 
 * en la base de datos.
 * @author 
 */
public class CargoEspecieDAO {
    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "CargoEspecies";

    /**
     * Metodo constructor que instancia la conexion con la base de datos.
     */
    protected CargoEspecieDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    /**
     * Metodo que permite guardar el cuidador que esta a cargo de la especie.
     * @param cargoEspecie Es el cuidador que esta a cargo de la especie.
     */
    protected void guardar(CargoEspecie cargoEspecie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
         coleccion.insertOne(cargoEspecie); 
    }
    
    /**
     * Metodo uqe permite eliminar el cargo que tiene un cuidador a una especie.
     * @param cargoEspecie Es quien esta a cargo de la especie que se 
     * desea elimnar.
     */
    protected void eliminar(CargoEspecie cargoEspecie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
         coleccion.deleteOne(eq("_id",cargoEspecie.getId())); 
    }
    
     /**
     * Metodo que permite consultar todos los cuidadores ques estan a cargo de 
     * una especie.
     * @param especie Es la especie de la cual se quieren obtener los cargos.
     * @return Una lista con todos los que estan a cargo de una especie.
     */
    protected List<CargoEspecie> consultaEspecies(Especie especie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
        List<CargoEspecie> listaCargoEspecies = new LinkedList<>();
        coleccion.find(eq("especieId",especie.getId())).into(listaCargoEspecies);
        return listaCargoEspecies;
    }
    
     /**
     * Metodo que permite consultar todas las especies que tiene a cargo 
     * un cuidador.
     * @param cuidador Es el cuidador del que se desean obtener los cargos.
     * @return Una lista de los cargos que tiene el cuidador.
     */
    protected List<CargoEspecie> consultaCuidador(Cuidador cuidador){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
        List<CargoEspecie> listaCargoEspecies = new LinkedList<>();
        coleccion.find(eq("especieId",cuidador.getId())).into(listaCargoEspecies);
        return listaCargoEspecies;
    }
}
