
package examplepoo;

public class Principal {

    
    public static void main(String[] args) {
     //Declarando una variable de tipo persona; 
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Cristian", 20);
      
        persona1.establecerNombre("Lorena");
        persona1.establecerEdad(25);
          
        
        System.out.println("PERSONA 1");
        System.out.println(persona1.obtenerNombre());
        System.out.println(persona1.obtenerEdad());
        
        System.out.println("PERSONA 2");
        System.out.println(persona2.obtenerNombre());
        System.out.println(persona2.obtenerEdad());
        
    }
    
}

