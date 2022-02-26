/*Escribí un programa que solicité al usuario ingresar un número con decimales y almacénalo en una variable. 
  A continuación, el programa debe solicitar al usuario que ingrese un número entero y guardarlo en otra variable. 
  En una tercera variable se deberá guardar el resultado de la suma de los dos números ingresados por el usuario. 
  Por último, se debe mostrar en pantalla el texto “El resultado de la suma es [suma]”, donde “[suma]” se reemplazará por el resultado de la operación.
  A continuación, el programa debe solicitar al usuario que ingrese un tercer número entero, el cual se debe almacenar en una nueva variable. 
  Por último, muestra en pantalla el resultado de la multiplicación de este nuevo número por el resultado de la suma anterior.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_03 {

	public static void main(String[] args) {
		double a,suma,multi;
		int b,c;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese número con decimales: ");
		a = lee.nextDouble();
		System.out.print("Ingrese número entero: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.println("El resultado de la suma es: "+suma);
		System.out.print("Ingrese número entero: ");
		c = lee.nextInt();
		multi = c*suma;
		System.out.print("El resultado de la multiplicación es: "+multi);
	}

}
