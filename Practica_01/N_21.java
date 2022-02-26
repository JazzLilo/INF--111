/*Hallar la potencia de a^n, donde a y n pertenecen a Z^+(números enteros positivos).*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_21 {

	public static void main(String[] args) {
		int a,n,r;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese base: ");
		a = lee.nextInt();
		System.out.print("Ingrese exponente: ");
		n = lee.nextInt();
		r = (int) Math.pow(a, n);
		System.out.print("La potencia es: "+r);
	}

}
