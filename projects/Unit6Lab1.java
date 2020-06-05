/**
* This program gets a number of integers from the user and says how many of each number appears.
* @author Rithwik Seth
*/
import java.util.Scanner;

public class Unit6Lab1
{
        public static void main(String [] args)
        {
		//creates Scanner, prompts user, and gets input
                Scanner input = new Scanner(System.in);
                System.out.println("Please type the number of integers you want to enter");
		int size = input.nextInt();
		//intializes new variable and array
		int new_int = 0;
		int a[] = new int[51];
		//prompts user and loops to get input and counts number of each integer
		System.out.println("Please enter " + size + " intger(s) divided by an enter that are in the range 1-50");
		for ( int i = 0; i < size; i++ ) 
		{
			new_int = input.nextInt();
			a[new_int]++;
			
		}
		//loops to display the number of each integer that was inputted
		for ( int n = 0; n < a.length; n++ )
		{
			if ( a[n] != 0 )
				System.out.println(n + " occurs " + a[n] + (a[n] != 1 ? " times" : " time"));
		}
	}
}

