public class NullPointerExceptionCatch
{
	public static void main (String[] args) 
    	{ 
        	//sets a string's value to null then tries to use the .equals method. It catches the exception thrown and explains what the exception is and why it happened.
		String ptr = null; 
  
        	try
        	{ 
            		if (ptr.equals("gfg")) 
                		System.out.println("Same"); 
            		else 
                		System.out.println("Not Same"); 
        	} 
        	catch(NullPointerException e) 
        	{ 
            		System.out.println("NullPointerException Caught. They are thrown when a program tries to use an object reference that has the null value. Some examples could be when you invoke a method from a null object, like using the .equals method on a string variable with a null value."); 
        	}
    	} 
}
