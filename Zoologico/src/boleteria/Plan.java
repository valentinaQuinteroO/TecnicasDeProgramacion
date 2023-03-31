package boleteria;

public class Plan {
    protected float precio;
    protected int duracion;
    protected String souvenir;

    public Plan() {
    }

    /**
     * Los Planes pueden ser Abonos o Plabes generales
     * Cada uno de estos va a tener un precio y una duración
     * @param precio
     * @param duracion
     */
    public Plan(float precio, int duracion) {
        this.precio = precio;
        this.duracion = duracion;
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

}
