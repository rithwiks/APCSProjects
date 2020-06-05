/**
*This program gets a number from the user then prints that number of asteriks, then one less, then so on until only one asterik is printed.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit4Lab2
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user
                Scanner input = new Scanner(System.in);

                System.out.println("Please type an integer for the number of asteriks you want.");

                //gets amount of asteriks from user
                int asterik_num = input.nextInt();
		
		//nested loop to print the asteriks in correct format
		for (int n = asterik_num; n > 0; n--) {
			
			for (int i = n; i > 0; i--) {	 
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
