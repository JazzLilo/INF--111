/*Escrib� un programa que solicite al usuario el ingreso de un texto y almacene ese texto en una variable. 
  A continuaci�n, mostrar en pantalla la primera letra del texto ingresado. 
  Luego,solicitar al usuario que ingrese un n�mero positivo menor a la cantidad de caracteres que tiene el texto que ingres� 
  (por ejemplo, si escribi� la palabra �HOLA�, tendr� que ser un n�mero entre 0 y 4) y almacenar este n�mero en una variable llamada �ndice.
  Mostrar en pantalla el car�cter del texto ubicado en la posici�n dada por �ndice.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_09 {

	public static void main(String[] args) {
		String a;
		int b;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un texto: ");
		a = lee.nextLine();
		System.out.println("El car�cter en primer lugar es: "+a.charAt(0));
		System.out.print("Ingres� un n�mero positivo menor a "+a.length()+": ");
		b=lee.nextInt();
		System.out.print("El car�cter en esa posici�n es: "+a.charAt(b));
		
		

	}

}
