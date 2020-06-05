import static java.lang.Math.*;
import java.text.DecimalFormat;
public class Assignment7_part2
{
        public static void main(String[] args)
        {
		// the first line describes the program
		System.out.println("This program calculates the monthly payment of a loan specified by you");
		// the next three lines get the user input and declare three variables
		float L = Input.getFloat( "Enter the amount of loan" );
		float i = Input.getFloat( "Enter the interest rate as an integer" );
		int N = Input.getInt( "Enter the number of years" );
		// this line calls the method monthlyPayment
		monthlyPayment( L, i, N);
	}
	public static void monthlyPayment( float L, float i, int N )
	{
		// the first line turns i from a percentage to decimal
		i /= 100;
		// the next two lines declare and set values for r and n
		double r = i / 12;
		int n = 12 * N;
		// the next line calculates P
		double P = (r * L) / (1 - (pow((1 + r), -n)));
		// The final two lines set P to two decimals amd prints it out
		DecimalFormat df1 = new DecimalFormat("####.##");
		System.out.println( "The monthly payment for the loan is " + df1.format(P));
	}
}
