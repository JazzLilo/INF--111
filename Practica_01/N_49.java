/*	Recibir como datos las coordenadas de los puntos P1, P2 y P3 que corresponden a los vértices de un triángulo, calcule su superficie.
	Para calcular el área de un triángulo dadas las coordenadas de los vértices que la componen, podemos aplicar la siguiente fórmula: 
						Área=1/2*|X1*(Y2-Y3)+X2*(Y3-Y1)+X3*(Y1-Y2)| */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_49 {

	public static void main(String[] args) {
		float x1,x2,x3,y1,y2,y3,area;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la coordenada X1: ");
		x1 = lee.nextFloat();
		System.out.print("Ingrese la coordenada Y1: ");
		y1 = lee.nextFloat();
		System.out.print("Ingrese la coordenada X2: ");
		x2 = lee.nextFloat();
		System.out.print("Ingrese la coordenada Y2: ");
		y2 = lee.nextFloat();
		System.out.print("Ingrese la coordenada X3: ");
		x3 = lee.nextFloat();
		System.out.print("Ingrese la coordenada Y3: ");
		y3 = lee.nextFloat();
		area = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2);
		System.out.print("El area es: "+area);
	}

}
