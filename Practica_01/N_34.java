/* Dada una cantidad de mil�metros, expresarlo en la m�xima cantidad de metros, el resto en dec�metros, cent�metros y mil�metros*/
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
		System.out.println("***** CONVERSI�N ***** ");
		System.out.println("METROS:      "+metros);
		System.out.println("DEC�METROS:  "+dec);
		System.out.println("CENT�METROS: "+cent);
		System.out.println("MIL�METROS:  "+mil);
			

	}

}
