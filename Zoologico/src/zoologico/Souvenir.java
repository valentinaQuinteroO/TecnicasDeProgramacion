package zoologico;

public class Souvenir {
    private String nombre;
    private double precio;
    private int cantidad;

    public Souvenir() {
    }

    public Souvenir(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean vender(int cantVender) {
        if (cantidad > cantVender) {
            cantidad=-cantVender;
            return true;
        } else {
            return false;
        }
    }
}
