//////////////////// CONSIGNA //////////////////////////
/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

package javaPOO_02;

import static java.lang.Math.PI;
import java.util.Locale;
import java.util.Scanner;


public class Java_Poo_02 {
  
    //main
    public static void main(String[] args) {    
        Circunferencia Radio = new Circunferencia(0);                
        crearCircunferencia(Radio);     
        area(Radio);
        perimetro(Radio);
    }
    
    //tools
    private static Scanner entrada  = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    
    //methods
    public static void crearCircunferencia(Circunferencia Radio){
        System.out.println("Ingrese el radio de su circunferencia: ");
        Radio.setRadio(entrada.nextDouble());        
    }
    
    public static void area(Circunferencia Radio){
        System.out.println("El área de la circunferencia es de: "+ (PI*(Radio.getRadio()*Radio.getRadio())));        
    }
    
    public static void perimetro(Circunferencia Radio){
        System.out.println("El perímetro de la circunferencia es de: "+ (2*PI*Radio.getRadio()));
    }
}
