/**
* This program gets input from the user and can find the future value of a single sum, present value, or a future value of an annuity.
* @author Rithwik Seth
*/
import java.util.Scanner;
import java.lang.Math;

public class Unit5Lab1
{
        public static void main(String [] args)
        {
                //creates Scanner, prompts user, and collects data
                Scanner input = new Scanner(System.in);
		System.out.println("Please type 1 if you want the future vale of a single sum to be calculated, 2 for the present value of a single sum, or 3 for the future value of an annuity");
		int x = input.nextInt();
		//determines which to do and does the calculations
		switch (x){
			case 1:
				System.out.println("Please type the value of money you want deposited, the interest rate as a decmial, and the amount of years. Press enter after each integer.");
				double p = input.nextDouble();
				double i1 = input.nextDouble();
				double n1 = input.nextDouble();
				futureSingleSum(p, n1, i1);
				break;
			case 2:
				System.out.println("Please type the value of money you want after compunding, the interest rate as a decmial, and the amount of years. Press enter after each integer.");
				double f = input.nextDouble();
                                double i2 = input.nextDouble();
                                double n2 = input.nextDouble();
				presentSingleSum(f, n2, i2);
				break;
			case 3:
				System.out.println("Please type the value of money you want to deposit monthly, the interest rate as a decmial, and the amount of years. Press enter after each integer.");
				double a = input.nextDouble();
                                double i3 = input.nextDouble();
                                double n3 = input.nextDouble();
                                futureAnnuity(a, i3, n3);
				break;
		}
	}
	
	/**
        * This method calculates the value of a future single sum.
        * @params p, n, and i are used to calculate the value..
        * precondition: p, n, and i are double values, and p is a monetary value, i is a decmial, and n is amount of years
        * postcondition: the value is printed
        * @author Rithwik Seth
        */
	public static void futureSingleSum(double p, double n, double i)
	{
		//does the calculation, rounds the value, and prints it
		i = i/12;
		n = n * 12;
		double f = p * Math.pow((1 + i), n);
		f = Math.floor( f * 100 + .5) / 100;
		n = n/12;
		System.out.println("There would be " + f + " dollars after " + n + " years.");
	}
	
	/**
        * This method calculates the value of a present single sum.
        * @params f, n, and i are used to calculate the value.
        * precondition: f, n, and i are double values, and f is a monetary value, i is a decmial, an
d n is amount of years
        * postcondition: the value is printed
        * @author Rithwik Seth
        */
	public static void presentSingleSum(double f, double n, double i)
	{
		//does the calculation, rounds the value, and prints it
                i = i/12;
                n = n * 12;
		double p = f / Math.pow((1 + i), n);
		p = Math.floor( p * 100 + .5) / 100;
		n = n/12;
		System.out.println("You would need to deposit " + p + " dollars to have " + f + " dollars after " + n + " years.");
	}
	
	/**
        * This method calculates the value of an annuity.
        * @params a, n, and i are used to calculate the value..
        * precondition: a, n, and i are double values, and a is a monetary value, i is a decmial, an
d n is amount of years
        * postcondition: the value is printed
        * @author Rithwik Seth
        */
	public static void futureAnnuity(double a, double i, double n)
	{
		//does the calculation, rounds the value, and prints it
                i = i/12;
                n = n * 12;
		double f = a * ( (Math.pow((1 + i), n) - 1) / i);
		f = Math.floor( f * 100 + .5) / 100;
		n = n/12;
		System.out.println("There would be " + f + " dollars after " + n + " years.");
	}
}
