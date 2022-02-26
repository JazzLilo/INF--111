/*Escribí un programa que solicite al usuario el ingreso de un texto y almacene ese texto en una variable. 
  A continuación, mostrar en pantalla la primera letra del texto ingresado. 
  Luego,solicitar al usuario que ingrese un número positivo menor a la cantidad de caracteres que tiene el texto que ingresó 
  (por ejemplo, si escribió la palabra “HOLA”, tendrá que ser un número entre 0 y 4) y almacenar este número en una variable llamada índice.
  Mostrar en pantalla el carácter del texto ubicado en la posición dada por índice.*/
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
		System.out.println("El carácter en primer lugar es: "+a.charAt(0));
		System.out.print("Ingresá un número positivo menor a "+a.length()+": ");
		b=lee.nextInt();
		System.out.print("El carácter en esa posición es: "+a.charAt(b));
		
		

	}

}
