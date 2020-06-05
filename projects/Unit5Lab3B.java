/**
* This program uses 4 methods to find the max, min, average, and letter grade of scores.
* @author Rithwik Seth
*/
import java.util.Scanner;
import java.lang.Math;

public class Unit5Lab3B
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user and initializes variables
                Scanner input = new Scanner(System.in);
		float a = 0;
		float b = 0;
		float c = 0;
		float d = 0;
		double average = 0;
		//loops through methods for each student
		for ( int i = 0; i < 3; i++ )
		{
			System.out.println("Type four test scores for a student");
			a = input.nextFloat();
			b = input.nextFloat();
			c = input.nextFloat();
			d = input.nextFloat(); 
			minimum( a, b, c, d );
			maximum( a, b, c, d );
			average = average( a, b, c, d );
			grade( average );
		}
	}

	/**
	* This method finds the smallest test score entered.
	* @params a, b, c, and d are different test scores.
	* precondition: a, b, c, and d are floats
	* postcondition: the smallest value is displayed.
	* @author Rithwik Seth
	*/
	public static void minimum( float a, float b, float c, float d)
	{
		//uses Math.min to find the min and displays it
		float x = Math.min( a, b );
		x = Math.min( x, c );
		x = Math.min( x, d );
		System.out.println("The minimum score is " + x);
	}
	
	
	/**
        * This method finds the largest test score entered.
        * @params a, b, c, and d are different test scores.
        * precondition: a, b, c, and d are floats
        * postcondition: the largest value is displayed.
        * @author Rithwik Seth
        */
	public static void maximum( float a, float b, float c, float d)
        {
		//uses Math.max to find the max and displays it
                float x = Math.max( a, b );
                x = Math.max( x, c );
                x = Math.max( x, d );
                System.out.println("The maximum score is " + x);
        }
	
	/**
        * This method finds the average of the test score entered.
        * @params a, b, c, and d are different test scores.
	* @return the mean
        * precondition: a, b, c, and d are floats
        * postcondition: the mean is displayed.
        * @author Rithwik Seth
        */
	public static double average( float a, float b, float c, float d)
	{
		//finds mean and rounds to tenths, then returns
		double x = (a + b + c + d) / 4;
		x = Math.floor( x * 10 + .5 ) / 10;
		return x;
	}
	
	/**
        * This method finds the letter grade of the average entered.
        * @param x is the average previously entered.
        * precondition: x is a double
        * postcondition: the letter grade is displayed.
        * @author Rithwik Seth
        */
	public static void grade( double x )
	{
		//displays mean, rounds it to an intger value, then uses if to find the letter grade and displays that.
		System.out.println("The average score is " + x);
                int y = (int) Math.floor( x * 1 + .5 ) / 1;
		if (( 90 <= y ) & ( y <= 100 )) 
			System.out.println("The letter grade is an A");
		else if (( 80 <= y ) & ( y <= 89 )) 
                        System.out.println("The letter grade is an B");
		else if (( 70 <= y ) & ( y <= 79 )) 
                        System.out.println("The letter grade is an C");
		else if (( 65 <= y ) & ( y <= 69 )) 
                        System.out.println("The letter grade is an D");
		else
			System.out.println("The letter grade is an F");
	}
}
