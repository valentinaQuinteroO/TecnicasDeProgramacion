package animales;

import animales.Animal;

/**
 *
 * @author Valentina
 */
public class AnimalSalvaje extends Animal {
    private String nivelPeligrosidad;

    /**
     * Animal salvaje hereda de la clase Animal
     * Tiene todos sus atributos adicionando la peligrosidad
     * que posee cada animal salvaje.
     */
    public AnimalSalvaje() {
    }

    public AnimalSalvaje(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public AnimalSalvaje(String nivelPeligrosidad, int codigo, String nombre, String especie) {
        super(codigo, nombre, especie);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }
    
    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String nivelPeligrosidad) {
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    @Override
    public String toString() {
        return super.toString() +   "nivelPeligrosidad=" + nivelPeligrosidad + '}';
    }
    
    public boolean aumentarSeguridad(){
        boolean aumento;
        aumento = getNivelPeligrosidad().equalsIgnoreCase("Alto");
        return aumento;
    }
    
}
