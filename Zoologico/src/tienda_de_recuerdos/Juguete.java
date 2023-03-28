package tienda_de_recuerdos;

/**
 *
 * @author Valentina
 */
public class Juguete implements Souvenir {
    private float precio;
    private String nombre;

    public Juguete() {
        this.precio = 20000;
        this.nombre = "Juguete";
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

