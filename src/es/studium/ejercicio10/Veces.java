package es.studium.ejercicio10;

import java.util.Scanner;

public class Veces
{

	public static void main(String[] args)
	{
		int numero, veces, i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indicar un numero:");
		veces = teclado.nextInt();
		
		System.out.println("Indicar otro numero");
		numero = teclado.nextInt();
		
		teclado.close();
		
		for(i=1; i<= veces; i++)
		{
			System.out.println(numero);
		}
		
		
	}

}
