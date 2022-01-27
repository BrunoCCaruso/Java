package pack.exercice_16;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_Java_16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un número entero");
        int vNum = entrada.nextInt();

        for (int i = 0; i < vNum; i++) {
            for (int j = 0; j < vNum; j++) {

                if (i == 0 || i == vNum - 1 || j == 0 || j == vNum - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();

        }

    }
}
