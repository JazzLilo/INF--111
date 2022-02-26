/*Recibir como datos el radio y la altura de un cilindro, calcule e imprima el área y su volumen*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_28 {

	public static void main(String[] args) {
		int radio,altura,area,vol;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el radio: ");
		radio = lee.nextInt();
		System.out.print("Ingrese la altura: ");
		altura = lee.nextInt();
		area = (int) (2*Math.PI*radio*(radio+altura));
		System.out.println("El área del cilindro es: "+area);
		vol = (int) (Math.PI*Math.pow(radio, 2)*altura);
		System.out.print("El volumen del cilindro es: "+vol);
	}

}
