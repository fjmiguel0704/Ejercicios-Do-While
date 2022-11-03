package actdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero, suma=0, incremento=0;
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el número del que quieras realizar la suma: ");
		numero=read.nextInt();
		
		do {
			incremento++;
			suma+=incremento;
		}
		while(incremento<numero);
		
		System.out.println(suma);

	}

}
