package es.studium.ejercicio21;

import java.util.Scanner;

public class TiposDeTriangulos
{

	public static void main(String[] args)
	{
		float lado1, lado2, lado3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame la longitud del lado 1: ");
		lado1 = teclado.nextFloat();

		System.out.println("Dame la longitud del lado 2: ");
		lado2 = teclado.nextFloat();

		System.out.println("Dame la longitud del lado 3: ");
		lado3 = teclado.nextFloat();
		
		teclado.close();
		
		if((lado1 == lado2 && lado2 != lado3) || (lado1 != lado2 && lado2 == lado3) || (lado1 == lado3 && lado2 != lado3))
		{
		System.out.println("El triángulo formado es Isósceles");	
		}
		else
		{
			if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3)
			{
				System.out.println("El triángulo formado es Escaleno");
			}
			else
			{
				System.out.println("Lo siento pero...El triángulo es amorfo");
			}
			
		
		}
		
	}

}
