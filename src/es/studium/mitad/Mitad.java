package es.studium.mitad;

import java.util.Scanner;

/*Realizar un programa que, mediante una función, calcule la mitad de un número entero
 * dado por teclado. 
 */

/*
PROGRAMA Mitad
VARIABLES 
	ENTERO num, resultado
INICIO
	ESCRIBIR "Indique un numero entero para conocer su mitad: "
	LEER num
	resultado=mitad(num)
	ESCRIBIR resultado
FIN
FUNCION mitad (ENTERO num) DEVUELVE ENTERO
VARIABLES
	ENTERO num
INICIO
	mitad=num/2
	DEVOLVER mitad
FIN
*/


public class Mitad
{

	public static void main(String[] args)
	{
		//VARIABLES
		int num;
		float resultado;
		
		//Abrir teclado
		Scanner teclado = new Scanner(System.in);
		
		//Pedir número

		System.out.println("Indique un numero entero para conocer su mitad: ");

		//Leer num
		num = teclado.nextInt();

		
		//Cierre teclado
		teclado.close();
		
		//LLAMADA a la función
		resultado = mitad(num);
				
		//ESCRIBIR resultado
		System.out.println(num + " / 2 = " + resultado);
		
	}

public static float mitad(int a) 
{
	return((float)a/2);
}

}

