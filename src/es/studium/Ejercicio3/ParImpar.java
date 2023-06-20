/*
 * PROGRAMA ParImpar
 * 
	VARIABLES
	
	ENTERO numero
	
INICIO
	ESCRIBIR “Dame un número:”
	
	LEER numero
	
	SI numero%2=0 ENTONCES
	
	ESCRIBIR “El número es par”
	
	SI NO
	
	ESCRIBIR “El número es impar”
	
	FIN SI
FIN 
 */

package es.studium.Ejercicio3;

import java.util.Scanner;

public class ParImpar
{

	public static void main(String[] args)
	{
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		
		numero = teclado.nextInt();
		
		teclado.close();
		
		if(numero%2==0)
		
		{
			
		System.out.println("El numero es PAR");
		}
		
		else
		{
		System.out.println("El numero es IMPAR");	
		
		}
		
	}

}
