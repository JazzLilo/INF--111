/*Escrib� un programa que solicite al usuario dos n�meros y los almacene en dos variables. 
  En otra variable, almacena el resultado de la suma de esos dos n�meros y luego muestra ese resultado en pantalla.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_04 {

	public static void main(String[] args) {
		int a,b,suma;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese n�mero 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese n�mero 2: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.print("El resultado de la suma es: "+suma);
	}

}
