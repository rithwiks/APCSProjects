/**
* This program gets 10 integers from the user and determines the largest and the smallest using a do while loop.
* @author Rithwik Seth
*/
import java.util.Scanner;

public class Unit4Lab3C
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user
                Scanner input = new Scanner(System.in);
                System.out.println("Please type an integer and press enter");
                //initializes variables and gets first int
		int number = input.nextInt();
                int counter = 0;
                int largest = number;
                int smallest = number;
                //loops to get rest of the ints
		do {
                        System.out.println("Please type an integer and press enter");
                        number = input.nextInt();
                        if (number > largest) {
                                largest = number;
                        }
                        if (number < smallest) {
                                smallest = number;
                        }
                        counter++;
                } while (counter < 9);
		//displays smallest and largest values
                System.out.println("The smallest value is " + smallest + " and the largest value is " + largest);
        }
}

