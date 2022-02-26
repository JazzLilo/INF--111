/*Hallar área y el perímetro de un rectángulo.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_30 {

	public static void main(String[] args) {
		int log,ancho,area,per;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el largo: ");
		log= lee.nextInt();
		System.out.print("Ingrese el ancho: ");
		ancho= lee.nextInt();
		area = log*ancho;
		System.out.println("El area es: "+area);
		per = 2*(log+ancho);
		System.out.print("El perimetro es: "+per);

	}

}
