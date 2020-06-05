public class ClassCastExceptionCatch
{
        public static void main(String [] args)
        {
                //Creates a new string object that is upcasted to the Object type. Then, o tries to be downcasted to an Integer object, resulting in a ClassCast Exception that has caught. The program then prints a line describing ClassCast Exceptions
                try{
			Object o =  new String();
                	Integer i = (Integer) o;
		}
		catch(ClassCastException e)
		{
			System.out.println("ClassCastException Caught: This is thrown when an object can not be casted to another type. For example, the object o that was upcasted from a string object cannot be downcasted, resulting in a ClassCastException");
		}
        }
}
