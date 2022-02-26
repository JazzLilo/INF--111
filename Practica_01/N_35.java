/* Convertir una cantidad de grados Fahrenheit a Celsius y Kelvin. */
package Practica_01;

import java.util.Scanner;

/* @author Michi */
public class N_35 {

	public static void main(String[] args) {
		float fahrenheit,celsius,kelvin;
		Scanner lee = new Scanner(System.in);
		System.out.print("Ingrese la cantidad en Fahrenheit: ");
		fahrenheit = lee.nextFloat();
		celsius = (5*(fahrenheit-32))/9;
		kelvin = (float) (celsius+273.15);
		System.out.println("***** CONVERSIÓN ***** ");
		System.out.println("CELSIUS:    "+celsius);
		System.out.println("KELVIN:     "+kelvin);
		System.out.println("FAHRENHEIT: "+fahrenheit);
	}

}
	