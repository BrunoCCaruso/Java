
package exercisesjavapoo_05;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public void crearCuenta(){
        
        System.out.print("Ingrese su número de cuenta: ");
        this.setNumeroCuenta(entrada.nextInt());
        System.out.print("\nIngrese su número de DNI: ");
        this.setDni(entrada.nextLong());
        System.out.print("\nIngrese su saldo actual: ");
        this.setSaldoActual(entrada.nextDouble());
        
    }
    
    public void nuevoIngreso(){
        System.out.print("\nCantidad de dinero a ingresar:  ");
        this.setSaldoActual(this.getSaldoActual()+entrada.nextDouble());        
    }
    
    public void retirar(){
        System.out.print("\nCantidad de dinero a retirar:  ");
        double nuevoMonto;
        
        //optimicé un poco respecto la consigna 
        nuevoMonto = entrada.nextDouble();
        while (nuevoMonto > this.getSaldoActual()){            
            System.out.print("\nNo existen fondos suficientes, ingrese otro monto: "); 
            nuevoMonto = entrada.nextDouble();
        } 
        
        this.setSaldoActual(this.getSaldoActual()-nuevoMonto);
                               
    }
    
    public void extraccionRapida(){
        System.out.print("\nIngrese el mónto que desea extraer:  ");
        double nuevaExtraccion;
        
        //optimicé un poco respecto la consigna 
        
        do {
            nuevaExtraccion = entrada.nextDouble();
            System.out.printf("\nSolo puede extraer hasta $%.2f, ingrese otro monto: ",this.getSaldoActual()*0.20 );            
        } while (nuevaExtraccion > this.getSaldoActual());
        
        this.setSaldoActual(this.getSaldoActual()-entrada.nextDouble());
    }
   
    public void consultarSaldo(){
        System.out.printf("\nSu saldo disponible es de: $%.2f",this.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.printf("\nN° de cuenta: %d\nD.N.I.: %d\n",this.getNumeroCuenta(),this.getDni());
    }
    
}
