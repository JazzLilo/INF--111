/* Dados dos números enteros, hallar la suma, resta y multiplicación de dichos números.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_17 {

	public static void main(String[] args) {
		int a,b,suma,resta,multi,div;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un número 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese un número 2: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.println("La suma es: "+suma);
		resta = a-b;
		System.out.println("La resta es: "+resta);
		multi = a*b;
		System.out.println("La multiplicación es: "+multi);
		div = a/b;
		System.out.println("La división es: "+div);
	}

}
