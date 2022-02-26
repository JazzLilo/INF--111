/* Hallar el cociente y el residuo(resto) de dos números enteros. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_18 {

	public static void main(String[] args) {
		 int a,b,div,res;
		 Scanner lee = new Scanner (System.in);
		 System.out.print("Ingrese un número 1: ");
		 a = lee.nextInt();
		 System.out.print("Ingrese un número 2: ");
		 b = lee.nextInt();
		 div = a/b;
		 System.out.println("El cociente es: "+div);
		 res= a%b;
		 System.out.print("El residuo es: "+res);
	}

}
