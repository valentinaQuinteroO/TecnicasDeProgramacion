package zoologico;

public class Abono extends Plan {
    
    private String tipoPlan;
    private int cantPersonas;

    public Abono() {
        
    }

    public Abono(String tipoPlan, int cantPersonas) {
        super(); // llamada al constructor de la superclase Plan
        this.tipoPlan = tipoPlan;
        this.cantPersonas = cantPersonas;
        modificarPorTipo();
    }
    
    private void modificarPorTipo(){
        if(tipoPlan == null || cantPersonas <= 0){
            return;
        }
        if(tipoPlan.equalsIgnoreCase("Plan Escolar")){
            if(cantPersonas > 0 && cantPersonas < 30){
                setPrecio(150000);
            }else if(cantPersonas < 50){
                setPrecio(250000);
            }else if(cantPersonas <= 100){
                setPrecio(350000);
            }
            setDuracion(3);
            setSouvenir("Jirafa de juguete");
        } else if(tipoPlan.equalsIgnoreCase("Plan Empresarial")){
            if(cantPersonas > 0 && cantPersonas < 20){
                setPrecio(150000);
            }else if(cantPersonas < 30){
                setPrecio(300000);
            }else if(cantPersonas <= 50){
                setPrecio(400000);
            }
            setDuracion(4);
            setSouvenir("Ballena de juguete");
        }
    }
    
    public String mostrarInfoPlan(String tipoPlan){
        String infoPlan = "";
        if(tipoPlan.equalsIgnoreCase("Plan Escolar")){
            infoPlan = "PLAN ESCOLAR:\n Descripcion: Los estudiantes podrán recorrer el Zoologico ilogico acompañados de hasta cinco guias,"
                    + "el recorrido comienza por los animales domésticos, continúa con los animales salvajes y finaliza con los"
                    + " animales acuaticos.\n Duracion: 3h\n Precio:\n"
                    + "Si son menos de 30 estudiantes, el total a pagar es: $150000\n"
                    + "Si son entre 30 y 50 estudiantes, el total a pagar es: $250000\n"
                    + "Si son entre 50 y 100 estudiantes, el total a pagar es: $350000\n";
        }else if(tipoPlan.equalsIgnoreCase("Plan Empresarial")){
            infoPlan = "PLAN EMPRESARIAL:\n Descripcion: Los empleados podrán recorrer el Zoologico ilogico acompañados de dos guias,"
                    + "el recorrido comienza por los animales domésticos, continúa con los animales salvajes y finaliza con los"
                    + " animales acuaticos.\n Duracion: 4h\n Precio:\n"
                    + "Si son menos de 20 empleados, el total a pagar es: $150000\n"
                    + "Si son entre 20 y 30 empleados, el total a pagar es: $300000\n"
                    + "Si son entre 30 y 50 empleados, el total a pagar es: $400000\n";
        }        
        return infoPlan;
    }

}
