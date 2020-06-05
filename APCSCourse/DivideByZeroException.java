public class DivideByZeroException extends Exception
{
	//declares an int variable
	private int denom;
	
	//creates constructors
	public DivideByZeroException()
	{
	}
	
	public DivideByZeroException(String s)
	{
		super(s);
	}
	
	public DivideByZeroException(int d)
	{
		super("div by zero");
		denom = d;
	}
	//creates a getter method for denom
	public int getDenominator()
	{
		return denom;
	}
}
