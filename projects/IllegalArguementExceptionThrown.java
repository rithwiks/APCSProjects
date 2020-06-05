public class IllegalArguementExceptionThrown
{
        public static void main(String [] args)
        {
		//Sets a string equal to null and passes it to the string method which throws an IllegalArgumentException if it is given a string with a null value
		String n = null;
		System.out.println(string(n));
	}
	
	public static String string(String x)
	{
		if (x == null)
			throw new IllegalArgumentException("The integer cannot be null");
		return x;
	}
}
