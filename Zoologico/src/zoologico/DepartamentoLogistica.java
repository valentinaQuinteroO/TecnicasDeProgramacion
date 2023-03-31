package zoologico;

import cliente.Cliente;
import boleteria.Boleta;
import utilidades.Typing;
import animales.AnimalSalvaje;
import animales.AnimalDomestico;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.ArrayList;
import pdf.Pdf;
import view.Index;
/**
 *
 * @author Valentina
 */
public class DepartamentoLogistica {
    private static final Typing typing = new Typing();
    private static ArrayList<AnimalDomestico> listaAnimalesDomesticos = new ArrayList<>();
    private static ArrayList<AnimalSalvaje> listaAnimalesSalvajes = new ArrayList<>();
    private static ArrayList<Boleta> listaBoletas = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    /** 
     * DepartamentoLogistica es una clase en la cual se realizan las
     * funciones administrativas del zoológico.
     */
    public DepartamentoLogistica() {
    }
    
    public static void administracionZoo() throws IOException{    // Es estático porque sólo se tiene un departamento de logística 
        int opcion = ingresarContraseña();
        evaluarOpciones(opcion);
    }    
    
    public static void ingresarAnimalSalvaje(AnimalSalvaje as) throws IOException{
        listaAnimalesSalvajes.add(as);
        System.out.println("Bienvenido, "+as.toString());
    }
    
    public static void ingresarAnimalDomestico(AnimalDomestico ad) throws IOException{
        listaAnimalesDomesticos.add(ad);
        System.out.println("Bienvenido, "+ad.toString());
        
    }
    
    public static void ingresarCliente(Cliente client) throws IOException{
        listaClientes.add(client);
        System.out.println("Bienvenido, " + client.toString());
    }
    
    public static void ingresarBoleta(Boleta bol)
    {
        listaBoletas.add(bol);
    }
    
    
    public static int ingresarContraseña() throws IOException{
        int pOpcion = typing.readInt("Ingrese la contraseña para iniciar el sistema: ");
        return pOpcion;
    }
    
    public static void generarPdf() throws DocumentException{
        Pdf nuevoPdf = new Pdf(listaBoletas);
        
    }

    
    public static void evaluarOpciones(int pOpcion) throws IOException{
        
        while(pOpcion != 1111){
            System.out.println("Contraseña incorrecta, por favor ingresela de nuevo: ");
            pOpcion = ingresarContraseña();
        }
        
        new Index().setVisible(true);
        
    }
}
