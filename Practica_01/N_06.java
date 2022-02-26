/* Escribí un programa que solicité al usuario ingresar tres números para luego mostrarle el promedio de los tres. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_06 {

	public static void main(String[] args) {
		int a,b,c,prom;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese número 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese número 2: ");
		b = lee.nextInt();
		System.out.print("Ingrese número 3: ");
		c = lee.nextInt();
		prom = (a+b+c)/3;
		System.out.print("El promedio es: "+prom);
	}

}
