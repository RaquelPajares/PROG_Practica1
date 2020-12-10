package es.studium.adivina;

import java.util.Scanner;
import java.util.Random;

/*Realizar un programa en el que el ordenador piense una cadena de 5 posibles. 
 * Luego, el usuario introduce una cadena por teclado y se indicará si ha
 * acertado o no. No hay que repetir hasta que acierte. El programa solamente pide
 * una cadena una vez. 
 */

public class Adivina
{

	public static void main(String[] args)
	{
		//Crear tabla
		final int TAM = 5; 
		String cadenas[] = new String[TAM];
		String frase;
		int i; 
		
		Scanner teclado = new Scanner(System.in); 
		
		//Leer cadenas
		for(i=0;i<TAM;i++)
		{
			System.out.println("Dame la cadena [" + i + "]: ");
			cadenas[i] = teclado.nextLine();
		}
		
		//Abrir el objeto Random para que saque un num aleatorio entre 0 y 4
		Random r = new Random();
		int aleatorio = r.nextInt(TAM);
		
		//Jugar
		System.out.println("Intente adivinar en qué cadena de las indicadas piensa el ordenador: ");
		frase = teclado.nextLine(); 
		teclado.close();

		//Comparación de la cadena introducida con la aleatoria elegida por el PC
		if(frase.equals(cadenas[aleatorio]))
		{
			System.out.println("¡Has ACERTADO! La frase era '" + cadenas[aleatorio] + "'.");
		}
		else
		{
			System.out.println("¡Has FALLADO! La frase era '" + cadenas[aleatorio] + "'.");
		}
		

	}

}
