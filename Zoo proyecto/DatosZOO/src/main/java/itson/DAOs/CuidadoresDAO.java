/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.DAOs;

import Dominio.Cuidador;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

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
    
    public List<Cuidador> recuperar(){
       MongoCollection<Cuidador> coleccion
                = BASE_DATOS.getCollection( NOMBRE_COLECCION, Cuidador.class);
       List<Cuidador> cuidadores = new LinkedList<>();
       coleccion.find().into(cuidadores);
       return cuidadores; 
    }
    
    
    
}
