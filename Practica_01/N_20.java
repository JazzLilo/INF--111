/* Dado el valor de venta de un producto, hallar el IGV (19%) y el precio de venta.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_20 {

	public static void main(String[] args) {
		float igv,vv,pv;
		Scanner lee = new Scanner (System.in);
		System.out.print("Ingrese el valor de venta: ");
		vv = lee.nextFloat();
		igv = (float) (vv*0.19);
		pv = vv+igv;
		System.out.println("IGV: "+igv);
		System.out.print("Precio de venta: "+pv);

	}

}
