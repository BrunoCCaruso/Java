///////////////////////// CONSIGNA //////////////////////////////

/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java. */

package pack.exercice_08;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_Java_8 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        String vFrase = entrada.next();
        
        if(vFrase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");        
        }  
    }    
}
