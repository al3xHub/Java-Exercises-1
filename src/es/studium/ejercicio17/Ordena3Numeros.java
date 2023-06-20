package es.studium.ejercicio17;

import java.util.Scanner;

public class Ordena3Numeros
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Dame un primer número:");
		a = teclado.nextInt();
		
		System.out.println("Dame un segundo número:");
		b = teclado.nextInt();
		
		System.out.println("Dame un tercer número:");
		c = teclado.nextInt();
		
		teclado.close();
		
		if(a>=b && b>= c)
		{
			System.out.println("Los números ordenados de mayor a menor son: " +a+ " " +b+ " " +c);		
		}
		
		if((a>=c) && (c>=b))
		{
			System.out.println("Los números ordenados de mayor a menor son: " +a+ " " +c+ " " +b);		
		}
		
		if((b>=c) && (c>=a))
		{
			System.out.println("Los números ordenados de mayor a menor son: " +b+ " " +c+ " " +a);		
		}
		
		if((b>=a) && (a>=c))
		{
			System.out.println("Los números ordenados de mayor a menor son: " +b+ " " +a+ " " +c);		
		}
		
		if((c>=a) && (a>=b))
		{
			System.out.println("Los números ordenados de mayor a menor son: " +c+ " " +a+ " " +b);		
		}
		
		if((c>=b) && (b>=a))
		{
			System.out.println("Los números ordenados de mayor a menor son: " +c+ " " +b+ " " +a);		
		}
			
		
	}

}
