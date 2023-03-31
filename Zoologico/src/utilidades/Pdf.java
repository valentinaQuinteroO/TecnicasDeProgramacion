package utilidades;

import boleteria.Boleta;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Valentina
 */
public class Pdf {
    
        
    /** La clase GenerarPdf
     * utiliza la listaBoletas para generar un reporte de 
     * ventas de las boletas del zoológico.
     * @param listaBoletas
     * @throws DocumentException 
     */
    public Pdf(ArrayList<Boleta> listaBoletas) throws DocumentException {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/documentacion/reporteVentas.pdf"));
            documento.open();
            documento.add(crearEncabezado());
            // Agrego un espacio en blanco entre el encabezado y la tablaVentas
            documento.add(new Paragraph(50, " "));
            documento.add(crearTablaVentas(listaBoletas));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            documento.close();
        }
    }
    
    public PdfPTable crearEncabezado() throws BadElementException, IOException{
        // Creo la tabla de la imagen y el texto
        PdfPTable tablaEncabezado = new PdfPTable(2);
        tablaEncabezado.setWidthPercentage(100);

        // Agrego la celda de la imagen
        String rutaImagen = "src/images/ZooLogo.png";
        Image foto = Image.getInstance(new File(rutaImagen).getAbsolutePath());
        foto.scaleToFit(250, 250);
        PdfPCell celdaImagen = new PdfPCell(foto);
        celdaImagen.setBorder(Rectangle.NO_BORDER);
        celdaImagen.setVerticalAlignment(0);
        celdaImagen.setHorizontalAlignment(0);
        tablaEncabezado.addCell(celdaImagen);

        // Agrego la celda del texto
        Paragraph texto = new Paragraph("Zoológico ilógico\nEl Carmen de Viboral, Antioquia\ntel: +57 6045666985");
        PdfPCell celdaTexto = new PdfPCell(texto);
        celdaTexto.setBorder(Rectangle.NO_BORDER);
        celdaTexto.setVerticalAlignment(0);
        celdaTexto.setHorizontalAlignment(20);
        tablaEncabezado.addCell(celdaTexto);
        
        return tablaEncabezado;
    }
    
    public PdfPTable crearTablaVentas(ArrayList<Boleta> listaBoletas){
        // Creo la tablaVentas
        PdfPTable tablaVentas = new PdfPTable(6);
        
        // Agrego las celdas de la primera fila
        tablaVentas.addCell("PLAN");
        tablaVentas.addCell("VALOR");
        tablaVentas.addCell("CANTIDAD");
        tablaVentas.addCell("VALOR VENTA");
        tablaVentas.addCell("DESCUENTOS");
        tablaVentas.addCell("TOTAL");
        
        // Agrego los datos que me pide el reporte
        for(int i = 0; i < listaBoletas.size(); i++){
            tablaVentas.addCell(listaBoletas.get(i).getTipoPlan());
            tablaVentas.addCell(String.valueOf("$"+listaBoletas.get(i).getValorUnidad()));
            tablaVentas.addCell(String.valueOf(listaBoletas.get(i).getCantBoletas()));
            tablaVentas.addCell(String.valueOf("$"+listaBoletas.get(i).getValorVenta()));
            tablaVentas.addCell(String.valueOf(listaBoletas.get(i).getDescuento() + "%"));
            tablaVentas.addCell(String.valueOf("$"+listaBoletas.get(i).getCostoTotal()));
        }
        
        return tablaVentas;
        
    }   
    
}
