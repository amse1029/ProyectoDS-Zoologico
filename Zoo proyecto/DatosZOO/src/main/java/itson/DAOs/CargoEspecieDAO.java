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
 *
 * @author julio
 */
public class CargoEspecieDAO {
    private final MongoDatabase BASE_DATOS;
    private final String NOMBRE_COLECCION = "CargoEspecies";

    public CargoEspecieDAO() {
        this.BASE_DATOS = Conexion.dameInstancia();
    }
    
    public void guardar(CargoEspecie cargoEspecie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
         coleccion.insertOne(cargoEspecie); 
    }
    
    public void eliminar(CargoEspecie cargoEspecie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
         coleccion.deleteOne(eq("id",cargoEspecie.getId())); 
    }
    
    public List<CargoEspecie> consultaEspecies(Especie especie){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
        List<CargoEspecie> listaCargoEspecies = new LinkedList<>();
        coleccion.find(eq("especieId",especie.getId())).into(listaCargoEspecies);
        return listaCargoEspecies;
    }
    
    public List<CargoEspecie> consultaCuidador(Cuidador cuidador){
        MongoCollection<CargoEspecie> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, CargoEspecie.class);
        List<CargoEspecie> listaCargoEspecies = new LinkedList<>();
        coleccion.find(eq("especieId",cuidador.getId())).into(listaCargoEspecies);
        return listaCargoEspecies;
    }
}
