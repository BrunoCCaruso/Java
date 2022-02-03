
package exercisesjavapoo_09;


public class Matematica {
    
    private double num1; 
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor(){
        System.out.printf("el valor de num1: %.1f y El valor de num2: %.1f \n",num1, num2);
        System.out.printf("El valor más grande es: %.1f \n", Math.max(num1, num2));
                
    }
    
    public void calcularPotencia(){
        
        
        System.out.println("El mayor número elevado al menor número es: "+Math.pow(Math.max(Math.round(num1), Math.round(num2)),Math.min(Math.round(num1), Math.round(num2))));
       
    }
    
    public void calculaRaiz(){
        
        System.out.println("La raíz cuadrada del menor número ingresado es: "+Math.sqrt(Math.min(Math.abs(num1),Math.abs(num2))));
                
    }
    
    
    
    
    
}
