package zoologico;

public class Boleta {
    private int cantBoletas;
    private String tipoBoleta, tipoPlan;
    private float costoTotal;
    
    public Boleta() {
    }

    public Boleta(int cantBoletas, String tipoBoleta, String tipoPlan) {
        this.cantBoletas = cantBoletas;
        this.tipoBoleta = tipoBoleta;
        this.tipoPlan = tipoPlan;
        this.costoTotal = calcularTotal(tipoBoleta, tipoPlan, cantBoletas);
    }

    public static float calcularTotal(String tipoBoleta, String tipoPlan, int cantBoletas){
        float precioBol = 0;
        if(tipoBoleta.equalsIgnoreCase("abono") || tipoBoleta.equalsIgnoreCase("abonos")){
            Abono ab = new Abono(tipoPlan, cantBoletas);
            precioBol = ab.getPrecio();
        }else if(tipoBoleta.equalsIgnoreCase("plan")||tipoBoleta.equalsIgnoreCase("plan general")){
            PlanGeneral pg = new PlanGeneral(tipoPlan);
            precioBol = pg.getPrecio() * cantBoletas;
        }
        return precioBol;
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
    
    @Override
    
    public String toString() {
        return  "Boleta{" + "cantidad=" + cantBoletas + ", tipo=" + tipoBoleta + ", plan="+ tipoPlan + ", total= $" + costoTotal + "}\n";
    }
    
}
