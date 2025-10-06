package ejercicios2;

import java.util.Scanner;

public class Ejercicios2 {

	public static void main(String[] args) {
	
	/*
	 BEGIN
	 	DISPLAY program title
	 	DISPLAY prompt for price
	 	ENTER price
	 	DYSPLAY prompt for tax
	 	ENTER tax
	 	SET price TO price * (1 + tax/100)
	 	DYSPLAY new price
	 	END
	 */
	
	//Variables
	double price;
	double tax;
	double newPrice;
		
	Scanner reader = new Scanner (System.in);
	//DYSPLAY program title
	System.out.println("Program Title");
	//DYSPLAY prompt for price
	System.out.println("price");
	//ENTER price
	System.out.println("Enter price");
	price = reader.nextDouble();
	//DYSPLAY prompt for tax
	System.out.println("tax");
	//ENTER tax
	System.out.println("Enter tax");
	tax = reader.nextDouble();
	//SET price TO price * (1 + tax/100)
	newPrice = (price + price) + tax/100;
	//DYSPLAY new price
	System.out.println("new price");
	System.out.println((int)newPrice);
	
	reader.close();
		
	}

}
