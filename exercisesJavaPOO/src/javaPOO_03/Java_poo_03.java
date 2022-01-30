//// CONSIGNA ////////////////////////////////////////////
/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.

*/
package javaPOO_03;

import java.util.Locale;
import java.util.Scanner;


public class Java_poo_03 {

  //main
    public static void main(String[] args) {
        Operacion oper = new Operacion();
        crearOperacion(oper);          
        System.out.println("La suma del primer número con el segundo es de: "+sumar(oper));
        System.out.println("La resta del primer número con el segundo es de: "+restar(oper));
        System.out.println("La multiplicación del primer número con el segundo es de: "+multiplicar(oper));
        System.out.println("La división del primer número por el segundo es de: "+dividir(oper));
    }
    
    //tools
    private static Scanner entrada  = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    //methods
    public static void crearOperacion(Operacion oper){
        System.out.println("Ingrese el primer número: ");
        oper.setNum1(entrada.nextDouble());
        System.out.println("Ingrese el segundo número: ");
        oper.setNum2(entrada.nextDouble());
    }
    public static double sumar(Operacion oper){
        double vSuma = (oper.getNum1()+oper.getNum2());
        return vSuma;
    }
    public static double restar(Operacion oper){
        double vResta = (oper.getNum1()-oper.getNum2());
        return vResta;
    }
    public static double multiplicar(Operacion oper){
        
        if(oper.getNum1()!= 0 || oper.getNum2()!= 0) {
          double vMultiplicacion = (oper.getNum1()*oper.getNum2());
          return vMultiplicacion;
        }else{
            System.out.println("Usted realizó una multiplicación por 0.");
          return 0;      
        }        
    }
    public static double dividir(Operacion oper){
        
        if(oper.getNum1()!=0 || oper.getNum2()!=0){
            double vDivision = (oper.getNum1()/oper.getNum2());
            return vDivision;
        }else{
            System.out.println("Usted realizó una división por 0.");
            return 0;
        }
    }
    
}
