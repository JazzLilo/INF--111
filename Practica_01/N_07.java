/* Escrib� un programa que solicite al usuario un n�mero y le reste el 15%, almacenando todo en una �nica variable. 
   A continuaci�n, mostrar el resultado final en pantalla. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_07 {

	public static void main(String[] args) {
		float a,p,res;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese n�mero: ");
		a = lee.nextFloat();
		p = (float) (a*0.15);
		res = a - p;
		System.out.print("Descontando el 15% queda: "+res);
	}

}
