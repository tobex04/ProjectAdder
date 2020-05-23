package com.test;

// Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Scanner;


public class Adder{

	private static final Logger logger = LogManager.getLogger(Adder.class);


	public static void main(String [] args){

		int firstnumber,secondnumber;
		String choice;
		char key;

		System.out.println("Welcome to Adder Program \n");
		
		
		Scanner inputs = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter the 1st Number = ");
			firstnumber = inputs.nextInt();
			System.out.print("\n");

			System.out.print("Enter the 2nd Number = ");
			secondnumber = inputs.nextInt();

			addition(firstnumber,secondnumber);

			System.out.print(" Do you want to continue adding     (y|n)  ");
			choice = input.nextLine();
			key = choice.charAt(0);
		}

		while(key == 'y');

		inputs.close();
		input.close();
	}
static void addition(int x, int y){
	
	int result = 0;
	result = x+y;

	System.out.println("\r\n" + x + "+" + y + " = " +result +"\r\n");
	
	logger.info("Performed addition of " + x + " and " + y + ". Result = " +
	result + ".");
	
	}
}