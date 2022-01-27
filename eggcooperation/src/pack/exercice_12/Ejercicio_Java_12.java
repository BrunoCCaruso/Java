
package pack.exercice_12;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_12 {

    
    private static Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public static void main(String[] args) {       
       
        validar();
    }
    
    
    public static void validar(){
        
        System.out.println("Ingrese un número entre 0 y 10");
        int num;       
        do{ 
            num = leer.nextInt();
            
        }while(num<0||num>10);
        
        System.out.println("El valor "+num+"Es correcto");
        
        
    }
    
    
    
    
}
