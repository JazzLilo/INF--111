/*Escrib� un programa que le solicit� al usuario ingresar una fecha formada por 8 n�meros, donde los primeros dos representan el d�a, 
 * los siguientes dos el mes y los �ltimos cuatroel a�o (DDMMAAAA). Este dato debe guardarse en una variable con tipo int (n�mero entero).
 *  Finalmente, mostrar al usuario la fecha con el formato DD / MM / AAAA.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_11 {

	public static void main(String[] args) {
		int fecha,a�o,dia,mes;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese una fecha formada por 8 n�meros: ");
		fecha = lee.nextInt();
		a�o = fecha % 10000;
		dia = fecha/1000000;
		mes = (fecha/10000)%100;
		System.out.println(dia+"/"+mes+"/"+a�o);
	}

}
