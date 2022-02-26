/* Recibir como dato la extensión de la estancia en acres, calcule e imprima la extensión de la misma en hectáreas. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_38 {

	public static void main(String[] args) {
	float acre,hec;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese la cantidad de Acre: ");
	acre = lee.nextFloat();
	hec = (float) (acre*0.4046686);
	System.out.println("***** CONVERSIÓN ***** ");
	System.out.println("ACRE    :    "+acre);
	System.out.println("HECTAREA:    "+hec);

	}

}
