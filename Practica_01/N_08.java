/*Escrib� un programa que solicit� al usuario el ingreso de dos palabras, las cuales se guardar�n en dos variables distintas. 
 * A continuaci�n, almacena en una variable la concatenaci�n de la primera palabra, m�s un espacio, m�s la segunda palabra. Muestra este resultado en pantalla.*/
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
