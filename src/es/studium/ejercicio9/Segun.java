package es.studium.ejercicio9;

import java.util.Scanner;

public class Segun
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num1, num2, resultado;
		
			
		System.out.println("Dame un numero:");
		num1 = teclado.nextInt();
		
		System.out.println("Dame otro numero");
		num2 = teclado.nextInt();
				
		teclado.close();
				
		if(num1<num2)
		{
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es " + resultado);
			
		}
		else
		{
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicacion es " + resultado);
		}
		
				
				
		
		
	}

}
