package matrices;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz7Menu {

	public static void main(String[] args) {
		/*
		 * crear un menu:
		 * 
		 * (para crear una matriz de dimensiones introducidas por el usuario) 1-
		 * introduccion de datos 2- visualizacion de la matriz 3- sumar los numeros
		 * pares de la matriz 4- contrar los numeros divisibles entre 5 5- visualizar lo
		 * numeros primos 6- suma diagonal principal
		 */

		// Incicialización del Random, matriz y demás variables
		Scanner entrada = new Scanner(System.in);

		int f = 0;
		int c = 0;
		int mat[][] = new int[4][5];
		int sumPares;
		int conta5;
		int sumd = 0;
		int optionMenu = 0;
		int i = 0;
		int j = 0;
		boolean control = false;

		
		do {
			// creo menu con opciones a mostrar
			System.out.println("Elige una opcion:");
			System.out.println("1: Introducir datos");
			System.out.println("2: Visualizar");
			System.out.println("3: Sumar Pares");
			System.out.println("4: Contar multiplos de 5");
			System.out.println("5: Visualizar primos");
			System.out.println("6: Suma diagonal principal ");
			System.out.println("7: exit ");

			optionMenu = entrada.nextInt();
			
			switch (optionMenu) {

			case 1:
				// introducir dimensiones de la matriz por el usuario
//				System.out.print("Alto de la matriz: ");
//				f = entrada.nextInt();
//				System.out.print("Ancho de la matriz: ");
//				c = entrada.nextInt();

				// Rellenar Matriz con RANDOM
				for (i = 0; i < mat.length; i++) {
					for (j = 0; j < mat[0].length; j++) {
						mat[i][j] = (int) (Math.random() * 41 + 10);
					}
				}
				// Mostrar Matriz
				for (i = 0; i < mat.length; i++) {
					for (j = 0; j < mat[0].length; j++) {
						System.out.println(mat[i][j] + "\t");
					}
					System.out.println();
				}
				break;

			case 2:
				// Mostrar Matriz
				for (i = 0; i < mat.length; i++) {
					for (j = 0; j < mat[0].length; j++) {
						System.out.print(mat[i][j] + "\t");
					}
					System.out.println("");
				}
				break;

			case 3:
				// Suma filas
				for (i = 0; i < mat.length; i++) {
					sumPares = 0;
					for (j = 0; j < mat[i].length; j++) {
						if (mat[i][j] % 2 == 0) {
							sumPares = sumPares + mat[i][j];
						}
					}
					System.out.println("La suma de los valores PARES de la fila " + (i + 1) + " es:      " + sumPares);
				}
				System.out.println("");
				sumPares=0;
				break;

			case 4:
				for (i = 0; i < mat.length; i++) {
					conta5 = 0;
					for (j = 0; j < mat[i].length; j++) {
						if (mat[i][j] % 5 == 0) {
							conta5 = conta5 + mat[i][j];
						}
					}
					System.out
							.println("En la fila " + (i + 1) + " hay:      " + conta5 + " numeros divisibles entre 5");
				}
				System.out.println("");
				conta5=0;
				break;

			case 5:
				for (i = 0; i < mat.length; i++) {

					for (j = 0; j < mat[i].length; j++) {
						for (int x = 2; x < mat[i][j]; x++) {
							if (mat[i][j] % x == 0) {
								control = true;
							}
						}
						if (control == false) {
							System.out.println("el numero primo es " + mat[i][j]);
						}
						control = false;
					}
					System.out.println("");
				}
				System.out.println("");
				break;

			case 6:
				for (i = 0; i < mat.length; i++) {
					for (j = 0; j < mat[i].length; j++) {
						if (i == j) {
							sumd = sumd + mat[i][j];
						}
					}
				}
				System.out.println("La suma de la diagonal es: " + sumd);
				break;

			case 7:
				// salimos y no hacemos nada
				System.out.println("Agur");
				break;

			}// fin del switch
				// **************************************************************

		} while (optionMenu != 7); // fin del DO/---WHILE
		entrada.close();
	}
}