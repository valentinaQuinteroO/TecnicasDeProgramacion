package animales;

import animales.Animal;

/**
 *
 * @author Valentina
 */
public class AnimalDomestico extends Animal{
    private String uso; 

    /**
     * Animal doméstico hereda de la clase Animal
     * Tiene todos sus atributos adicionando el uso que
     * se le puede dar a cada animal doméstico.
     */
    public AnimalDomestico() {
    }

    public AnimalDomestico(String uso) {
        this.uso = uso;
    }

    public AnimalDomestico(String uso, int codigo, String nombre, String especie) {
        super(codigo, nombre, especie);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return super.toString() + ", uso=" + uso + '}';
    }
    
}
