/* Escrib� un programa que solicit� al usuario ingresar tres n�meros para luego mostrarle el promedio de los tres. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_06 {

	public static void main(String[] args) {
		int a,b,c,prom;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese n�mero 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese n�mero 2: ");
		b = lee.nextInt();
		System.out.print("Ingrese n�mero 3: ");
		c = lee.nextInt();
		prom = (a+b+c)/3;
		System.out.print("El promedio es: "+prom);
	}

}
