/* Dada una cantidad de horas obtener su equivalente en minutos y segundo. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_33 {

	public static void main(String[] args) {
		float hr,min,seg;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en horas: ");
		hr= lee.nextFloat();
		min = hr*60;
		seg = hr*3600;
		System.out.println("***** CONVERSION ***** ");
		System.out.println("SEGUNDOS: "+seg);
		System.out.println("MINUTOS: "+min);
		System.out.print("HORAS: "+hr);
	
	}

}
