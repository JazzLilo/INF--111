/* 	Determinar la suma de los N primeros n�meros enteros positivos Z^+  use la siguiente formula:
S=  N(N+1)/2*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_24 {

	public static void main(String[] args) {
		int N,S;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese un n�mero: ");
		N = lee.nextInt();
		S = (N*(N+1))/2;
		System.out.print("La suma de los primeros "+N+" n�meros es: "+S);

	}

}
