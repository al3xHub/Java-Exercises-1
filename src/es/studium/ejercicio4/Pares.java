package es.studium.ejercicio4;

import java.util.Scanner;

public class Pares
{

	public static void main(String[] args)
	{
		int numero1, numero2, i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		for(i = numero1; i <= numero2; i++) //i+=   i = i + 1
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
