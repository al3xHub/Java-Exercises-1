package es.studium.ejercicio13;

import java.util.Scanner;

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		int numero1, resultado, i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		
		teclado.close();
		
		for (i= 0; i<=10; i++)
		{
			resultado= numero1 * i;
			System.out.println(numero1+ "*" +i+ "=" + resultado);
		}
		
		
		
		
		
	}

}
