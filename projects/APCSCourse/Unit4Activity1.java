/**
* This program asks the user a number of multiplication questions (number based on user's preference), grades the questions, and times the user.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit4Activity1
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user
                Scanner input = new Scanner(System.in);

                System.out.println("Please type an integer for the number of questions you want.");

                //gets amount of questions from user
                int a = (input.nextInt());

		//initializes variable for score
		int score = 0;
		
		//starts timer
		final long startTime = System.currentTimeMillis();
		
		//loops to give each question
		for (int i = 0; i < a; i++) {
			//generates two random numbers
			int number1 = (int) ( Math.random() * 10 );
			int number2 = (int) ( Math.random() * 10 );
			
			//ask user for input
			System.out.println("What is " + number1 + " * " + number2);
			int answer = input.nextInt();
			
			if ( (number1 * number2) == answer ) {
				System.out.println("That is correct");
				score++;
			}
			else {
				System.out.println("That is incorrect. The correct answer is " + (number1*number2));
			}
		}
		
		//ends timer
		final long endTime = System.currentTimeMillis();

		float fin_score = ((float) score/a) * 100;
		System.out.println("Your score is " + fin_score + "%");
		System.out.println("Your execution time was " + (endTime - startTime) + " milliseconds");
	}
}
