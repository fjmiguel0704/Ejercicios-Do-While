package actdowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Creo la variable pares y la inicializo en 0
		int pares=0;
		
		//Haz que la variable pares se incremente en 2 y muestre su resultado*
		do {
			pares+=2;
			System.out.println(pares);
		}
		
		//*Mientras que pares sea menor a 200
		while(pares<200);

	}

}
