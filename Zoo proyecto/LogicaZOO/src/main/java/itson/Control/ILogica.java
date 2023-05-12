/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.Control;

import Dominio.Habitat;

/**
 *
 * @author julio
 */
public interface ILogica {
    
    public Object[] recuperarDatosHabitats();
    public Habitat buscarHabitat(String nombre);
    public Boolean guardarHabitat(Habitat habitat);
}
