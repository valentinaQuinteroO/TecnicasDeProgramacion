package boleteria;

public class Boleta {
    private int cantBoletas;
    private String tipoBoleta, tipoPlan;
    private float costoTotal;
    private float valorUnidad;
    private float descuento;
    private float valorVenta;
    
    public Boleta() {
    }

    public Boleta(int cantBoletas, String tipoBoleta, String tipoPlan) {
        this.cantBoletas = cantBoletas;
        this.tipoBoleta = tipoBoleta;
        this.tipoPlan = tipoPlan;
        this.descuento = asignarDescuento(cantBoletas, tipoBoleta);
        this.valorUnidad = precioPortipo(tipoPlan, tipoBoleta, cantBoletas);
        this.valorVenta = asignarValorVenta(tipoBoleta, cantBoletas, valorUnidad);
        this.costoTotal = (valorVenta) - ((valorVenta)*(descuento / 100));
    }
    
    public static float precioPortipo(String tipoPlan, String tipoBoleta, int cantBoletas){
        float precio = 0;
        
        if(tipoBoleta.equalsIgnoreCase("plan") || tipoBoleta.equalsIgnoreCase("plan general")){
            PlanGeneral plan = new PlanGeneral(tipoPlan);
            precio = plan.getPrecio();
        }else if(tipoBoleta.equalsIgnoreCase("abono") || tipoBoleta.equalsIgnoreCase("abonos")){
            Abono ab = new Abono(tipoPlan, cantBoletas);
            precio = ab.getPrecio();
        }
        
        return precio;
    }
    
    public static float asignarValorVenta(String tipoBoleta, int cantBol, float valorUnidad){
        float valor = 0; 
        if(tipoBoleta.equalsIgnoreCase("plan") || tipoBoleta.equalsIgnoreCase("plan general")){
            valor = cantBol * valorUnidad;
        }else if(tipoBoleta.equalsIgnoreCase("abono") || tipoBoleta.equalsIgnoreCase("abonos")){
            valor = valorUnidad;
        }
        return valor;
        
    }
    
    public static float asignarDescuento(int cantBoletas, String tipoBoleta){
        float dcto = 0;
        if(tipoBoleta.equalsIgnoreCase("plan") || tipoBoleta.equalsIgnoreCase("plan general")){
            if( 5 < cantBoletas && cantBoletas < 10){
                dcto = 5;
            } else if (cantBoletas >= 10){
                dcto = 10;
            }
        }
        return dcto;
    }
    
    public int getCantBoletas() {
        return cantBoletas;
    }

    public void setCantBoletas(int cantBoletas) {
        this.cantBoletas = cantBoletas;
    }

    public String getTipoBoleta() {
        return tipoBoleta;
    }

    public void setTipoBoleta(String tipoBoleta) {
        this.tipoBoleta = tipoBoleta;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public float getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(float valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(float valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    
    
    @Override
    
    public String toString() {
        return  "Boleta{" + "cantidad=" + cantBoletas + ", tipo=" + tipoBoleta + ", plan="+ tipoPlan + ", total= $" + costoTotal + "}\n";
    }
    
}
