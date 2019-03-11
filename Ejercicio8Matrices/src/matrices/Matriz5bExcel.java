package matrices;

import java.util.Scanner;

public class Matriz5bExcel {

	public static void main(String[] args) {
		// crear matriz con dimensiones establecidas por consola, con valores random
		//sumar sus elementos

		// Incicialización del Random, matriz y demás variables
		Scanner entrada = new Scanner(System.in);

		System.out.print("Alto de la matriz: ");
		int f = entrada.nextInt();
		System.out.print("Ancho de la matriz: ");
		
		
		int c = entrada.nextInt();
		int mat[][] = new int[f][c];
		int sumf;
		int sumc;
		int sumd = 0;
		int sumdi = 0;

		// Rellenar Matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = (int) (Math.random() * 91 + 10);
			}
		}

		// Mostrar Matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println("");
		}

		// Suma filas
		for (int i = 0; i < mat.length; i++) {
			sumf = 0;
			for (int j = 0; j < mat[i].length; j++) {
				sumf = sumf + mat[i][j];
			}
			System.out.println("La suma de los valores de la fila " + (i + 1) + " es:      " + sumf);
		}
		System.out.println("");

		// Suma columnas
		for (int i = 0; i < mat[0].length; i++) {
			sumc = 0;
			for (int j = 0; j < mat.length; j++) {
				sumc = sumc + mat[j][i];
			}
			System.out.println("La suma de los valores de la columna " + (i + 1) + " es: " + sumc);
		}
		System.out.println("");

		// Suma diagonal
		if (f - c == 0) {
			for (int i = 0; i < mat.length; i++) {
				sumd = sumd + mat[i][i];
			}
			System.out.println("La suma de la diagonal principal es: " + sumd);
		}
		System.out.println("");

		// Suma diagonal inversa
		if (f - c == 0) {
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (i + j == mat.length - 1) {
						sumdi = sumdi + mat[i][j];
					}
				}
			}
			System.out.println("La suma de la diagonal secundaria es: " + sumdi);
			entrada.close();

		}
	}
}
