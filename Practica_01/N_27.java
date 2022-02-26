/*	Calcular el inter�s compuesto generado por un capital depositado durante cierta cantidad de tiempo a una tasa de inter�s determinada, aplique las siguientes formulas:
		M=(1+r%)^t* C
		I=M-C
Monto(M): Es la suma del capital m�s sus intereses producidos en determinado tiempo.
Tasa de inter�s (r%): Es la ganancia que se obtiene cada 100 unidades monetarias en cada periodo de tiempo.
Capital (C): Es todo aquello que se va a ceder o imponer durante alg�n tiempo para generar una ganancia.
Inter�s (I): Parte de la utilidad que obtiene el capitalista prestar su dinero.
Tiempo (t): Es el periodo de tiempo durante el cual se cede el capital.
*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_27 {

	public static void main(String[] args) {
		float m,r,c,i,t;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese tasa de inter�s: ");
		r = lee.nextFloat();
		System.out.print("Ingrese el tiempo: ");
		t = lee.nextFloat();
		System.out.print("Ingrese el capital: ");
		c = lee.nextFloat();
		m = ((float) Math.pow((1+r/100), t))*c;
		System.out.println("El monto es: "+m);
		i = m-c;
		System.out.println("El inter�s es: "+i);
	}

}
