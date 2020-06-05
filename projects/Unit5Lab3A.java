/**
* This program finds the max and min values given three integers.
* @author Rithwik Seth
*/
import java.util.Scanner;
import java.lang.Math;

public class Unit5Lab3A
{
        public static void main(String [] args)
        {
		//creates Scanner and prompts user and gets input from user
                Scanner input = new Scanner(System.in);
                System.out.println("Please type 9 double numbers, spereated by an enter.");
		double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                double d = input.nextDouble();
                double e = input.nextDouble();
                double f = input.nextDouble();
                double g = input.nextDouble();
                double h = input.nextDouble();
                double i = input.nextDouble();
		//uses methods and displays output
		System.out.println("The minimum of the first three are " + minimum(a, b, c) + " and the maximum is " + maximum(a, b, c));
                System.out.println("The minimum of the second three are " + minimum(d, e, f) + " and the maximum is " + maximum(d, e, f));
                System.out.println("The minimum of the third three are " + minimum(g, h, i) + " and the maximum is " + maximum(g, h, i));


	}
	
	/**
        * This method finds the smallest number entered.
        * @params a, b, and c are different numbers.
	* @returns minimum values
        * precondition: a, b, and c are doubles
        * postcondition: the smallest value is returned.
        * @author Rithwik Seth
        */
	public static double minimum(double a, double b, double c) 
	{	
		//uses Math.min to find smallest and returns it
		double x = Math.min( a, b );
		x = Math.min( x, c );
		return x;
	}
	
	 /**
        * This method finds the largest number entered.
        * @params a, b, and c are different numbers.
        * @returns minimum values
        * precondition: a, b, and c are doubles
        * postcondition: the largest value is returned.
        * @author Rithwik Seth
        */
        public static double maximum(double a, double b, double c) 
        {
		//uses Math.max to find the largest value and returns it
                double x = Math.max( a, b );
                x = Math.max( x, c );
                return x;
        }
}
