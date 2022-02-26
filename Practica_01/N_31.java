/* Crear un programa para encontrar el Área de un círculo, use la formula.
 * 		A= π r^2     */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_31 {

	public static void main(String[] args) {
		int area,rad;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el radio: ");
		rad= lee.nextInt();
		area = (int) (Math.PI*Math.pow(rad, 2));
		System.out.print("El area es: "+area);
	}

}
