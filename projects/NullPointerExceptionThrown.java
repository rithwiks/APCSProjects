public class NullPointerExceptionThrown
{
	public static void main (String[] args) 
    	{ 
		//sets a string equal to a null value and tries to use the .equals method with it
        	String ptr = null; 
  
            	if (ptr.equals("hi")) 
                	System.out.println("Same"); 
            	else 
                	System.out.println("Not Same"); 
     	}
} 
