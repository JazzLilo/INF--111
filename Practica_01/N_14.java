/*Escribí un programa que, dada una cadena de texto por el usuario, imprima True si la cantidad de caracteres en la cadena es un número impar, o False si no lo es.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_14 {

	public static void main(String[] args) {
		String a;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un texto: ");
		a = lee.nextLine();
		if(a.length()%2==0) {
			System.out.print("La cantidad de caracteres es Par (TRUE)");
		}
		else {
			System.out.print("La cantidad de caracteres es Impar (FALSE)");
		}
	}

}
