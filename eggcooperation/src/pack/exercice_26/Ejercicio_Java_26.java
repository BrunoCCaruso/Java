///////////////////////////////// CONSIGNA //////////////////////////////////

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz 
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está 
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las 
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o 
columnas, existe al menos una que coincida con la matriz P. En ese caso, el 
programa debe indicar la fila y la columna de la matriz M en la cual empieza el 
primer elemento de la submatriz P. 

Como podemos observar nuestra submatriz P se encuentra en la matriz M en los 
índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */


package pack.exercice_26;



public class Ejercicio_Java_26 {

    public static void main(String[] args) {
///////////////////////// RELLENADO MATRIZ 10X10 ////////////////////////////////////////////////////////////////////////////
        int[][] Matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 1 + (int) (Math.random()*6) ----- Esto es para hacer random de 1 hasta 6 
                Matriz[i][j] = j;
                System.out.print("[" + Matriz[i][j] + "]");

            }
            System.out.println(" ");
        }
/////////////////////////RELLENADO MATRIZ DE 3X3 /////////////////////////////////////////////////////////////////////////////////
        int[][] Matriz2 = new int[3][3];

        System.out.println(""); /////////////////// Salto de linea para separar matrices 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // 1 + (int) (Math.random()*6) ----- Esto es para hacer random de 1 hasta 6 
                Matriz2[i][j] = j;
                System.out.print("[" + Matriz2[i][j] + "]");

            }
            System.out.println(" ");
        }
///////////////////////////// COMPARACIONES ENTRE MATRICES /////////////////////////////////////////////////////////////////////////////////////////////
      
        System.out.println(""); /////////////////// Salto de linea para separar matriz del resultado      

      String Array;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // 1 + (int) (Math.random()*6) ----- Esto es para hacer random de 1 hasta 6 
                if (Matriz2[0][0] == Matriz[i][j]) {
                    int auxi = i;
                    int auxj = j;
                    
                    Array = "";
                    
                    int cont = 0; ///////////// definimos contador

                    for (int k = 0; k < 3; k++) {
                        for (int q = 0; q < 3; q++) {
                            if (auxi < 10 && auxj < 10) {

                                if (Matriz2[k][q] == Matriz[auxi][auxj]) {
                                                   
                                    cont++;                                    
                                    Array = Array + "["+ auxi + "," + auxj +"]"+ " - ";
                                    //System.out.print(auxi+","+auxj+" - ");
                                                                       
                                }
                            }
                            auxj++;
                        }
                        auxj = j;
                        auxi++;
                    }

                    if (cont == 9) {
                        System.out.println("Correcto porque coinciden "+cont+" elementos");
                        System.out.println(Array);
                        
                    } else {
                        System.out.println("Incorrecto porque solo coinciden "+cont+" elementos");

                    }

                }

            }

        }

    }

}
