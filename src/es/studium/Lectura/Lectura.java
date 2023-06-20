/*
 * Pedir el nombre de usuario y saludarlo con el nombre
 */

package es.studium.Lectura;

import java.util.Scanner;

public class Lectura
{

	public static void main(String[] args)
	{
		String nombre;
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR "Dame tu nombre: "
		System.out.println("Dame tu nombre:");
		
		//LEER nombre
		nombre = teclado.nextLine();
		teclado.close();
		
				
		//ESCRIBIR "Hola " + nombre
		System.out.println("Hola " + nombre);

	}

}
