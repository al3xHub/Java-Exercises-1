/*
 * PROGRAMA Suma
	VARIABLES
	ENTERO numero1, numero2, suma
INICIO
	ESCRIBIR “Dame un número:”
	LEER numero1
	ESCRIBIR “Dame otro número:”
	LEER numero2
	suma=numero1+numero2
	ESCRIBIR “La suma es” + suma
FIN 
 */

package es.studium.ejercicio2;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args)
	{
		int numero1, numero2, suma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dame otro numero:");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		suma = numero1 + numero2;
		
		System.out.println("La suma es: " + suma);
			
			
		teclado.close();
	}

}
