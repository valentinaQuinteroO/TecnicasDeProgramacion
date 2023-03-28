package boleteria;

public class PlanGeneral extends Plan{
    private String temaPlan;

    public PlanGeneral() {
    }
    
    public PlanGeneral(String temaPlan) {
        super();
        this.temaPlan = temaPlan;
        modificarPorTema();
    }
    
    private void modificarPorTema(){
        if(temaPlan.equalsIgnoreCase("Plan Salvaje")){
            setPrecio(20000);
            setDuracion(2);
        }else if(temaPlan.equalsIgnoreCase("Plan Mariposario")){
            setPrecio(10000);
            setDuracion(1);
        }else if(temaPlan.equalsIgnoreCase("Plan Venenoso")){
            setPrecio(25000);
            setDuracion(2);
        }else if(temaPlan.equalsIgnoreCase("Plan Granja")){
            setPrecio(30000);
            setDuracion(3);
        }else if(temaPlan.equalsIgnoreCase("Plan Acuario")){
            setPrecio(35000);
            setDuracion(3);
        }
    }
    
    public String mostrarInfoPlan(String tipoPlan){
        String infoPlan = "";
        if(tipoPlan.equalsIgnoreCase("Plan Salvaje")){
            infoPlan = "PLAN SALVAJE:\n"
                    + "Descripcion: Por la compra de una boleta con este plan se le dará un recorrido\n"
                    + " por todo el sector de los animales salvajes, estara en compañia de un guia experto\n"
                    + " en estos animales\n"
                    + "Duracion: El recorrido completo tendra una duracion de 2h\n"
                    + "Precio: Este plan tiene un costo de $20000 sin refrigerio o souvenir";
        }else if(tipoPlan.equalsIgnoreCase("Plan Mariposario")){
            infoPlan = "PLAN MARIPOSARIO:\n"
                    + "Descripcion: Por la compra de una boleta con este plan podrá ingresar al mariposario\n"
                    + " en compañia de expertos en asuntos de mariposas para mejorar su experiencia\n"
                    + ". Ademas, se le dara una fragancia de lavanda que atrae a todas las mariposas.\n"
                    + "Duracion: El recorrido completo tendra una duracion de 1h\n"
                    + "Precio: Este plan tiene un costo de $10000 sin refrigerio o souvenir";
        }else if(tipoPlan.equalsIgnoreCase("Plan Venenoso")){
            infoPlan = "PLAN VENENOSO:\n"
                    + "Descripcion: Por la compra de una boleta con este plan, podrá ingresar al sector\n"
                    + " donde se encuentran varias serpientes y arañas. Este lugar tiene una restriccion\n"
                    + "de edad, ya que solo pueden ingresar mayores de 15 años. En este sitio algunos guias\n"
                    + " le mostraran como se hacen algunas vacunas para ciertos venenos y demas curiosidades "
                    + "sobre este tipo de animaes\n"
                    + "Duracion: El recorrido completo tendra una duracion de 2h\n"
                    + "Precio: Este plan tiene un costo de $25000 sin refrigerio o souvenir";
        }else if(tipoPlan.equalsIgnoreCase("Plan Granja")){
            infoPlan = "PLAN GRANJA:\n"
                    + "Descripcion: Por la compra de una boleta con este plan, podra visitar varios\n"
                    + "animales de granja y con la compañia de varios guias puede aprender a\n"
                    + "ordeñar, alimentar a los conejos y a las cabras entre otras actividades.\n"
                    + "Duracion: El recorrido completo tendra una duracion de 3h\n"
                    + "Precio: Este plan tiene un costo de $30000 sin refrigerio o souvenir";
        }else if(tipoPlan.equalsIgnoreCase("Plan Acuario")){
            infoPlan = "PLAN ACUARIO:\n"
                    + "Descripcion: Por la compra de una boleta con este plan, podrá visitar \n"
                    + "el acuario del zoológico con la compañía de diferentes guías\n"
                    + "Duracion: El recorrido completo tendra una duracion de 3h\n"
                    + "Precio: Este plan tiene un costo de $35 000 sin refrigerio o souvenir";
        } 
        return infoPlan;        
    }
}
