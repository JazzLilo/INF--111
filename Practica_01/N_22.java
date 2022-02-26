/*	Hallar la radicación de n√(a), donde a y n pertenecen a Z^+.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_22 {

	public static void main(String[] args) {
		double a,n,rad;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese la base: ");
		a = lee.nextDouble();
		System.out.print("Ingrese el valor del exponente del radical: ");
		n = lee.nextDouble();
		rad = Math.pow(a, (1/n));
		System.out.print("La radicación es: "+rad);
	}

}
