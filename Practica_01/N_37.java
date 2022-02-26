/* 	Dada la longitud y el peso de un objeto expresado en pies y libras. Imprima los datos de este objeto, pero expresado en metros y kilos, respectivamente.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_37 {

	public static void main(String[] args) {
		float pie,lib,metro,k;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en Pie: ");
		pie = lee.nextFloat();
		System.out.print("Ingrese la cantidad en Libra: ");
		lib = lee.nextFloat();
		metro = (float) (pie/3.28084);
		k = (float) (lib/2.462);
		System.out.println("***** CONVERSIÓN ***** ");
		System.out.println("PIE   :    "+pie);
		System.out.println("METROS:    "+metro);
		System.out.println("LIBRAS:    "+lib);
		System.out.println("KILOS :    "+k);

	}

}
