/* Recibir como datos las coordenadas de los puntos P1, P2 y P3 que corresponden a los vértices de un triángulo, 
 * calcule su perímetro, sabiendo que la distancia entre dos puntos dados es:
 * DIS= √((X1-X2)^2+〖(Y1-Y2)〗^2 )*/
package Practica_01;

import java.util.Scanner;

/*  @author Michi */

public class N_40 {

	public static void main(String[] args) {
	int P1,P2,P3,X1,X2,X3,Y1,Y2,Y3,PER;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese el X1: ");
	X1 = lee.nextInt();
	System.out.print("Ingrese el X2: ");
	X2 = lee.nextInt();
	System.out.print("Ingrese el X3: ");
	X3 = lee.nextInt();
	System.out.print("Ingrese el Y1: ");
	Y1 = lee.nextInt();
	System.out.print("Ingrese el Y2: ");
	Y2 = lee.nextInt();
	System.out.print("Ingrese el Y3: ");
	Y3 = lee.nextInt();
	P1 = (int) Math.sqrt(Math.pow((X1-X2),2)+Math.pow((Y1-Y2),2));
	P2 = (int) Math.sqrt(Math.pow((X2-X3),2)+Math.pow((Y2-Y3),2));
	P3 = (int) Math.sqrt(Math.pow((X1-X3),2)+Math.pow((Y1-Y3),2));
	PER = P1+P2+P3;
	System.out.print("El perimetro es: "+PER);
	}

}
