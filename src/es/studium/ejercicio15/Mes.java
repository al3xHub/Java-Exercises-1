package es.studium.ejercicio15;

import java.util.Scanner;

public class Mes
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Dame el numero de mes buscado");
		num = teclado.nextInt();
		
		
		teclado.close();
		
		switch (num)
		{
		case 1:
			System.out.println("El mes equivalente al número " +num+ " es ENERO");
			break;
		case 2:
			System.out.println("El mes equivalente al número " +num+ " es FEBRERO");
			break;
		case 3:
			System.out.println("El mes equivalente al número " +num+ " es MARZO");
			break;
		case 4:
			System.out.println("El mes equivalente al número " +num+ " es ABRIL");
			break;
		case 5:
			System.out.println("El mes equivalente al número " +num+ " es MAYO");
			break;
		case 6:
			System.out.println("El mes equivalente al número " +num+ " es JUNIO");
			break;
		case 7:
			System.out.println("El mes equivalente al número " +num+ " es JULIO");
			break;
		case 8:
			System.out.println("El mes equivalente al número " +num+ " es AGOSTO");
			break;
		case 9:
			System.out.println("El mes equivalente al numero " +num+ " es SEPTIEMBRE");
			break;
		case 10:
			System.out.println("El mes equivalente al numero " +num+ " es OCTUBRE");
			break;
		case 11:
			System.out.println("El mes equivalente al numero " +num+ " es NOVIEMBRE");
			break;
		case 12:
			System.out.println("El mes equivalente al numero " +num+ " es DICIEMBRE");
			break;
			
		default:
			System.out.println("El número indicado no corresponde a ningún mes del año.");
			
			
			
		
		}
		
		   
		   
		   
		   
	}

}
