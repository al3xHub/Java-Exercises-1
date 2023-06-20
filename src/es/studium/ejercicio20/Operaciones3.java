package es.studium.ejercicio20;

import java.util.Scanner;

public class Operaciones3
{

	public static void main(String[] args)
	{
		int numero1, numero2, numero3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		
		System.out.println("Otro más bitch:");
		numero3 = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("La suma de los 3 números son: " +suma(numero1, numero2, numero3));
		System.out.println("La resta de los 3 números son: " +resta(numero1, numero2, numero3));
		System.out.println("La multiplicación de los 3 números es: " +producto(numero1, numero2, numero3));
		System.out.println("La media de los 3 números es igual a: " +media(numero1, numero2, numero3));
		
		
		
	}

	private static float media(int a, int b, int c)
	{
		
		return ((float)a+(float)b+(float)c)/3;
	}

	private static int producto(int a, int b, int c)
	{
		
		return  a*b*c;
	}

	private static int resta(int a, int b, int c)
	{
		
		return a-b-c;
	}

	private static int suma(int a, int b, int c)
	{
		
		return a+b+c;
	}

}
