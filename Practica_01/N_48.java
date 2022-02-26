/*Reciba como dato el lado de un hexaedro o cubo, calcule el área de la base, el área lateral, el área total y el volumen.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_48 {

	public static void main(String[] args) {
		float lado,Ab,Al,At,V;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el radio del cono: ");
		lado = lee.nextFloat();
		Ab = (float) Math.pow(lado, 2);
		Al = (float) (4*Math.pow(lado, 2));
		At = (float) (6*Math.pow(lado, 2));
		V = (float) Math.pow(lado, 3);
		System.out.println("Area de la base: "+Ab);
		System.out.println("Area lateral   : "+Al);
		System.out.println("Area total     : "+At);
		System.out.println("Volumen        : "+V);
	}

}
