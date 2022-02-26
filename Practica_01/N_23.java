/*Dado un número de 5 dígitos, devolver el número en orden inverso.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_23 {

	public static void main(String[] args) {
		int numero;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese un número de 5 digitos: ");
		numero = lee.nextInt();
		if (numero>=10000 && numero<=99999) {
			int q = numero/10000;
            int t = numero - (q*10000);
            int u = t/1000;
            int v = t - (u*1000);
            int w = v/100 ;
            int x = v-(w*100);
            int y = x/10;
            int z = x -(y*10);
            int inv = (z*10000)+(y*1000)+(w*100)+(u*10)+q;
            System.out.println("El numero invertido es: "+inv);
		}
		else {
			System.out.print("Número no valido");
		}
	}

}
