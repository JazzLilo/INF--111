/*Escribí un programa que solicite al usuario que ingrese cuántos shows musicales ha visto en el último año y almacene ese número en una variable. 
 * A continuación, mostrar en pantalla un valor de verdad (True o False) que indique si el usuario ha visto más de 3 shows.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_10 {

	public static void main(String[] args) {
		int a;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese cuántos shows musicales ha visto en el último año: ");
		a = lee.nextInt();
		if(a>3) {
			System.out.print("TRUE");
		}
		else {
			System.out.print("FALSE");
		}
	}

}
