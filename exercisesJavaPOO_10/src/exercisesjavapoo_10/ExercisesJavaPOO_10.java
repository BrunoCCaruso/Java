///////////// CONSIGNA //////////////////////

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
*/

package exercisesjavapoo_10;

import java.util.Arrays;


public class ExercisesJavaPOO_10 {

   
    public static void main(String[] args) {
        
        double[] A = new double[50];
        double[] B = new double[20];
         
        for (int i = 0; i < A.length-1; i++) {
            A[i]= Math.round(Math.random()*10);
            System.out.print("["+A[i]+"]");
        }
        
        Arrays.sort(A); /// Ordenado de menor a mayor
        
        System.out.println("");
        
        for (int i = 0; i < A.length-1; i++) {
            System.out.print("["+A[i]+"]");
        }
        
        for (int i = 0; i < B.length-1; i++) {
            
            if (i<10) {
                B[i]=A[i];
            }else{
                B[i]=0.5;
            }
                        
        }
        
        
        ///////////// MOSTRAR ARREGLOS
        System.out.println("");
        System.out.println("VECTOR A\n");
        
        for (int i = 0; i < A.length-1; i++) {
            System.out.print("["+A[i]+"]");
        }
        System.out.println("");
        System.out.println("VECTOR B \n");
        
        for (int i = 0; i < B.length-1; i++) {
            System.out.print("["+B[i]+"]");
        }
        
        
        
        
    }
    
}
