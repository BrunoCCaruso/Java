/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJERCICIO_13.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. T�cnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos act�a como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) act�a como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deber�n modificarse algunos m�todos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepci�n. Si una funci�n A es
// invocada por otra B, B tambi�n debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el c�digo generado autom�ticamante: las funciones que realizan lecturas
// directamente incluyen el c�digo que indica que pueden generar dicha excepci�n, pero las que
// lo hacen indirectamente (invocando a otras que s� lo hacen), puede que no, y deber�n ser
// corregidas manualmente.

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_13 {
	//BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	// ////////////// CONSIGNA ///////////////////////////////////////////////////////////////////////////////////////////////
	// Una matriz m�gica es una matriz cuadrada (tiene igual n�mero de filas que de columnas) 
	// que tiene como propiedad especial que la suma de las filas, las columnas y las 
	// diagonales es igual.
	// En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir 
	// un algoritmo que compruebe si una matriz de datos enteros es m�gica o no, y en caso 
	// de que sea m�gica escribir la suma. Adem�s, el programa deber� comprobar que los 
	// n�meros introducidos son correctos, es decir, est�n entre el 1 y el 9. El usuario ingresa el 
	// tama�o de la matriz que no debe superar orden igual a 10. 
	// //////////// ALGORITMO PRINCIPAL ///////////////////////////////////////////////////////////////////////////////////////
	public static void main(String args[]) throws IOException {
		Scanner entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
            
                //int m;
		int matriz[][];
		//int n;
		System.out.println("Ingrese la cantidad de filas que desea, máximo 10");
		int n = entrada.nextInt();
		System.out.println("Ingrese la cantidad de columnas que desea, máximo 10");
		int m = entrada.nextInt();
		matriz = new int[n][m];
                
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////               
                if (n>10 || m>10) {
			if (n>10) {
				System.out.println("Ingresó más filas que las permitidas, vuelva a ingresar");
				 n = entrada.nextInt();
                                
			} else {
				System.out.println("Ingresó más columnas que las permitidas, vuelva a ingresar");
				m = entrada.nextInt();
			}
			             
                        
		} else {
			System.out.println("Carg� las filas y columnas exitosamente");
		}
                
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////               
                int i;
		int j;
		int num;
		for (i=0;i<=n-1;i++) {
			for (j=0;j<=m-1;j++) {
				System.out.println("Ingrese hasta "+n*m+" números enteros entre el 1 y 9");
				num = entrada.nextInt();
				if (num>=1 && num<=9) {
					matriz[i][j] = num;
				} else {
					System.out.println("El número ingresado no se encuentra entre el 1 y el 9, el valor no se guardará");
				}
			}
		}
                
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  int aux;
		int auxcolumn=0;
		int auxfila=0;
		i=0;
		j=0;
		int sumacolumn;
		int sumadiag;
		int sumadiaginv;
		int sumafila;
		int sumaref;
		sumaref = 0;
		sumafila = 0;
		sumacolumn = 0;
		sumadiag = 0;
		sumadiaginv = 0;
		aux = 0;
		for (i=0;i<=n-1;i++) {
			for (j=0;j<=m-1;j++) {
				if (i==0) {
					sumaref = sumaref+matriz[i][j];
				}
				sumafila = sumafila+matriz[i][j];
				auxfila = sumafila;
				sumacolumn = sumacolumn+matriz[j][i];
				auxcolumn = sumacolumn;
				if (i==j) {
					sumadiag = sumadiag+matriz[i][j];
				}
				if (j==(m-1)-aux) {
					sumadiaginv = sumadiaginv+matriz[i][j];
					aux = aux+1;
				}
			}
			if (sumaref!=sumafila || sumaref!=sumacolumn) {
				i = n;
				j = m;
			} else {
				sumafila = 0;
				sumacolumn = 0;
			}
		}
		if (sumaref!= auxfila || sumaref!= auxcolumn || sumaref!=sumadiag || sumaref!=sumadiaginv) {
			System.out.println("la matriz no es mágica");
		} else {
			System.out.println("La matriz es mágica!!");
			System.out.println("la suma de fila es de: "+auxfila);
			System.out.println("La suma de columna es de: "+auxcolumn);
			System.out.println("La suma de la diagonal principal es de: "+sumadiag);
			System.out.println("La suma de la diagonal inversa es de: "+sumadiaginv);
		}
	
                
                
		
                //validar(int matriz, double n, double m);
		//carga(matriz,n,m);
		//magica(int matriz, double n, double m);
	}


	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

}

