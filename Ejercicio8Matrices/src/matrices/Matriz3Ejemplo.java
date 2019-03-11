package matrices;

public class Matriz3Ejemplo {

	public static void main(String[] args) {
		// generar una matriz de 3 filas x 6 columnas, con valores entre 10 y 100
		int[][] matriz = new int[3][6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				// si el 100 esta incluido es 91, y si el 100 no lo incluyo, seria 90
				matriz[i][j] = (int) (Math.random() * 91 + 10);
			}
		}

		//creo otro bucle FOR para recorrer la info generada arriba en el random, y mostrarla
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			//para separar las filas, metro un cambio de linea ocn el println vacio, en el bucle de la "i"
			System.out.println();
		}

	}

}
