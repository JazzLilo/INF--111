/*	Escriba un programa que, al recibir como un dato de cuatro dígitos, genere una impresión como la que se muestra a continuación:
	El número es: 6352       6
                             3
                             5
                             2 				*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_45 {

	public static void main(String[] args) {
		int num;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese un número de 4 dígitos: ");
		num = lee.nextInt();
		if (num > 999 & num<10000) {
			int a = num/1000;
			int b = num-(a*1000);
			int c = b/100;
			int d = b -(c*100);
			int e = d/10;
			int f = d-(e*10);
			System.out.println("El numero es: "+num);
			System.out.println("------------> "+a);
			System.out.println("------------> "+c);
			System.out.println("------------> "+e);
			System.out.println("------------> "+f);

		}
	}

}
