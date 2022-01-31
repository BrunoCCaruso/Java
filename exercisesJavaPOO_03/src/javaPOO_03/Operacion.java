
package javaPOO_03;


public class Operacion {
    
    private double numero1;
    private double numero2;
   
    public Operacion(){
    }
    
    public Operacion(double numero1,double numero2){
    this.numero1=numero1;
    this.numero2=numero2;
    }
    
    public void setNum1(double numero1){
        this.numero1 = numero1;
    }
    
    public double getNum1(){
        return numero1;
    }
    
    public void setNum2(double numero2){
        this.numero2 = numero2;
    }
    
    public double getNum2(){
        return numero2;
    }
    
    
}
