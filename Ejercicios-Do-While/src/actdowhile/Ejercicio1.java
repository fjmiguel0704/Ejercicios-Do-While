package actdowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Creo la variable incremento y la inicializo a 0
		int incremento=0;
		
		//Hacemos que se incremente incremento en 1 y lo muestre*
		do {
			incremento++;
			System.out.println(incremento);
		}
		
		//*Mientras que el incremento sea menor a 20
		while(incremento<20); 
	}

}
