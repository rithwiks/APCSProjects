/**
* This program lets users play a guessing game where they have to guess an intger from a range they decided. They are told whether their guesses are too high or low.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit4Lab1
{
        public static void main(String [] args)
        {
		//initializes char variable for user input
		char again;
		do {
		
                	//creates Scanner and prompts user
                	Scanner input = new Scanner(System.in);

                	System.out.println("Please type an integer for the maximum of the range of random numbers");
			int n = input.nextInt();
			
			//selects random number and initializes guessing variable
			int randomNumber = (int) ( n * Math.random() ) + 1;
			int guess;
			
			//loops through guessing game
			do {
				System.out.println("Please type an integer for your guess");
				guess = input.nextInt();
				if ( guess == randomNumber ) {
					System.out.println("That is correct");
					break;
				}
				else if ( guess > randomNumber ) {
					System.out.println("That is too high");
				}
				else {
					System.out.println("That is too low");
				}
			} while (guess != randomNumber);
			
			//asks the user whether or not they want to play again
			System.out.println("Please type y or n if you want to play again");
			
			again = input.next().charAt(0);
			
		} while (again == 'y');
	}
}

