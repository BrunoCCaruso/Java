//////// CONSIGNA //////////////////////////
/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package exercisesjavapoo_11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExercisesJavaPOO_11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Date fechaActual = new Date();
        System.out.println("Ingrese año: ");
        int anio = entrada.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese dia: ");
        int dia = entrada.nextInt();
        Date fecha = new Date(anio, mes, dia);

        System.out.printf("La fecha ingresada es: %d/%d/%d \n", fecha.getYear(), fecha.getMonth(), fecha.getDate());
        System.out.printf("La fecha actual es: %d/%d/%d \n", fechaActual.getYear()+1900, fechaActual.getMonth()+1, fechaActual.getDate());

        int difAnio = Math.abs(fecha.getYear() - (fechaActual.getYear()+1900));
        int difMes = Math.abs(fecha.getMonth() - (fechaActual.getMonth()+1));
        int difDia = Math.abs(fecha.getDate() - fechaActual.getDate());
                        
        if (difDia > 365) {
            difAnio++;
            if (difMes > 12) {
                difAnio++;
            }
        }
        
        System.out.printf("Existen %d años de diferencia entre la fecha ingresada y la actual \n",difAnio);  
        
    
    }
}
