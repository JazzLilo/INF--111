/*Reciba como datos el radio, la generatriz y la altura de un cono, calcule e imprima el área de la base, el área lateral, el área total y su volumen.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_46 {

	public static void main(String[] args) {
		float radio,generatriz,altura,Al,At,V;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el radio del cono: ");
		radio = lee.nextFloat();
		System.out.print("Ingrese la generatriz del cono: ");
		generatriz = lee.nextFloat();
		System.out.print("Ingrese la altura del cono: ");
		altura = lee.nextFloat();
		Al = (float) (Math.PI*radio*generatriz);
		At = (float) (Math.PI*radio*generatriz+Math.PI*Math.pow(radio, 2));
		V  = (float) ((Math.PI*Math.pow(radio, 2)*altura)/3);
		System.out.println("El area lateral es: "+Al);
		System.out.println("El area total es:   "+At);
		System.out.println("El volumen es:      "+V);
	}

}
