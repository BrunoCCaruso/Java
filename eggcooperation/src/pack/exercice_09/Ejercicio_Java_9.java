////////////////// CONSIGNA ///////////////////////////

/* Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/


package pack.exercice_09;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio_Java_9 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese una frase de 8 caracteres");
        String vFrase = entrada.next();
        
        if(vFrase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");        
        }  
    }
    
}
