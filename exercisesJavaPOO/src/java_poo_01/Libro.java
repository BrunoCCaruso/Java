
package java_poo_01;

public class Libro {
    
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Numero_de_paginas;
    
    public Libro(){
    }
    
    public Libro(int ISBN,String Titulo,String Autor,int Numero_de_paginas){
       this.ISBN = ISBN;
       this.Titulo = Titulo;
       this.Autor = Autor;
       this.Numero_de_paginas = Numero_de_paginas; 
    }
    
    public void establecerISBN(int ISBN){
        this.ISBN = ISBN;
    }
     
    public int obtenerISBN(){
        return ISBN;
    } 
    
    public void establecerTitulo(String Titulo){
        this.Titulo = Titulo;
    }
    
    public String obtenerTitulo(){
        return Titulo;
    }
    
    public void establecerAutor(String Autor){
        this.Autor = Autor;
    }
    
    public String obtenerAutor(){
        return Autor;
    }
    
    public void establecerNumeroDePaginas(int Numero_de_paginas){
        this.Numero_de_paginas = Numero_de_paginas;
    }
    
    public int obtenerNumeroDePaginas(){
        return Numero_de_paginas;
    }
    
}
