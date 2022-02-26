/*Escribí un programa que solicite al usuario dos números y los almacene en dos variables. 
  En otra variable, almacena el resultado de la suma de esos dos números y luego muestra ese resultado en pantalla.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_04 {

	public static void main(String[] args) {
		int a,b,suma;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese número 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese número 2: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.print("El resultado de la suma es: "+suma);
	}

}
