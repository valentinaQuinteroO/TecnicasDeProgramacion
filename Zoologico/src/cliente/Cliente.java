package cliente;

public class Cliente {
    private String nombre;
    private int id;
    private float compra;

    public Cliente() {
    }

    public Cliente(String nombre, int id, float compra) {
        this.nombre = nombre;
        this.id = id;
        this.compra = compra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCompra() {
        return compra;
    }

    public void setCompra(float compra) {
        this.compra = compra;
    }
    
    @Override
    
    public String toString() {
        return  "Cliente{" + "nombre=" + nombre + ", identificacion=" + id + ", paga= $"+ compra + "}\n";
    }
    
}
