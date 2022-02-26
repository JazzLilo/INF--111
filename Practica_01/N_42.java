/*En una casa de cambio necesitan construir un programa talque al dar como dato una cantidad expresada en dólares, convierta la cantidad a bolivianos (bs).*/
package Practica_01;

import java.util.Scanner;

/*  @author Michi */

public class N_42 {

	public static void main(String[] args) {
	float dolar,bs;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese la cantidad en dolares: ");
	dolar = lee.nextFloat();
	bs = (float) (dolar*6.86);
	System.out.print("La cantidad en BS es: "+bs);
	}

}
