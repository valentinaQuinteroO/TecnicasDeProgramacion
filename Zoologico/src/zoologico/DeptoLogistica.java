package zoologico;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import view.Index;
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
    
    
    
    
    
    
//    public static void generarPdf() throws DocumentException{
//        Document documento = new Document();
//        try {
//            // Escribir el documento en un archivo
//            PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/Valentina/Desktop/prueba/pruebita.pdf"));
//
//            // Abrir el documento
//            documento.open();
//
//            // Agregar la imagen al documento
//            String rutaImagen = "C:/Users/Valentina/Desktop/GitHub/TecnicasDeProgramacion/Zoologico/src/images/mariposa.jpeg";
//            Image foto = Image.getInstance(new File(rutaImagen).getAbsolutePath());
//            foto.scaleToFit(100, 100);
//            foto.setAlignment(Chunk.ALIGN_MIDDLE);
//            documento.add(foto);
//
//            // Agregar el párrafo al documento
//            String texto = "Hola mundo";
//            Paragraph parrafo = new Paragraph(texto);
//            documento.add(parrafo);    
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Cerrar el documento
//            documento.close();
//        }
//    }
    public static void generarPdf() throws DocumentException {
    Document documento = new Document();
    try {
        // Crear una instancia de PdfWriter y asociarla con el documento
        PdfWriter.getInstance(documento, new FileOutputStream("C:/Users/Valentina/Desktop/prueba/pruebita.pdf"));
        
        // Abrir el documento
        documento.open();
        
        // Agregar la imagen al documento
        String rutaImagen = "C:/Users/Valentina/Desktop/GitHub/TecnicasDeProgramacion/Zoologico/src/images/mariposa.jpeg";
        Image foto = Image.getInstance(new File(rutaImagen).getAbsolutePath());
        foto.scaleToFit(100, 100);
        foto.setAlignment(Chunk.ALIGN_MIDDLE);
        documento.add(foto);
        
        // Crear la tabla
        PdfPTable tabla = new PdfPTable(6);
        
        // Agregar las celdas de la primera fila
        tabla.addCell("PLAN");
        tabla.addCell("VALOR");
        tabla.addCell("CANTIDAD");
        tabla.addCell("VALOR VENTA");
        tabla.addCell("DESCUENTOS");
        tabla.addCell("TOTAL");
        
        // Agregar los datos que me pide el reporte
        for(int i = 0; i < listaClientes.size(); i++){
            tabla.addCell(listaBoletas.get(i).getTipoPlan());
            tabla.addCell(String.valueOf(listaBoletas.get(i).getValorUnidad()));
            tabla.addCell(String.valueOf(listaBoletas.get(i).getCantBoletas()));
            tabla.addCell(String.valueOf(listaBoletas.get(i).getValorVenta()));
            tabla.addCell(String.valueOf(listaBoletas.get(i).getDescuento()));
            tabla.addCell(String.valueOf(listaBoletas.get(i).getCostoTotal()));
        }
        
        
        // Agregar la tabla al documento
        documento.add(tabla);
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Cerrar el documento
        documento.close();
    }
}


    
    
    
    
    public static void evaluarOpciones(int pOpcion) throws IOException{
        
        while(pOpcion != 1111){
            System.out.println("Contraseña incorrecta, por favor ingresela de nuevo: ");
            pOpcion = ingresarContraseña();
        }
        
        new Index().setVisible(true);
        
    }
}
