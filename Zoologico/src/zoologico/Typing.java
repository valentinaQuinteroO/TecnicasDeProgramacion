package zoologico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
// import java.io.*;

public class Typing {
    
    /*
     * método  que  lee  datos desde  el teclado,  y devuelve  solo Strings. 
     */
    public String readString(String mensaje)throws IOException{
        String sdato = "";
        System.out.println(mensaje);
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            // Leer la entrada finaliza al pulsar la tecla Entrar
            sdato = flujoE.readLine();
        }
        catch(IOException e) // Si en en try falla algo se imprime el mensaje 
        {
            System.err.println("Error al ingresar el dato " + e.getMessage()); // System error 
        }
        return sdato;
    }
    
    /*
     * método  que  lee  datos desde  el teclado,  y devuelve  solo enteros. 
     */
    public int  readInt(String mensaje) throws IOException{
        String ingreso;
        int numero;
        System.out.println(mensaje);
        //capturar errores  falta
        BufferedReader stdin = new BufferedReader(
        new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Integer.parseInt(ingreso);
        return numero;
    }
    
     /*
     * método  que  lee  datos desde  el teclado,  y devuelve  solo reales. 
     */
    public float  readFloat(String mensaje) throws IOException{
        String ingreso;
        float numero;
        System.out.println(mensaje);
        //capturar errores  falta
        BufferedReader stdin = new BufferedReader(
        new InputStreamReader(System.in));
        ingreso = stdin.readLine();
        numero = Float.parseFloat(ingreso);
        return numero;
    }
    
}
