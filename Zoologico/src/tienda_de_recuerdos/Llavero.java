package tienda_de_recuerdos;

/**
 *
 * @author Valentina
 */
public class Llavero implements Souvenir {
    private float precio;
    private String nombre;

    public Llavero() {
        this.precio = 10000;
        this.nombre = "Llavero";
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
