/*En las olimpiadas de invierno el tiempo que realizan los participantes en la competencia de velocidad en pista se mide en minutos, segundos y centésimas. 
 * La distancia que recorren se expresa en metros. Calcule la velocidad de los participantes en kilómetros por hora de las diferentes competencias.*/
package Practica_01;

import java.util.Scanner;

/* @author Michi */

public class N_43 {

	public static void main(String[] args) {
	float min,seg,cen,tse,vms,vkh;
	int dis;
	Scanner lee = new Scanner(System.in);
	System.out.print("Ingrese los minutos: ");
	min = lee.nextFloat();
	System.out.print("Ingrese los segundos: ");
	seg = lee.nextFloat();
	System.out.print("Ingrese los centèsimas: ");
	cen = lee.nextFloat();
	System.out.print("Ingrese la distancia recorrida: ");
	dis = lee.nextInt();
	tse = min*60+seg+cen/100;
	vms = dis/tse;
	vkh = (vms*3600)/1000;
	System.out.print("La velocidad en kilometros*hora es: "+vkh);
	
	}

}
