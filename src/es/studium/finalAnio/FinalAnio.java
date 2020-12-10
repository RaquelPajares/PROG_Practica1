package es.studium.finalAnio;

import java.util.Scanner;

/*Realizar un programa que lea una fecha y calcule el número de días que quedan hasta
 * fin de año. 
 */

/*
  	PROGRAMA FinalAnio
  	VARIABLES
  		ENTERO anio, mes, dia, contador_dias
  	INICIO
  		ESCRIBIR "Indique el DIA: "
  		LEER dia
  		ESCRIBIR "Indique el MES: "
  		LEER mes
  		ESCRIBIR "Indique el AÑO: "
  		LEER anio
  		
  		PARA i=mes-1 HASTA i>12 HACER
 			SEGÚN i HACER
				1: 
					contador_dias = contador_dias + 31
				2:
					SI anio mod 4 = 0 ENTONCES
						contador_dias = contador_dias + 29
					SINO
						contador_dias = contador_dias + 28
					FIN SI 
				3: 
					contador_dias = contador_dias + 31
				4:
		    		contador_dias = contador_dias + 30
		        5:
			    	contador_dias = contador_dias + 31  
			    6:
			    	contador_dias = contador_dias + 30			  
			   	7:
			    	contador_dias = contador_dias + 31
			    8:
			    	contador_dias = contador_dias + 31
			  	9:
			    	contador_dias = contador_dias + 30
			 	10:
			    	contador_dias = contador_dias + 31
				11:
			    	contador_dias = contador_dias + 30
			   	12:
			    	contador_dias = contador_dias + 31
			 FIN SEGUN
		FIN PARA
		
		contador_dias = contador_dias - dia;
		System.out.println("¡Quedan " + dias + " para Fin de Año!");
	FIN
*/ 

public class FinalAnio
{

	public static void main(String[] args)
	{
		int anio, mes, dia;

		Scanner teclado = new Scanner(System.in);

		//Pedir DIA
		System.out.println("Indique el DIA: ");
		dia = teclado.nextInt(); 
		
		//Pedir MES
		System.out.println("Indique el MES: ");
		mes = teclado.nextInt(); 
		
		//Pedir AÑO
		System.out.println("Indique el AÑO: ");
		anio = teclado.nextInt(); 
		
		teclado.close();
		
		int contador_dias = 0; 
		
		//Calcular días que faltan para fin de año
		for(int i=mes;i<=12;i++)
		{
			switch(i)
			{
			case 1:
				contador_dias = contador_dias + 31;
				break;
			case 2:
				if(anio % 4 == 0)
				{
					contador_dias = contador_dias + 29;
				}
				else
				{
					contador_dias = contador_dias + 28;
				}
				break;
			case 3:
				contador_dias = contador_dias + 31;
				break;
		    case 4:
		    	contador_dias = contador_dias + 30;
		        break;
		    case 5:
		    	contador_dias = contador_dias + 31;
		        break;
		    case 6:
		    	contador_dias = contador_dias + 30;
		        break;
		    case 7:
		    	contador_dias = contador_dias + 31;
		        break;
		    case 8:
		    	contador_dias = contador_dias + 31;
		        break;
		    case 9:
		    	contador_dias = contador_dias + 30;
		        break;
		    case 10:
		    	contador_dias = contador_dias + 31;
		        break;
		    case 11:
		    	contador_dias = contador_dias + 30;
		        break;
		    case 12:
		    	contador_dias = contador_dias + 31;
		        break;
			}
		}
		
		//Muestra resultado
		contador_dias = contador_dias - dia;
		System.out.println("¡Quedan " + contador_dias + " para Fin de Año!");
		
	}

}
