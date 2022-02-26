/* 	Determinar la suma de los N primeros números enteros positivos Z^+  use la siguiente formula:
S=  N(N+1)/2*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_24 {

	public static void main(String[] args) {
		int N,S;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		N = lee.nextInt();
		S = (N*(N+1))/2;
		System.out.print("La suma de los primeros "+N+" números es: "+S);

	}

}
