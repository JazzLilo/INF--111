/*Escrib� un programa que solicite al usuario que ingrese cu�ntos shows musicales ha visto en el �ltimo a�o y almacene ese n�mero en una variable. 
 * A continuaci�n, mostrar en pantalla un valor de verdad (True o False) que indique si el usuario ha visto m�s de 3 shows.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_10 {

	public static void main(String[] args) {
		int a;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese cu�ntos shows musicales ha visto en el �ltimo a�o: ");
		a = lee.nextInt();
		if(a>3) {
			System.out.print("TRUE");
		}
		else {
			System.out.print("FALSE");
		}
	}

}
