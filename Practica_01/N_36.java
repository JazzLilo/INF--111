/* Convertir grados sexagesimales a centesimales */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_36 {

	public static void main(String[] args) {
		float sexagesimales,centesimales;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese los grados Sexagesimales: ");
		sexagesimales = lee.nextFloat();
		centesimales = 2000*(sexagesimales/180);
		System.out.println("***** CONVERSIÓN ***** ");
		System.out.println("SEXAGESIMAL:    "+sexagesimales);
		System.out.println(" CENTESIMAL:    "+centesimales);
	}

}
