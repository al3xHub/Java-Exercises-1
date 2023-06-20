package es.studium.ejercicio19;

import java.util.Scanner;

public class Operaciones2
{

	public static void main(String[] args)
	{
		int numero1, numero2, suma, resta, producto;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		producto = numero1 * numero2;
		
		System.out.println("La suma de los números es: " +suma);
		System.out.println("La resta de los números es: " +resta);
		System.out.println("La multiplicación de los números es:" + producto);
		
		if (numero2 != 0)
		{
			System.out.println("El número 1 dividido por el número 2 es: " +cociente(numero1,  numero2));
		}
		
		else
		{
			System.out.println("La división no es posible. El número 2 no puede tener valor 0.");
		}
	}

	private static float cociente(int a, int b)
	{
		
		return (float)a/(float)b;
	}

}
