/*Escrib� un programa que solicite al usuario que ingrese su nombre. El nombre se debe almacenar en una variable llamada nombre.
  A continuaci�n, se debe mostrar en pantalla el texto �Ahora est�s en la matrix, [usuario]�, 
  donde �[usuario]� se reemplazar� por el nombre que el usuario haya ingresado.*/
package Practica_01;

import java.util.Scanner;

/*@author Michi*/

public class N_01 {

	public static void main(String[] args) {
		String nombre;
		Scanner lee = new Scanner (System.in);
		System.out.print("Usuario: ");
		nombre= lee.nextLine();
		System.out.print("Ahora est�s en la matrix,"+nombre);
	}

}
