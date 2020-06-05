/**
* This program gets random numbers from a set and counts how many of each appear.
* @author Rithwik Seth
*/

import java.util.Random;

public class Unit5Activity1Q4
{
        public static void main(String [] args)
        {
		//initializes variables
		int[] numbers = new int[] {6, 10, 14, 18, 22};
		Random r = new Random(10000);
		int x = 0;
		int num_of_six = 0;
		int num_of_ten = 0;
		int num_of_fourteen = 0;
		int num_of_eighteen = 0;
		int num_of_twentytwo = 0;
		//loops through random numbers and adds to each variable when the number appears 
		for (int i = 0; i < 100; i++) {
			x = r.nextInt(numbers.length);
			x = numbers[x];
			switch ( x ) {
				case 6:
					num_of_six++;
					break;
				case 10:
                                        num_of_ten++;
                                        break;
				case 14:
                                        num_of_fourteen++;
                                        break;
				case 18:
                                        num_of_eighteen++;
                                        break;
				case 22:
                                        num_of_twentytwo++;
                                        break;
			}
		}
		//prints each variable out
		System.out.println("6: " + num_of_six);
                System.out.println("10: " + num_of_ten);
                System.out.println("14: " + num_of_fourteen);
                System.out.println("18: " + num_of_eighteen);
                System.out.println("22: " + num_of_twentytwo);
	}
}
