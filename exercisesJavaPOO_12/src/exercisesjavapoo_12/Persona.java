package exercisesjavapoo_12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void crearPersona() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Dia: ");
        int dia = entrada.nextInt();

        nacimiento = new Date(anio, mes, dia);
        Date fechaActual = new Date();

        int difAnio = (fechaActual.getYear() + 1900) - nacimiento.getYear();
        int difMes = (fechaActual.getMonth() + 1) - nacimiento.getMonth();
        int difDia = fechaActual.getDate() - nacimiento.getDate();

        if (difDia > 365) {
            difAnio++;
            if (difMes > 12) {
                difAnio++;
            }
        }
        if (difDia < 0 || difMes < 0) {
            difAnio--;
        }

        System.out.printf("\n Su edad es de: %d años", difAnio);
        System.out.println("");
        System.out.print("Ingrese otra edad: ");
        int otraEdad = entrada.nextInt();
        menorQue(otraEdad, difAnio);
    }

    public boolean menorQue(int edad, int difAnio) {
        boolean esMenor = false;
        if (edad > difAnio) {
            esMenor = true;
            System.out.println("Usted tiene menos edad que la segunda edad ingresada");
        } else {
            System.out.println("Usted tiene más edad que la segunda edad ingresada");
        }
        return esMenor;
    }

    public void mostrarPersona() {
        System.out.println("La persona ingresada es: ");
        System.out.printf("nombre: %S \n", nombre);
        System.out.printf("fecha de nacimiento: %d/%d/%d \n", nacimiento.getDate(), nacimiento.getMonth(), nacimiento.getYear());
    }

}
