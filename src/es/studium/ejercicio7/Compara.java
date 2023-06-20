/*
 * PROGRAMA Compara
 * 
	VARIABLES
	ENTERO numero1, numero2
	
INICIO
	ESCRIBIR “Dame un número:”
	LEER numero1
	
	ESCRIBIR “Dame otro número:”
	LEER numero2
	
	SI numero1=numero2 ENTONCES
	ESCRIBIR “Los números son iguales”
	
	SI NO
	SI numero1>numero2 ENTONCES
	ESCRIBIR “El número 1 es mayor que el número 2”
	
	SI NO
	ESCRIBIR “El número 2 es mayor que el número 1”
	FIN SI
FIN
 */
package es.studium.ejercicio7;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		int numero1, numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Dame otro numero:");
		numero2 = Integer.parseInt(teclado.nextLine());
		
		teclado.close();
		
		
		if(numero1==numero2)
		{
			System.out.println("Los numeros son iguales");
		}
		
		else
		{
			if(numero1>numero2)
			{
				System.out.println("El primer numero es mayor que el segundo.");		
			}
		    else
		    {
		    	System.out.println("El segundo numero es mayor que el primero.");		
		    }
		}
	
}
}