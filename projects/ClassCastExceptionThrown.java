public class ClassCastExceptionThrown
{
	public static void main(String [] args)
	{
		//Creates a new string object that is upcasted to the Object type. Then, o tries to be downcasted to an Integer object, resulting in a ClassCast Exception
		Object o =  new String();
        	Integer i = (Integer) o;
	}
}
