/*Escribí un programa que le pida al usuario ingresar dos palabras y las guarde en dos variables, 
 *y que luego imprima True si la primera palabra es menor que la segunda o False si no lo es.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_15 {

	public static void main(String[] args) {
		String a,b;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese texto 1: ");
		a = lee.nextLine();
		System.out.print("Ingrese texto 2: ");
		b = lee.nextLine();
		if(a.length()<b.length()) {
			System.out.println("(TRUE)");
		}
		else {
			System.out.println("(FALSE)");
		}
	}

}
