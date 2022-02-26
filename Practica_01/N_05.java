/* Escribí un programa que solicité al usuario ingresar la cantidad de kilómetros recorridos por una motocicleta 
   y la cantidad de litros de combustible que consumió durante ese recorrido. Mostrar el consumo de combustible por kilómetro.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_05 {

	public static void main(String[] args) {
		int km;
		float litros,combustible;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese cantidad de kilometros: ");
		km = lee.nextInt();
		System.out.print("Ingrese cantidad de litros: ");
		litros = lee.nextFloat();
		combustible = km/litros;
		System.out.print("Consumo de combustible por km: "+combustible);

	}

}
