/*Escrib� un programa que le solicite al usuario su edad y la guarde en una variable. 
 * Que luego solicite la cantidad de art�culos comprados en una tienda y la guarde en otra variable. 
 * Finalmente, mostrar en pantalla un valor de verdad (True o False) que indique si el usuario es mayor de 18 a�os de edad y adem�s compr� m�s de 1 art�culo.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_13 {

	public static void main(String[] args) {
		int edad,articulos;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese su edad: ");
		edad = lee.nextInt();
		System.out.print("Ingrese la cantidad de art�culos comprados: ");
		articulos = lee.nextInt();
		if(edad>18 && articulos>1) {
			System.out.print("TRUE");
		}
		else{
			System.out.print("FALSE");
		}
	}

}
