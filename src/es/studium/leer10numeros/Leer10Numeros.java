package es.studium.leer10numeros;

import java.util.Scanner;

/*Leer 10 n�meros enteros por teclado, calcular su media mediante una funci�n 
 * y mostrar todos los n�meros en orden inverso al que se introdujeron.*/


public class Leer10Numeros
{

	public static void main(String[] args)
	{
		//Tama�o de la tabla
		final int TAM = 10;
		
		int i;
		float resultado; 
		int tabla[] = new int[TAM];
		
		//Esc�ner
		Scanner teclado = new Scanner(System.in);
		
		//Rellenar la tabla
		for(i=0;i<TAM;i++)
		{ 
			System.out.println("Rellena la tabla " + i);
			tabla[i] = teclado.nextInt();
		}
		
		teclado.close();
		
		//Para mostrar los n�meros en orden inverso:
		for(i=0;i<TAM;i++)
		{
			System.out.println("Los n�meros introducidos en orden inverso: ");
			System.out.println(tabla[TAM-i-1]);			
		}
		
		//LLAMADA a la funci�n media
		resultado = media(tabla);
		System.out.println("La media de los n�meros introducidos es: " + resultado);
		
	}
	
	public static float media(int tabla[]) 
	{
		float media = 0; 
		
		for(int i=0;i<10;i++)
		{
			media = media + tabla[i];
		}
		
		media = media / 10;
		
		return(media);
	}

}

