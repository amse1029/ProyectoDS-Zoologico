/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Dominio.Horario;
import Dominio.Itinerario;
import Dominio.Recorrido;
import Dominio.Zona;
import itson.Control.FabricaLogica;
import itson.Control.FachadaLogica;
import java.util.List;

/**
 *
 * @author julio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmInicial frm = new FrmInicial();
       FachadaLogica fac=new FachadaLogica();
       List<Zona> zonas=null;
       List<Horario> horarios=null;
       fac.guardarItinerario(new Itinerario("Joel",10,25,new Recorrido(),zonas,horarios));
}
}
