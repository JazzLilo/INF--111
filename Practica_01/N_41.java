/*Recibir como datos el costo de un artículo vendido y la cantidad de dinero entregada por el cliente, calcule e imprima el cambio que se debe entregar al cliente.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_41 {

	public static void main(String[] args) {
	int vend,cantCliente,cambio;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese el precio del producto: ");
	vend = lee.nextInt();
	System.out.print("Ingrese el efectivo entregado por el cliente: ");
	cantCliente = lee.nextInt();
	cambio = cantCliente - vend;
	System.out.print("El cambio es: "+cambio);
	}

}
