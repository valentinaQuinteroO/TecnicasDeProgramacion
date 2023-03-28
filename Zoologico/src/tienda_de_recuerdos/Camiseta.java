package tienda_de_recuerdos;
/**
 *
 * @author Valentina
 */
public class Camiseta implements Souvenir {
    private float precio;
    private String nombre;

    public Camiseta() {
        this.precio = 50000;
        this.nombre = "Camiseta";
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
