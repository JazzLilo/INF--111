/*Escribí un programa para solicitar al usuario el ingreso de un número entero y que luego imprima un valor de verdad dependiendo de si el número es par o no.
  Recordar que un número es par si el resto, al dividirlo por 2, es 0.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_12 {

	public static void main(String[] args) {
		int a;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un número entero: ");
		a = lee.nextInt();
		if(a%2==0) {
			System.out.print("Número Par (TRUE)");
		}
		else {
			System.out.print("Número Impar (FALSE)");
		}

	}

}
