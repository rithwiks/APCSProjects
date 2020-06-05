public class IllegalArguementExceptionCatch
{
        public static void main(String [] args)
        {
                //Sets a string equal to null and passes it to the string method which throws an IllegalArgumentException if it is given a string with a null value. This exception is caught and the program prints a description about the exception
                String n = null;
		try{
                	System.out.println(string(n));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException Caught: It is thrown when a method has been passed an illegal or inappropriate argument. For example, the string method can't take a null value, so it throws an IllegaleArgumentException");
        	}
	}

        public static String string(String x)
        {
                if (x == null)
                        throw new IllegalArgumentException("The integer cannot be null");
                return x;
        }
}
