/* Dado dos números enteros, determinar cuántos números enteros están incluidos en ellos.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_19 {

	public static void main(String[] args) {
		int a,b,resp;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un número 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese un número 2: ");
		b = lee.nextInt();
		resp = b-(a+1);
		System.out.print("Hay "+resp+" números comprendidos entre ellos");
	}

}
