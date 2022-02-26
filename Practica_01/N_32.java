/* 32.	Crear un programa que permita convertir una cantidad de segundos en horas, minutos y segundos.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_32 {

	public static void main(String[] args) {
		double seg,min,hr;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en segundos: ");
		seg= lee.nextInt();
		min = seg/60;
		hr = seg/3600;
		System.out.println("***** CONVERSION ***** ");
		System.out.println("SEGUNDOS: "+seg);
		System.out.println("MINUTOS: "+min);
		System.out.print("HORAS: "+hr);
	
	}

}
