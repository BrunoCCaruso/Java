////////////////////// CONSIGNA //////////////////////////////

/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java. */

package pack.exercice_10;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_Java_10 {

   
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        String vFrase = entrada.next();
        String vVALOR = vFrase.substring(0,1);
        
        
        if("A".equals(vVALOR)){
             
         System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");       
        }            
               
        
    }

   
    
}
