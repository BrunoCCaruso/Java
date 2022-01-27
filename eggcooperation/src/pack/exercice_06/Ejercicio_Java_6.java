////////////////// CONSIGNA ////////////////////////////////////

/*Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla */


package pack.exercice_06;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese un número entero");
        int vNum1 = entrada.nextInt();
        System.out.println("Ingrese otro número entero");
        int vNum2 = entrada.nextInt();
        
        if(vNum1>vNum2){
            System.out.println("El primer número ingresado es mayor");
        }else if (vNum1<vNum2){
            System.out.println("El segundo número ingresado es mayor");
        }else{
            System.out.println("Ambos números son iguales");
        }        
    }   
}
