public class CatchException6
{
	public static void main(String [] args)
	{
		//declares variables and creates a do while loop to provide users with multiple chances to input numbers. C is set to e if the user puts zero, making the loop occur as long as the user puts in 0
		char c;
		int i;
		do{
			//gets input from the users and passes the value to variable n
			int n = Input.getInt("Please enter a denominator to divide 10 by that isn't zero");
			//uses try block to see if DivideByZeroException is caught
			try
			{
				//uses divide method, sets value to i and, if everything is fine, sets c to a and prints the result
				i = divide(10, n);
				c = 'a';	
				System.out.println("The result was " + i);
			}
			catch (DivideByZeroException e)
			{
				//if exception is caught sets c to e and prints that it was a zero
				c = 'e';
				System.out.println("That was zero, the one number you can't use");
			}
		}while (c == 'e');
		
		System.out.println("Program completed");
	}
	
	public static int divide(int x, int y) throws DivideByZeroException
	{
		//initializes a variable called results
		int result = 0;
		//tries to divide x by y and if an arithmetic exception occurs, throws a DivideByZeroException
		try
		{
			result = x/y;
		} 
		catch (ArithmeticException e)
		{
			throw new DivideByZeroException(y);
		}
		//returns result if no exception occurs
		return result;
	}
}
