package pack.exercice_01;

import java.util.Locale;
import java.util.Scanner;

/*
comentario multilinea
*/

public class ExampleEgg {

    public static void main(String[] args) {
        
        System.out.println("Ingrese su nombre");
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String nombre = entrada.next();
        System.out.println("Su nombre es " + nombre);
    
    /*    
    String cadena  = "Esto es una cadena";
    char letra = 'c';
    int entero = 25;
    double decimal = 3.14;
    boolean logico = false;
    
    System.out.println("Letra :" + letra);
    System.out.println("cadena :" + cadena);
    System.out.println("entero :" + entero);
    System.out.println("decimal:" + decimal);
    System.out.println("logico:" + logico);
    */

    System.out.println("Ingrese una letra");
    char letra = entrada.next().charAt(0);
    System.out.println("Ingrese un entero");
    int entero = entrada.nextInt();
    System.out.println("Ingrese un decimal");
    double decimal =  entrada.nextDouble();
    System.out.println("Ingrese un valor lógico");
    boolean logico =  entrada.nextBoolean();
    
    
    
    }  
}
