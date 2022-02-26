/*	Recibir como datos los 3 lados de un triángulo, calcule e imprima su área, mediante las siguientes formulas:
							Area= √(Aux*(Aux-LA1)*(Aux-LA2)*(Aux-LA3) )
								Aux=  ((LA1+LA2+LA3))/2	 */
package Practica_01;

import java.util.Scanner;

/*  @author Michi */

public class N_39 {

	public static void main(String[] args) {
	int LA1,LA2,LA3,Aux,Area;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese el lado 1: ");
	LA1 = lee.nextInt();
	System.out.print("Ingrese el lado 2: ");
	LA2 = lee.nextInt();
	System.out.print("Ingrese el lado 3: ");
	LA3 = lee.nextInt();
	Aux = ((LA1+LA2+LA3))/2;
	Area = (int) Math.sqrt((Aux*(Aux-LA1)*(Aux-LA2)*(Aux-LA3)));
	System.out.print("El area es: "+Area);
	}

}
