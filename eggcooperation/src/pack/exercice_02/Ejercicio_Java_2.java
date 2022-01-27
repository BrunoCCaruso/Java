/////////////////////// CONSIGNA //////////////////////

/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla */ 

package pack.exercice_02;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_2 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre: ");
        String vNombre = entrada.next();  
        System.out.println("Su nombre es: "+vNombre);
        
    }
    
}
