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
 * @author
 */
public class CtrlRegistrarEspecie {

    private IDatos datos;

    /**
     * Constructor que inicializa datos con la instancia de FabricaDatos.
     */
    public CtrlRegistrarEspecie() {
        this.datos = FabricaDatos.crearInstancia();
    }

    /**
     * Método que recupera los cuidadores.
     *
     * @return Lista de cuidadores.
     */
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

    /**
     * Método que recupera los hábitats.
     *
     * @return Lista de hábitats.
     */
    public List<Habitat> recuperarHabitats() {
        List<Habitat> habitats = new LinkedList<>();
        habitats = datos.recuperarHabitats();
        return habitats;
    }

    /**
     * Método que consulta una especie por su nombre científico.
     *
     * @param nombreCientifico Nombre científico de la especie.
     * @return true si se encontró, false en caso contrario.
     */
    public boolean consultaEspecieNombreCientifico(String nombreCientifico) {
        Especie especie = null;
        especie = datos.buscarNombreCientificoEspecie(nombreCientifico);
        if (especie == null) {
            return false; // no existe la especie
        } else {
            return true;
        }
    }

    /**
     * Método que consulta un animal por su nombre.
     *
     * @param nombre Nombre del animal.
     * @return Animal encontrado.
     */
    public Animal consultaAnimal(String nombre) {
        Animal animal = null;
        animal = datos.consultaAnimal(nombre);
        return animal;
    }

    /**
     * Método que recupera la lista de animales en una especie.
     *
     * @param especie Especie de la que se requieren los animales.
     * @return Lista con los animales de dicha especie.
     */
    public List<Animal> recuperarAnimales(Especie especie) {
        List<Animal> animales = new LinkedList<>();
        animales = datos.recuperaAnimales(especie.getId());
        return animales;
    }

    /**
     * Método que recupera una especie por su nombre.
     *
     * @param nombre Nombre de la especie.
     * @return Especie encontrada.
     */
    public Especie recuperarEspecie(String nombre) {
        Especie especie = null;
        especie = datos.recuperaEspecieNombre(nombre);
        if (especie != null) {
            //setear animales a la especie
            List<Cuidador> cuidadores = new LinkedList<>();
            List<Cuidador> cuidadoresCargo = new LinkedList<>();
            List<Animal> animales = this.recuperarAnimales(especie);

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
            especie.setCuidadores(cuidadoresCargo);

            return especie;
        } else {
            return especie;
        }
    }

    /**
     * Método que guarda un animal.
     *
     * @param animal Animal que se quiere guardar.
     */
    public void guardarAnimal(Animal animal) {
        datos.guardarAnimal(animal);
    }

    /**
     * Método que elimina un animal.
     *
     * @param animal Animal que se quiere eliminar.
     */
    public void eliminarAnimal(Animal animal) {
        datos.eliminarAnimal(animal);
    }

    /**
     * Método que consulta una especie por su nombre científico.
     *
     * @param nombreCientifico Nombre científico de la especie.
     * @return Especie encontrada.
     */
    public Especie consultaEspecie(String nombreCientifico) {
        Especie especie = datos.buscarNombreCientificoEspecie(nombreCientifico);
        return especie;
    }

    /**
     * Método que actualiza una especie.
     *
     * @param especie Especie que se quiere actualizar.
     * @return Id de la especie actualizada.
     */
    public ObjectId actualizarEspecie(Especie especie) {
        Especie consultada = this.consultaEspecie(especie.getNombreCientifico());
        if (consultada == null || consultada.equals(especie)) {
            this.gestionAnimales(especie);
            this.gestionarCuidadoresCargo(especie);
            especie.setAnimales(null);
            especie.setCuidadores(null);
            datos.actualizarEspecie(especie);
            return especie.getId();
        } else {
            return null;
        }
    }

    /**
     * Método que guarda una especie.
     *
     * @param especie Especie que se quiere guardar.
     * @return Id de la especie guardada.
     */
    public ObjectId guardarEspecie(Especie especie) {
        if (especie.getId() != null) {
            ObjectId idEspecieGuardada = this.actualizarEspecie(especie);
            return idEspecieGuardada;
        } else {
            Especie consultada = this.consultaEspecie(especie.getNombreCientifico());
            if (consultada == null || consultada.equals(especie)) {
                List<Animal> animales = especie.getAnimales();
                List<Cuidador> cuidadores = especie.getCuidadores();
                especie.setAnimales(null);
                especie.setCuidadores(null);
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
            } else {
                return null;
            }

        }
    }

    /**
     * Método que gestiona los animales de cierta especie.
     *
     * @param especie Especie de la que se quieren gestionar los animales.
     */
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

    /**
     * Método que gestiona los cuidadores a cargo de cierta especie.
     *
     * @param especie Especie de la que se quieren saber los cuidadores.
     */
    public void gestionarCuidadoresCargo(Especie especie) {
        List<Cuidador> cuidadoresNuevos = especie.getCuidadores();

        List<CargoEspecie> cuidadoresGuardado = datos.consultaEspeciesCargoEspecie(especie);

        for (CargoEspecie cuidadorGuardado : cuidadoresGuardado) {
            boolean encontrado = false;
            for (Cuidador cuidadorNuevo : cuidadoresNuevos) {
                if (cuidadorGuardado.getCuidadorId().equals(cuidadorNuevo.getId())) {
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
                if (cuidadorNuevo.getId().equals(cuidadorGuardado.getCuidadorId())) {
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

    /**
     * Método que guarda el cargo de una especie.
     *
     * @param cargoEspecie Cargo de la especie que se quiere guardar.
     */
    public void guardarCargoEspecie(CargoEspecie cargoEspecie) {
        datos.guardarCargoEspecie(cargoEspecie);
    }

    /**
     * Método que elimina el cargo de una especie.
     *
     * @param cargoEspecie Cargo de la especie que se quiere eliminar.
     */
    public void eliminarCargoEspecie(CargoEspecie cargoEspecie) {
        datos.eliminarCargoEspecie(cargoEspecie);
    }

    /**
     * Método que recupera todas las especies.
     *
     * @return Lista de todas las especies.
     */
    public List<Especie> recuperarEspecies() {
        List<Especie> especies = datos.recuperarTodasEspecies();
        return especies;
    }
}
