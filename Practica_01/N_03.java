/*Escrib� un programa que solicit� al usuario ingresar un n�mero con decimales y almac�nalo en una variable. 
  A continuaci�n, el programa debe solicitar al usuario que ingrese un n�mero entero y guardarlo en otra variable. 
  En una tercera variable se deber� guardar el resultado de la suma de los dos n�meros ingresados por el usuario. 
  Por �ltimo, se debe mostrar en pantalla el texto �El resultado de la suma es [suma]�, donde �[suma]� se reemplazar� por el resultado de la operaci�n.
  A continuaci�n, el programa debe solicitar al usuario que ingrese un tercer n�mero entero, el cual se debe almacenar en una nueva variable. 
  Por �ltimo, muestra en pantalla el resultado de la multiplicaci�n de este nuevo n�mero por el resultado de la suma anterior.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_03 {

	public static void main(String[] args) {
		double a,suma,multi;
		int b,c;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese n�mero con decimales: ");
		a = lee.nextDouble();
		System.out.print("Ingrese n�mero entero: ");
		b = lee.nextInt();
		suma = a+b;
		System.out.println("El resultado de la suma es: "+suma);
		System.out.print("Ingrese n�mero entero: ");
		c = lee.nextInt();
		multi = c*suma;
		System.out.print("El resultado de la multiplicaci�n es: "+multi);
	}

}
