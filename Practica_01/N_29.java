/* Hallar el �rea y el per�metro de un cuadrado.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_29 {

	public static void main(String[] args) {
		 	int area,per,lado;
		 	Scanner lee = new Scanner(System.in);
			System.out.print("Ingrese el lado del cuadrado: ");
			lado = lee.nextInt();
			area = (int) Math.pow(lado, 2);
			System.out.println("El �rea del cuadrado es: "+area);
			per = 4*lado;
			System.out.print("El preimetro del cuadrado es: "+per);

	}

}
