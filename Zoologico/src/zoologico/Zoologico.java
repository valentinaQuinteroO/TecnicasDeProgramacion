package zoologico;

import java.io.IOException;

/**
 * Este programa cumple con 3 funciones:
 * - Proporciona al vendedor una GUI para manejar mejor los asuntos
 * administrativos del zoológico.
 * - Permite al encargado de los animales agregar animales al zoo.
 * - Permite al encargado de ventas vender boletas y hacer un reporte
 * de ventas.
 * Recuerde que la clave para ingresar al GUI es 1111
 * 
 * @author Valentina
 */
public class Zoologico {

    public static void main(String[] args) throws IOException {
        System.out.println("*** Zoologico Ilogico ***");
        DepartamentoLogistica.administracionZoo();
        
    }
    
}
