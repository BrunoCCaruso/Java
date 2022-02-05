package exercisesjavapoo_06;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima = 300;
    private int cantidadActual = 0;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    private static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamaño) {

        if (cantidadActual == 0) {
            System.out.println("La cafetera se encuentra vacía");
            System.out.println("¿Desea cargar café?");
            String deseaCargar = entrada.next();
            if (deseaCargar.equalsIgnoreCase("Si")) {
                System.out.println("Elija la opción que desee realizar: ");
                System.out.println("a - Llenar cafetera.\nb - Cargar cantidad.");
                String deseaCargar2 = entrada.next();
                if (deseaCargar2.equalsIgnoreCase("a")) {
                    llenarCafetera();
                    System.out.printf("Cafetera llena. Ahora dispone de %dml de café para tomar.\n", cantidadActual);
                    System.out.println("Sirviendo café...");
                    if (tamaño > cantidadActual) {
                        System.out.printf("Se cargó el %d%% de la taza, ya que no hay café suficiente.\n", (cantidadActual * 100) / tamaño);
                        cantidadActual = cantidadActual - tamaño;
                    } else {
                        System.out.println("Se llenó sastisfactoriamente la taza.");
                        cantidadActual = cantidadActual - tamaño;
                        vaciarCafetera();
                    }
                } else if (deseaCargar2.equalsIgnoreCase("b")) {
                    System.out.print("Ingrese la cantidad de café a ingresar: ");
                    agregarCafe(entrada.nextInt());
                    System.out.println("Sirviendo café...");
                    if (tamaño > cantidadActual) {
                        System.out.printf("Se cargó el %d%% de la taza, ya que no hay café suficiente.\n", (cantidadActual * 100) / tamaño);
                        cantidadActual = cantidadActual - tamaño;
                    } else {
                        System.out.println("Se llenó sastisfactoriamente la taza.");
                        cantidadActual = cantidadActual - tamaño;
                        vaciarCafetera();
                    }
                } else {
                    System.out.println("No ingresó ninguna opción válida");

                }

            }
        } else {

            System.out.println("Sirviendo café...");
            if (tamaño > cantidadActual) {
                System.out.printf("Se cargó el %d%% de la taza, ya que no hay café suficiente.\n", (cantidadActual * 100) / tamaño);
                cantidadActual = cantidadActual - tamaño;

            } else {
                System.out.println("Se llenó sastisfactoriamente la taza.");
                cantidadActual = cantidadActual - tamaño;
                vaciarCafetera();
            }
        }
    }

    public void vaciarCafetera() {
        System.out.println("\n¿Desea vaciar la cafetera?");
        String respuesta3 = entrada.next();
        if (respuesta3.equalsIgnoreCase("Si")) {
            cantidadActual = 0;
            System.out.println("Se vació la cafetera satisfactoriamente.");
        } else {
            System.out.printf("La cafetera no se vaciará. Su contenido es de: %d ml\n", cantidadActual);
        }
    }

    public void agregarCafe(int cafe) {
        if(cafe<=(capacidadMaxima-cantidadActual)){
        cantidadActual = cantidadActual + cafe;
        }else{
            System.out.println("No hay tanto espacio en la cafetera para la cantidad ingresada.");
            System.out.printf("Puede cargar hasta %dml. Ingrese nuevamente la cantidad que desee cargar: ",capacidadMaxima-cantidadActual);
            agregarCafe(entrada.nextInt());
        }
    }

}
