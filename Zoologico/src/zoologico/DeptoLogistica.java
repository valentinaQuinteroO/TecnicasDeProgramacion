package zoologico;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Valentina
 */
public class DeptoLogistica {
    private static final Typing typing = new Typing();  // Una constante
    private static ArrayList<AnimalDomestico> listaAnimalesDomesticos = new ArrayList<>();
    private static ArrayList<AnimalSalvaje> listaAnimalesSalvajes = new ArrayList<>();
    private static ArrayList<Boleta> listaBoletas = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    
    public static void admZoo() throws IOException{    // Es estático porque sólo se tiene un departamento de logística 
        int opcion = mostrarOpciones();
        evaluarOpciones(opcion);
    }    
    
    public static void ingresarAnimalSalvaje() throws IOException{    
        AnimalSalvaje as = new AnimalSalvaje(typing.readString("Ingrese el nivel de peligrosidad del animal: "),
                typing.readInt("Ingrese el código del animal: "),typing.readString("Ingrese el nombre del animal: "),
                typing.readString("Ingrese la especie del animal :"));
        listaAnimalesSalvajes.add(as);  // Se agrega el animal doméstico a la lista.
        System.out.println("Bienvenido, "+as.toString());
    }
    
    public static void ingresarAnimalDomestico() throws IOException{
        AnimalDomestico ad = new AnimalDomestico(typing.readString("Ingrese el uso que le va a dar al animal: "),
                typing.readInt("Ingrese el código del animal doméstico: "), typing.readString("Ingrese el nombre: "),
                typing.readString("Ingrese la especie: "));
        listaAnimalesDomesticos.add(ad);
        System.out.println("Bienvenido, "+ad.toString());
        
    }
    
    public static void verPlanes() throws IOException{
        PlanGeneral p = new PlanGeneral();
        System.out.println("Zoologico ilogico cuenta con los siguientes planes generales:\n"
                + "Plan salvaje\n"
                + "Plan mariposario\n"
                + "Plan venenoso\n"
                + "Plan granja\n");
        System.out.print(p.mostrarInfoPlan(typing.readString("Si quiere ver detalles del plan, escriba su nombre: ")));
    }
    
    public static void verAbono() throws IOException{
        Abono ab = new Abono();
        System.out.println("Zoologico ilogico cuenta con los siguientes abonos: \n"
                + "Plan escolar\n"
                + "Plan empresarial\n");
        System.out.println(ab.mostrarInfoPlan(typing.readString("Si desea ver detalles de algun abono, escriba su nombre: ")));
        
    }
    
    public static void comprarBoletas() throws IOException{
        
        String nombre = typing.readString("Ingrese el nombre del cliente: ");
        int id = typing.readInt("Ingrese la identificacion del cliente: ");
        
        String tipoBoleta = typing.readString("Ingrese el tipo de boleta (abono o plan) que desea: ");
        String tipoPlan = typing.readString("Ingrese el tipo de plan que va a escoger");
        int cantBol = typing.readInt("Ingrese la cantidad de boletas que quiere comprar.");
        Boleta bol = new Boleta(cantBol, tipoBoleta, tipoPlan);
        listaBoletas.add(bol);
        Cliente client = new Cliente(nombre, id, bol.getCostoTotal());
        System.out.println("Bienvenido, " + client.toString());
        listaClientes.add(client);
        
    }
    
    
    public static int mostrarOpciones() throws IOException{
        System.out.println("Que desea hacer: 1 Ingreso animal salvaje, 2 Ingreso animal doméstico,"
                + "3 Ver planes, 4 Ver abonos, 5 Comprar boletas");
        int pOpcion = typing.readInt("Ingrese la opción que necesita: ");
        return pOpcion;
    }
    
    public static void evaluarOpciones(int pOpcion) throws IOException{
        if(pOpcion == 1){
            ingresarAnimalSalvaje();
        }else if(pOpcion == 2){
            ingresarAnimalDomestico();
        }else if(pOpcion == 3){
            verPlanes();
        }else if(pOpcion == 4){
            verAbono();
        }else if(pOpcion == 5){
            comprarBoletas();
        }
    }
}
