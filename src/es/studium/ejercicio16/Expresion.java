package es.studium.ejercicio16;

import java.util.Scanner;

public class Expresion
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		
		
		System.out.println("Dame un número equivalente a la letra a: ");
		a = teclado.nextInt();
		
		System.out.println("Dame un número equivalente a la letra b: ");
		b = teclado.nextInt();
		
		System.out.println("Dame un número equivalente a la letra c: ");
		c = teclado.nextInt();
		
		teclado.close();
		
		System.out.println("El resultado de aplicar la expresion a los números dados es: " +expresion (a, b, c));
		
	}

	private static float expresion(int a, int b, int c)
	{
		
		return ((((float)b*(float)b)-(4*(float)a*(float)c))/(2*(float)a));
	}

}
