
package examplepoo;

public class Principal {

    
    public static void main(String[] args) {
     //Declarando una variable de tipo persona; 
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
      
        persona1.nombre = "Lorena";
        persona1.edad = 25;
        
        persona2.nombre = "Cristian";
        persona2.edad = 20;
        
        System.out.println("PERSONA 1");
        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);
        
        System.out.println("PERSONA 2");
        System.out.println(persona2.nombre);
        System.out.println(persona2.edad);
        
    }
    
}

