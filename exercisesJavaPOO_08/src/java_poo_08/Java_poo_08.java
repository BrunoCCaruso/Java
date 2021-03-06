//////////// CONSIGNA ///////////////////////////////////
/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package java_poo_08;

import java.util.Locale;
import java.util.Scanner;

public class Java_poo_08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cadena frase = new Cadena();

        System.out.println("Ingrese una frase");
        frase.setFrase(entrada.next());
        frase.setLongitud(frase.getFrase().length());

        frase.mostrarVocales();
        frase.invertirFrase();
        System.out.println("Ingrese una letra a buscar en la frase ingresada: ");
        String letra = entrada.next();
        frase.vecesRepetido(letra);
        System.out.println("Ingrese una frase nuevamente: ");
        String frase2 = entrada.next();
        frase.compararLongitud(frase2);
        System.out.println("Ingrese otra frase: ");
        String frase3 = entrada.next();
        frase.unirFrases(frase3);
        System.out.println("Ingrese una letra para reemplazar por las `a` de la frase ingresada: ");
        String letra2 = entrada.next();
        frase.reemplazar(letra2);
        System.out.println("Ingrese una letra que quiera buscar dentro de la frase: ");
        String letra3 = entrada.next();
        frase.contiene(letra3);
    }

}
