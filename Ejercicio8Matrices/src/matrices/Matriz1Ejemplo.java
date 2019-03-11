package matrices;

import javax.swing.JOptionPane;

public class Matriz1Ejemplo {

	public static void main(String[] args) {
		
		//definimos el array de 5 enteros
		int [ ] Mi_Matriz=new int[5];
		
		//introducimos los valores correspondientes en el array
		for (int i=0; i<5; i++){
		String texto=JOptionPane.showInputDialog(" Introduce un nº entero");
		Mi_Matriz[i]=Integer.parseInt( texto);
		}
		for (int i=0;i<5;i++){
		System.out .println("El valor almacenado en la posición"+ i +" es = " +
		Mi_Matriz[i]);
		}
		
		

	}

}
