
package prueba;

import java.util.Locale;
import java.util.Scanner;


public class Pruebas {

   
    public static void main(String[] args) {
        frase();
                
    }
    
    public static void frase(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        
        System.out.println("Ingrese una frase");
        String vFrase = leer.next();
        
        respuesta(vFrase);
    }
    
    public static void respuesta(String vFrase){
       if(vFrase.length() == 4){
            System.out.println("La frase "+vFrase+" tiene 4 letras");
            recorrido(vFrase);
        }
        
    }
    
    public static void recorrido(String vFrase){
        
        for (int i=0;i<vFrase.length();i++){
            System.out.println("La letra en la posición "+(i+1)+" es: "+ vFrase.substring(i,(i+1)));
            
            
            
        }
    }
    
}
