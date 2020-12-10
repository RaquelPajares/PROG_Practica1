package es.studium.cadenaMasCorta;

import java.util.Scanner;

/*Realizar un programa que meta 10 cadenas en una tabla y luego muestre la cadena m�s
 * corta. Usar una funci�n que devuelva la cadena m�s corta y que tenga como 
 * par�metro la tabla. 
 */

public class CadenaMasCorta
{

	public static void main(String[] args)
	{
		
		//Crear tabla
		final int TAM = 10; 
		String cadenas[] = new String[TAM];
		int i; 
		String frasemascorta;
		
		Scanner teclado = new Scanner(System.in); 
		
		//Leer cadenas
		for(i=0;i<TAM;i++)
		{
			System.out.println("Dame la cadena [" + i + "]: ");
			cadenas[i] = teclado.nextLine();
		}
		
		teclado.close();
				
		//LLAMADA a la funci�n
		frasemascorta = calculofrasecorta(cadenas);
		System.out.println("La frase m�s corta es: " + frasemascorta);
			
	}
	
public static String calculofrasecorta(String cadenas[]) 
{
	String frasemascorta = ""; 
	frasemascorta = cadenas[0];
	
	for(int i=0;i<9;i++)
	{
		if(frasemascorta.length()>cadenas[i].length())
		{
			frasemascorta = cadenas[i];
		}
	}
	
	return(frasemascorta);
}


}
