public class ArrayIndexOutOfBoundsExceptionCatch
{
        public static void main(String[] args)
        {
                //creates array with size 4 and tries to set a value beyond the size of the array. An ArrayIndexOutOfBounds Exception is caught and a line explaining why is printed.
                int ar[] = new int[4];
                try { ar[5] = 5;}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exeption Caught: This is thrown when the array is given a request for a negative number or number greater than or equal to the size. For example, we tried to access the the position 5 of an array (the sixth spot), but the array only has a size of 4, meaning that the highes accesible spot is 3.");
		}
	}
} 
