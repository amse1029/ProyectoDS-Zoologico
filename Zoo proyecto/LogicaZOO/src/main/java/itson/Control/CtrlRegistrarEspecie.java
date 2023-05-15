/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.Control;

import Dominio.Animal;
import Dominio.CargoEspecie;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import itson.DAOs.FabricaDatos;
import itson.DAOs.IDatos;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author julio
 */
public class CtrlRegistrarEspecie {

    private IDatos datos;

    public CtrlRegistrarEspecie() {
        this.datos = FabricaDatos.crearInstancia();
    }

    public List<Cuidador> recuperarCuidadores() {
        List<Cuidador> cuidadores = new LinkedList<>();
        cuidadores = datos.recuperarCuidadores();
        if (cuidadores.isEmpty()) {
            datos.agregarCuiadadores();
            cuidadores = datos.recuperarCuidadores();
            return cuidadores;
        } else {
            return cuidadores;
        }
    }

    public List<Habitat> recuperarHabitats() {
        List<Habitat> habitats = new LinkedList<>();
        habitats = datos.recuperarHabitats();
        return habitats;
    }

    public boolean consultaEspecieNombreCientifico(String nombreCientifico) {
        Especie especie = null;
        especie = datos.buscarNombreCientificoEspecie(nombreCientifico);
        if (especie == null) {
            return false; // no existe la especie
        } else {
            return true;
        }
    }

    public Animal consultaAnimal(String nombre) {
        Animal animal = null;
        animal = datos.consultaAnimal(nombre);
        return animal;
    }

    public Especie recuperarEspecie(String nombre) {
        Especie especie = null;
        especie = datos.recuperaEspecieNombre(nombre);
        if (especie != null) {
            //setear animales a la especie
            List<Cuidador> cuidadores = new LinkedList<>();
            List<Cuidador> cuidadoresCargo = new LinkedList<>();
            List<Animal> animales = new LinkedList<>();
            animales = datos.recuperaAnimales(especie.getId());
            especie.setAnimales(animales);

            List<CargoEspecie> cargoEspecies = new LinkedList<>();
            cargoEspecies = datos.consultaEspeciesCargoEspecie(especie);
            cuidadores = datos.recuperarCuidadores();

            for (CargoEspecie cargoEspecy : cargoEspecies) {
                for (Cuidador cuidador : cuidadores) {
                    if (cargoEspecy.getCuidadorId().equals(cuidador.getId())) {
                        cuidadoresCargo.add(cuidador);
                    }
                }
            }
            especie.setCuiadadores(cuidadoresCargo);

            return especie;
        } else {
            return especie;
        }
    }

    public void guardarAnimal(Animal animal) {
        datos.guardarAnimal(animal);
    }

    public void eliminarAnimal(Animal animal) {
        datos.eliminarAnimal(animal);
    }

    public ObjectId actualizarEspecie(Especie especie) {
        this.gestionAnimales(especie);
        this.gestionarCuidadoresCargo(especie);
        especie.setAnimales(null);
        especie.setCuiadadores(null);
        datos.actualizarEspecie(especie);
        return especie.getId();
    }

    public ObjectId guardarEspecie(Especie especie) {
        if (especie.getId()!=null) {
            this.actualizarEspecie(especie);
            return especie.getId();
        } else {
            List<Animal> animales = especie.getAnimales();
            List<Cuidador> cuidadores = especie.getCuiadadores();
            especie.setAnimales(null);
            especie.setCuiadadores(null);
            ObjectId idEspecieGuardada = datos.guardarEspecie(especie);
            for (Animal animal : animales) {
                animal.setEspecieId(idEspecieGuardada);
                this.guardarAnimal(animal);
            }
            for (Cuidador cuidador : cuidadores) {
                CargoEspecie cargoEspecie = new CargoEspecie(new Date(), cuidador.getId(), idEspecieGuardada);
                this.guardarCargoEspecie(cargoEspecie);
            }
            return idEspecieGuardada;
        }
    }

    public void gestionAnimales(Especie especie) {
        List<Animal> animalesNuevos = especie.getAnimales();

        List<Animal> animalesGuardados = datos.recuperaAnimales(especie.getId());

        for (Animal animalGuardado : animalesGuardados) {
            boolean encontrado = false;
            for (Animal animalNuevo : animalesNuevos) {
                if (animalGuardado.getNombre().equalsIgnoreCase(animalNuevo.getNombre())) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                eliminarAnimal(animalGuardado);
            }
        }

        for (Animal animalNuevo : animalesNuevos) {
            boolean encontrado = false;
            for (Animal animalGuardado : animalesGuardados) {
                if (animalNuevo.getNombre().equalsIgnoreCase(animalGuardado.getNombre())) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                animalNuevo.setEspecieId(especie.getId());
                guardarAnimal(animalNuevo);
            }
        }
    }

    public void gestionarCuidadoresCargo(Especie especie) {
        List<Cuidador> cuidadoresNuevos = especie.getCuiadadores();

        List<CargoEspecie> cuidadoresGuardado = datos.consultaEspeciesCargoEspecie(especie);
        
        for (CargoEspecie cuidadorGuardado : cuidadoresGuardado) {
            boolean encontrado = false;
            for (Cuidador cuidadorNuevo : cuidadoresNuevos) {
                if(cuidadorGuardado.getCuidadorId().equals(cuidadorNuevo.getId())){
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                eliminarCargoEspecie(cuidadorGuardado);
            }
        }
        
        for (Cuidador cuidadorNuevo : cuidadoresNuevos) {
          boolean encontrado = false;
           for (CargoEspecie cuidadorGuardado : cuidadoresGuardado) {
               if(cuidadorNuevo.getId().equals(cuidadorGuardado.getCuidadorId())){
                   encontrado = true;
                    break;
               }
           }
           if (!encontrado) {
               CargoEspecie cargoEspecie = new CargoEspecie(new Date(), cuidadorNuevo.getId(), especie.getId());
               this.guardarCargoEspecie(cargoEspecie);
            }
        }
        

    }

    public void guardarCargoEspecie(CargoEspecie cargoEspecie) {
        datos.guardarCargoEspecie(cargoEspecie);
    }

    public void eliminarCargoEspecie(CargoEspecie cargoEspecie) {
        datos.eliminarCargoEspecie(cargoEspecie);
    }
}
