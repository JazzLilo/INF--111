/* Reciba como dato el radio de una esfera, calcule e imprime el área y su volumen.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_47 {

	public static void main(String[] args) {
		float radio,area,vol;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el radio de la esfera: ");
		radio = lee.nextFloat();
		area = (float) (4*Math.PI*Math.pow(radio, 2));
		vol = (float) ((4*Math.PI*Math.pow(radio, 3))/3);
		System.out.println("El area de la esfera es: "+area);
		System.out.print("El volumen de la esfera es: "+vol);

	}

}
