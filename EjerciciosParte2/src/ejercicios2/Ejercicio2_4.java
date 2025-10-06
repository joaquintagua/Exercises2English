package ejercicios2;

import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		
		//La fórmula es: IMC = Peso (kg) / [Estatura (m)]²//
		
		Scanner bascula = new Scanner (System.in);{
		
		//Variables
		double altura;
		double peso;
		double imc;
		
		System.out.println("Indique su peso...");
		peso = bascula.nextDouble();
		
		System.out.println("Indique su estatura...");
		altura = bascula.nextDouble();
		
		imc = (peso / (altura * altura));
		
		System.out.println("Calculando su IMC...");
		System.out.println("Su IMC basado en su peso y estatura es " + imc);
		
		bascula.close();
		}

	}

}
