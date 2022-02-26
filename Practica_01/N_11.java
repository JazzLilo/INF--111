/*Escribí un programa que le solicité al usuario ingresar una fecha formada por 8 números, donde los primeros dos representan el día, 
 * los siguientes dos el mes y los últimos cuatroel año (DDMMAAAA). Este dato debe guardarse en una variable con tipo int (número entero).
 *  Finalmente, mostrar al usuario la fecha con el formato DD / MM / AAAA.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_11 {

	public static void main(String[] args) {
		int fecha,año,dia,mes;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese una fecha formada por 8 números: ");
		fecha = lee.nextInt();
		año = fecha % 10000;
		dia = fecha/1000000;
		mes = (fecha/10000)%100;
		System.out.println(dia+"/"+mes+"/"+año);
	}

}
