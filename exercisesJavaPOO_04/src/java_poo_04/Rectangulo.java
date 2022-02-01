package java_poo_04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void creacionRectangulo() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el valor de la altura del rectángulo: ");
        setAltura(entrada.nextDouble());
        System.out.println("Ingrese el valor de la base del rectángulo: ");
        setBase(entrada.nextDouble());

    }

    public void calcularSuperficie() {
        double sup = base + altura;
        System.out.printf("La superficie del rectángulo es de: %.1f \n", sup);
    }

    public void calcularPerimetro() {
        double per = (base + altura) * 2;
        System.out.printf("El perímetro del rectángulo es de: %.1f \n", per);
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();

        }

    }

}
