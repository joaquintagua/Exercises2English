package ejercicios2;

import java.util.Scanner;

public class Ejercicios2_2 {

	public static void main(String[] args) {
	
		//Variables
		double edad;
		double fecha;
		double cumpleaños;
		
		Scanner nacimiento = new Scanner (System.in);{
		
		System.out.print("¿Qué edad tienes?");
		edad = nacimiento.nextDouble();
		
		System.out.print("¿En que año estamos?");
		fecha = nacimiento.nextDouble();
		
		//Cálculo para determinar la fecha de nacimiento
		cumpleaños = (fecha-edad)-1;
		
		System.out.print("Naciste en el año " + (int)cumpleaños +"?");
		
		nacimiento.close();	
		}

	}

}
