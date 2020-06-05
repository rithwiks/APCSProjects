/**
* This program gets input from the user, divides it and rounds it to an integer, and 1, 2, and 3 decimal points.
* @author Rithwik Seth
*/
import java.util.Scanner;
import java.lang.Math;

public class Unit5Activity1Q5
{
        public static void main(String [] args)
        {
                //creates Scanner, prompts user, and gets input
                Scanner input = new Scanner(System.in);
                System.out.println("Please type 2 integers");
		float x = input.nextFloat();
		float y = input.nextFloat();
		//divides, rounds, and displays
		Float division = x/y;
		System.out.println(Math.floor(division * 1 + .5) / 1);
		System.out.println(Math.floor(division * 10 + .5) / 10);
                System.out.println(Math.floor(division * 100 + .5) / 100);
                System.out.println(Math.floor(division * 1000 + .5) / 1000);

	}
}
