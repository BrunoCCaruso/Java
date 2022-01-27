//////////////////////// CONSIGNA ///////////////////////////

/* Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(). */

package pack.exercice_05;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_5 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un número entero: ");
        int vNum = entrada.nextInt();
        
        System.out.println("El doble del número ingresado es: " + vNum*2);
        System.out.println("El triple del número ingresado es: "+ vNum*3);
        System.out.println("La raíz cuadrada del número ingresado es: "+ Math.sqrt(vNum));
        
    }
    
}
