/* Dado 4 n�meros enteros, obtener el porcentaje de c/u en funci�n a la suma de los 4 n�meros ingresados.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_26 {

	public static void main(String[] args) {
		int a,b,c,d,s, pa,pb,pc,pd;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese un n�mero 1: ");
		a = lee.nextInt();
		System.out.print("Ingrese un n�mero 2: ");
		b = lee.nextInt();
		System.out.print("Ingrese un n�mero 3: ");
		c = lee.nextInt();
		System.out.print("Ingrese un n�mero 4: ");
		d = lee.nextInt();
		s = a+b+c+d;
		System.out.println("La suma es: "+s);
		pa = (a*100)/s;
		pb = (b*100)/s;
		pc = (c*100)/s;
		pd = (d*100)/s;
		System.out.println("El porcentaje de a es: "+pa+"%");
		System.out.println("El porcentaje de b es: "+pb+"%");
		System.out.println("El porcentaje de c es: "+pc+"%");
		System.out.println("El porcentaje de d es: "+pd+"%");
	}

}
