/* Dado dos n�meros enteros, determinar cu�ntos n�meros enteros est�n incluidos en ellos.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_19 {

	public static void main(String[] args) {
		int a,b,resp;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un n�mero 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese un n�mero 2: ");
		b = lee.nextInt();
		resp = b-(a+1);
		System.out.print("Hay "+resp+" n�meros comprendidos entre ellos");
	}

}
