package java_poo_08;

public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void mostrarVocales() {

        int vContVocales = 0;

        for (int i = 0; i < longitud; i++) {
            if (this.frase.toLowerCase().charAt(i) == 'a' || this.frase.toLowerCase().charAt(i) == 'e' || this.frase.toLowerCase().charAt(i) == 'i' || this.frase.toLowerCase().charAt(i) == 'o' || this.frase.toLowerCase().charAt(i) == 'u') {
                vContVocales++;

            }

        }
        System.out.printf("Se encontraron %d \n", vContVocales);
    }

    public void invertirFrase() {

        String vNuevaFrase = "";

        for (int i = longitud - 1; i >= 0; i--) {

            vNuevaFrase = vNuevaFrase + frase.charAt(i);
        }
        System.out.printf("La frase ingresada, de forma invertida es: %S \n", vNuevaFrase);
    }

    public void vecesRepetido(String letra) {

        int vContLetra = 0;

        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
                vContLetra++;
            }

        }
        System.out.printf("La letra ingresada se repitió %d veces.\n", vContLetra);

    }

    public void compararLongitud(String frase2) {

        if (frase2.length() == longitud) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no poseen la misma longitud.");

        }

    }

    public void unirFrases(String frase3) {

        System.out.printf("La frase nueva es: %S \n", frase + " " + frase3);

    }

    public void reemplazar(String letra2) {

        String reemplazar = this.frase.replace("a", letra2.toLowerCase());
        System.out.printf("La frase con el caracter reemplazado es: %s \n", reemplazar);

    }

    public boolean contiene(String letra3) {
        if (frase.contains(letra3)) {
            System.out.println("Se encontró la letra");
        } else {
            System.out.println("No se encontró la letra");
        }
        return frase.contains(letra3);
    }
    
    
    
    
}
