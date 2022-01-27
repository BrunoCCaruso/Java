///////////////////// CONSIGNA ///////////////////////////

/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/

package pack.exercice_04;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_4 {

  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
       
       System.out.println("Ingrese la temperatura en grados centígrados: ");
       double vCent = entrada.nextDouble();
       
       System.out.println("La temperatura ingresada convertida a grados Fahrenheit es de: "+(32+(9*vCent/5)));
                
    }
    
}
