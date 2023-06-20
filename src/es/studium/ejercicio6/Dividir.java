package es.studium.ejercicio6;

import java.util.Scanner;

public class Dividir
{

	public static void main(String[] args)
	{
		int numerador, denominador;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribir el numerador");
		numerador = teclado.nextInt();
		
		System.out.println("Escribir el denominador");
		denominador = teclado.nextInt();
		
		teclado.close();
		
		resultado= dividir(numerador, denominador);
		
		System.out.println(resultado);
		
	}

	private static double dividir(int a, int b)
	{
		double r;
		r= (double) a/ (double) b;  //Casting: disfrazo a y b que son numeros enteros en numeros reales.
		return r;
	}

}
