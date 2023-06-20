package es.studium.ejercicio18;

import java.util.Scanner;

public class Operaciones
{

	public static void main(String[] args)
	{
		int num1, num2, suma, resta, producto;
		float cociente;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número:");
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro número:");
		num2 = teclado.nextInt();
		
		teclado.close();
		
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		
		System.out.println("La suma de los números es: " +suma);
		System.out.println("La resta de los números es: " +resta);
		System.out.println("La multiplicación de los números es:" +producto);
		
		if (num2!=0)
		{
			cociente= (float)num1/(float)num2;
			System.out.println("El conciente del número 1 dividido por el número 2 es: " +cociente);
		}
		else
		{
			System.out.println("La división no es posible. El número 2 no puede tener valor 0");
		}
	}

}
