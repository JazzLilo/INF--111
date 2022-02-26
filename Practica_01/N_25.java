/*	Obtener el valor de c y d de acuerdo a la siguiente fórmula:
	c=  ((4a^4+3ba+b^2 ))/(a^2-b^2 )   d=  ((3c^2+a+b))/4 */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_25 {

	public static void main(String[] args) {
		int x,y,c,d;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese el valor de x: ");
        x = lee.nextInt();
        System.out.print("Ingrese el valor de y: ");
        y = lee.nextInt();
        c = (int) (((4*Math.pow(x,4))+3*y*x+(Math.pow(y,2)))/((Math.pow(x, 2))-(Math.pow(y,2)))); 
        d = (int) (((3*Math.pow(c, 2))+x+y)/4);
        System.out.println("El valor de 'c' es: "+c);
        System.out.println("El valor de 'd' es: "+d);

	}

}
