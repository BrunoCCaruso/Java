/////////////////////// CONSIGNA ///////////////////

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java*/

package pack.exercice_03;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_Java_3 {

   
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase");
        String vFrase = entrada.next();
        System.out.println("La frase en Mayúsculas es: " + vFrase.toUpperCase());
        System.out.println("La frase en Minpusculas es: " + vFrase.toLowerCase());    
                           
    }
    
}
