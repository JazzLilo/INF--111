/* Dada una cantidad de milímetros, expresarlo en la máxima cantidad de metros, el resto en decímetros, centímetros y milímetros*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_34 {

	public static void main(String[] args) {
		float mil,metros,dec,cent;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en milimetros: ");
		mil = lee.nextFloat();
		metros = (float) (mil*0.001);
		dec = (float) (mil*0.01);
		cent = (float) (mil*0.1);
		System.out.println("***** CONVERSIÓN ***** ");
		System.out.println("METROS:      "+metros);
		System.out.println("DECÍMETROS:  "+dec);
		System.out.println("CENTÍMETROS: "+cent);
		System.out.println("MILÍMETROS:  "+mil);
			

	}

}
