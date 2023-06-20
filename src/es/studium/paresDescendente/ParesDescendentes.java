package es.studium.paresDescendente;

public class ParesDescendentes
{

	public static void main(String[] args)
	{
		int pares[] = new int[20];
		
		for(int i=0; i<pares.length; i++)
		{
			pares[i] = i*2;
		}
		
		for(int i=pares.length-1; i>=0; i--)
		{
			System.out.println(pares[i]);
		}
		
	}

}
