/* Calcule el número de segundos que hay en un determinado número de días.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_44 {

	public static void main(String[] args) {
	int seg,dia,hr;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese los segundos: ");
	seg = lee.nextInt();
	hr = seg/3600;
	dia = hr/24;
	System.out.print("Son "+dia+" dias");

	}

}
