////////// CONSIGNA //////////////////////////////////////////////////
/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
*/

package javaPOO_01;

import java.util.Locale;
import java.util.Scanner;


public class Java_Poo_01 {

    
    public static void main(String[] args) {
                                     
        cargarLibro();               
        
    }
    
    public static void cargarLibro(){
        Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Libro primerLibro = new Libro();
        System.out.println("Ingrese el ISBN del libro: ");
        primerLibro.establecerISBN(entrada.nextInt());
        System.out.println("Ingrese el Título del libro: ");
        primerLibro.establecerTitulo(entrada.next());
        System.out.println("Ingrese el Autor del libro: ");
        primerLibro.establecerAutor(entrada.next());
        System.out.println("Ingrese la cantidad de páginas que tiene: ");
        primerLibro.establecerNumeroDePaginas(entrada.nextInt());
               
                
        
        System.out.println("El número de ISBN es: " + primerLibro.obtenerISBN());
        System.out.println("El Título del libro es: " + primerLibro.obtenerTitulo());
        System.out.println("El Autor del libro es: " + primerLibro.obtenerAutor());
        System.out.println("La cantidad de páginas que tiene el libro es de: " + primerLibro.obtenerNumeroDePaginas() );
        
        
       
    }
    
    
}
  