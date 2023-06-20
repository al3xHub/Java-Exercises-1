package es.studium.ejercicio8;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
	int base, exp, resultado, i;
	Scanner teclado = new Scanner(System.in);
	
	resultado=1;
	
	System.out.println("Dame un numero para la base:");
	base = teclado.nextInt();
	
	System.out.println("Dame un numero para el exponente:");
	exp = teclado.nextInt();
	
	teclado.close();
	
	for(i=1; i<= exp; i++)
	{
		resultado = resultado * base;
	}
	System.out.println("El numero " +base+ " elevado a " +exp+ " es " +resultado);
	}
}
