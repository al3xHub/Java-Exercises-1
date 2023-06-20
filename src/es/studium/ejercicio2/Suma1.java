package es.studium.ejercicio2;

import java.util.Scanner;

public class Suma1
{

	public static void main(String[] args)
	{
		int numero1, numero2, suma;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		numero1 = teclado.nextInt();
		
		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();
		
		suma = numero1 + numero2;
		
		teclado.close();
		
		System.out.println("La suma es " +suma);
	}

}
