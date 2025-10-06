package ejercicios2;

import java.util.Scanner;

public class Ejercicio2_3 {

	public static void main(String[] args) {
		
		/*BEGIN
		PROMPT for value in pounds
		ENTER value in pounds
		SET value to old value ÷ 2.2
		DISPLAY value in kilos
		END
		*/

		Scanner calculo = new Scanner (System.in);{
		
		//Variables
		double lb;
		double conversor;
		
		System.out.println("Calcular de gr a Kg");	
			
		//PROMPT for value in pounds
		System.out.println("Ingrese la cantidad que desea calcular en lbs?");
		//ENTER value in pounds
		lb = calculo.nextDouble();
		//SET value to old value ÷ 2.2
		conversor = (lb/2.2);
		//DISPLAY value in kilos
		System.out.println("La cantidad en " + conversor + " kg");
		
		calculo.close();	
		}

	}

}
