////////////////////// CONSIGNA ///////////////////////

/*Crear un programa que dado un numero determine si es par o impar*/

package pack.exercice_07;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_Java_7 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un número entero");
        int vNum1 = entrada.nextInt();
        
        if(vNum1 % 2 == 0){
            System.out.println("El número ingresado es par");
        }else if (vNum1 % 2 != 0){
            System.out.println("El número ingresado es impar");
        }else{
            System.out.println("El número ingresado no es par ni impar");
        }        
    }        
}    

