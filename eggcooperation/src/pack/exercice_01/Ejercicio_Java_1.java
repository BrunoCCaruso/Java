/////////////////////// CONSIGNA //////////////////////////////////////////////////

/* Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma */

package pack.exercice_01;
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio_Java_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un número");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = entrada.nextInt();
        System.out.println("La suma de los números ingresados es de: " + (num1+num2));    
                
    }
      
}
