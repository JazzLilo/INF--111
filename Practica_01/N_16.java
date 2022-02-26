/*Escribí un programa para pedir al usuario su nombre y luego el nombre de otra persona, almacenando cada nombre en una variable. 
 * Luego mostrar en pantalla un valor de verdad que indique si: los nombres de ambas personas comienzan con la misma letra ó si terminan con la misma letra. 
 * Por ejemplo, si los nombres ingresados son María y Marcos, se mostrará True, ya que ambos comienzan con la misma letra. 
 * Si los nombres son Ricardo y Gonzalo se mostrará True, ya que ambos terminan con la misma letra. 
 * Si los nombres son Florencia y Lautaro se mostrará False, ya que no coinciden ni la primera ni la última letra.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_16 {

	public static void main(String[] args) {
		String a,b;
		int c,d;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese su nombre: ");
		a = lee.nextLine();
		c = a.length();
		System.out.print("Ingrese otro nombre: ");
		b = lee.nextLine();
		d = b.length();
		if(a.toUpperCase().charAt(0) == b.toUpperCase().charAt(0) || a.toUpperCase().charAt(c-1) == b.toUpperCase().charAt(d-1) ) {
			System.out.print("Los nombres de ambas personas comienzan y/o terminan con la misma letra (TRUE)");
		}
		else {
			System.out.print("Los nombres de ambas personas tienen inicio y fin diferentes (FALSE)");
		}

	}

}
