/* Dados dos n�meros enteros, hallar la suma, resta y multiplicaci�n de dichos n�meros.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_17 {

	public static void main(String[] args) {
		int a,b,suma,resta,multi,div;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un n�mero 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese un n�mero 2: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.println("La suma es: "+suma);
		resta = a-b;
		System.out.println("La resta es: "+resta);
		multi = a*b;
		System.out.println("La multiplicaci�n es: "+multi);
		div = a/b;
		System.out.println("La divisi�n es: "+div);
	}

}
