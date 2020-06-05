/**
* This program asks the user for three integers and states whether or not they form a triangle and which triangle is formed.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit4Lab3A
{
        public static void main(String [] args)
        {
		//creates Scanner and prompts user
                Scanner input = new Scanner(System.in);
		System.out.println("Please type an integer and press enter");
		int num1 = input.nextInt();
		int counter = 1;
		int smallest = num1;
		int largest = num1;
		int number = num1; 
		while (counter < 10) {
		
                	System.out.println("Please type an integer and press enter );
			number = input.nextInt();
			if (number > largest) {
				largest = next_num;
			}
			if (number < smallest) {
				smallest = next_num;
			}
			counter++;
		}
		System.out.println("The smallest value is " + smallest + " and the largest value is " + largest);
	}
}
			
