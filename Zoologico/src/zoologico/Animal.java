package zoologico;

/**
 *
 * @author Valentina
 */

public class Animal {
    private int codigo;
    private String nombre;
    private String especie;
    
    /**
     * La clase Animal es la clase madre
     * De esta heredan AnimalSalvaje y AnimalDomestico
     * contiene métodos como para retornar o establecer el código y el nombre del animal
     */
    public Animal(){
    }

    public Animal(int codigo, String nombre, String especie) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
    }
        
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override   // Sobreescritura trata de que dos métodos se llaman igual pero pertenecen a clases diferentes.
                // El método toString() ya está definido en la clase Object pero entonces con esto hecho, cuando
                // invocan al toString() de Animal se llama esto y no el toString de Object
    /**
     * Este método le permite al usuario observar de forma más personalizada
     * los datos del animal en cuestión
     */
    public String toString() {
        return  "Animal{" + "codigo=" + codigo + ", nombre=" + nombre + ", especie="+ especie;
    }
    
}
