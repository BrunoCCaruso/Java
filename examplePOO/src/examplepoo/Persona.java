package examplepoo;

// Clase Persona
public class Persona {
    
    private String nombre;
    private int edad;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerEdad(int edad){
        this.edad = edad;
    }
    
    public int obtenerEdad(){
        return edad;
    }
}



