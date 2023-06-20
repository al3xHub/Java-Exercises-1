package es.studium.ejercicio14;

import java.util.Scanner;

public class Potencia2
{

	public static void main(String[] args)
	{
		int base, exp, resultado;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Escribe la base:");
		base = teclado.nextInt();
		
		System.out.println("Escribe el exponente:");
		exp = teclado.nextInt();
		
		teclado.close();
		
		resultado= pot(base,exp);
		
		System.out.println("El numero " +base+ " elevado a " +exp+ " es igual a " +resultado);
		
		
		
	}

	private static int pot(int base, int exp)
	{
		int i, resultado = 1;
		for(i=1; i<= exp;i++)
		{
			resultado= resultado * base;
		}
		
		return (resultado);
	}

}
