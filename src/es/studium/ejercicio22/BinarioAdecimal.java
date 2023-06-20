package es.studium.ejercicio22;

import java.util.Scanner;

public class BinarioAdecimal
{

	public static void main(String[] args)
	{
		int a, b, c, d, e, resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("indique el valor de la primera cifra binaria:");
		a = teclado.nextInt();
		
		System.out.println("indique el valor de la segunda cifra binaria:");
		b = teclado.nextInt();
		
		System.out.println("indique el valor de la tercera cifra binaria:");
		c = teclado.nextInt();
		
		System.out.println("indique el valor de la cuarta cifra binaria:");
		d = teclado.nextInt();
		
		System.out.println("indique el valor de la quinta cifra binaria:");
		e = teclado.nextInt();
		
		teclado.close();
		
		resultado = conversion(e,d,c,b,a);
		
		System.out.println("El número decimal equivalente es " +resultado);
		
	}

	private static int conversion(int e, int d, int c, int b, int a)
	{
		
		int r;
		
		r =((e*16)+(d*8)+(c*4)+(b*2)+(a*1));
		
		return r;
	}

}
