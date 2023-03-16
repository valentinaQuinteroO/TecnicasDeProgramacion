package zoologico;

public class Plan {
    protected float precio;
    protected int duracion;
    protected String souvenir;

    public Plan() {
    }

    public Plan(float precio, int duracion, String souvenir) {
        this.precio = precio;
        this.duracion = duracion;
        this.souvenir = souvenir;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSouvenir() {
        return souvenir;
    }

    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }
    
}
