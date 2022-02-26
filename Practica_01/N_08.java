/*Escribí un programa que solicité al usuario el ingreso de dos palabras, las cuales se guardarán en dos variables distintas. 
 * A continuación, almacena en una variable la concatenación de la primera palabra, más un espacio, más la segunda palabra. Muestra este resultado en pantalla.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_08 {

	public static void main(String[] args) {
		String a,b;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese primera palabra: ");
		a = lee.nextLine();
		System.out.print("Ingrese segunda palabra: ");
		b = lee.nextLine();
		System.out.print(a+" "+b);

	}

}
