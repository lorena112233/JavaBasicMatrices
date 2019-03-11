package matrices;

import java.util.Scanner;

public class Matriz4Excel {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida 20 números enteros. Estos números se deben
		 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
		 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
		 * tratara. Obtener además la suma global.
		 */
		final int FILAS = 4, COLUMNAS = 5;

		Scanner entrada = new Scanner(System.in);

		int i, j, mayor, menor;
		int sumaTotal = 0;
		int sumaFila = 0;
		int sumaColumn = 0;
		int sumacolumna2 = 0;
		int filaMayor, filaMenor, colMayor, colMenor;

		int[][] A = new int[FILAS][COLUMNAS];

		System.out.println("Lectura de elementos de la matriz: ");

		// bucle para introducir los valores por consola
		for (i = 0; i < FILAS; i++) {
			for (j = 0; j < COLUMNAS; j++) {
				System.out.print("\nA[" + i + "][" + j + "]= ");
				A[i][j] = entrada.nextInt();
				sumaTotal += A[i][j];
				sumaFila += A[i][j];
				//System.out.print("--suma: " + sumaTotal);
			}

		}
		// --------------------------------------------

		System.out.println("valores introducidos:");

		// bucle para recorrer la matriz creada y mostrar los valores introducidos
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

		// *****************
		// Suma filas
		for (i = 0; i < A.length; i++) {
			sumaFila = 0;
			for (j = 0; j < A[i].length; j++) {
				sumaFila = sumaFila + A[i][j];
			}
			System.out.println("La suma de los valores de la fila " + (i + 1) + " es:      " + sumaFila);
		}
		System.out.println("");
		// *******************

		// +++++++++++++++++++
		// Suma columnas
		for (i = 0; i < A[0].length; i++) {
			sumaColumn = 0;
			for (j = 0; j < A.length; j++) {
				sumaColumn = sumaColumn + A[j][i];
			}
			System.out.println("La suma de los valores de la columna " + (i + 1) + " es: " + sumaColumn);
		}
		System.out.println("");
		//++++++++++++++++++
		
		//otra forma de sumar columnas
		for(j=0;j<5;j++) {
			sumacolumna2=0;
			for(i=0;i<4;i++) {
				sumacolumna2=sumacolumna2+A[i][j];
				
			}
			System.out.println("La suma de la columna ^^" + j + " = " + sumacolumna2);
		}

		mayor = menor = A[0][0];// se toma el primero como mayor y menor
		filaMayor = filaMenor = colMayor = colMenor = 0;

		for (i = 0; i < A.length; i++) { //
			for (j = 0; j < A[i].length; j++) {
				if (A[i][j] > mayor) {
					mayor = A[i][j];
					filaMayor = i;
					colMayor = j;
				} else if (A[i][j] < menor) {
					menor = A[i][j];
					filaMenor = i;
					colMenor = j;
				}
			}
		}
		entrada.close();
		System.out.print("Elemento mayor: " + mayor + "; ");
		System.out.println(" Fila: " + filaMayor + " Columna: " + colMayor);
		System.out.print("Elemento menor: " + menor);
		System.out.println(" Fila: " + filaMenor + " Columna: " + colMenor);
		System.out.println("Suma Total de los elementos de la matriz = " + sumaTotal);


		entrada.close();

	}

}
