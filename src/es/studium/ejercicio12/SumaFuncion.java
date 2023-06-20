package es.studium.ejercicio12;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro numero:");
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("La suma de los dos numeros es: " +suma(numero1,numero2));
	}

	private static int suma(int a, int b)
	{
		
		return a+b;
	}

}
