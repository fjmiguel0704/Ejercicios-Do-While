package actdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Creo las variables
		int numero, incrementoTabla=0, tabla;
		
		//Creamos el Scanner para leer por teclado
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número y declaramos la variable numero
		System.out.println("Introduce el número del que quieras generar su respectiva tabla de multiplicar: ");
		numero=read.nextInt();
		
		/**Indicamos que haga lo siguiente:
		 * En primer lugar que incremente el incrementoTabla en 1, y posteriormente multiplique el número introducido por el usuario 
		 * por el incremento y muestre ese resultado.
		 */
		do {
			incrementoTabla++;
			tabla=numero*incrementoTabla;
			System.out.println(numero + " x " + incrementoTabla + " = " + tabla);
		}
		
		//Mientras el incrementoTabla sea distinto a 10
		while(incrementoTabla!=10);
		
		//Cerramos el Scanner
		read.close();

	}

}