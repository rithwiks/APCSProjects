/**
* This program asks the user for an amount of money and states the amount of each monetary value that is required to make the amount of money.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit2Lab2
{
	public static void main(String [] args)
	{
		//creates Scanner and prompts user
		Scanner input_getter = new Scanner(System.in);
		
		System.out.println("Please type a value of money in dollars and cent like 1.23");
		
		//gets input from user
		double input = ( input_getter.nextDouble())*100;
		
		//finds number of each monetary value and remainder
		int dollars = (int) (input / 100);
		int remain = (int) (input % 100);
		
		int quarters = (remain / 25);
		remain = remain % 25;
		
		int dimes = remain / 10;
		remain = remain % 10;
		
		int nickels = remain / 5;
		remain = remain % 5;
		
		int pennies = remain;
		
		//prints out value and number for each monetary value
		System.out.println("$" + (input/100) + " consists of " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
	}
}
