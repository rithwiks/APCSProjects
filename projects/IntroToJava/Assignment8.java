
public class Assignment8
{ 
        public static void main(String[] args)
        {
		// Creates and stores the values in the array
		int randomNums[] = new int[100];
		for ( int i = 0; i < 100; i++ )
			randomNums[i] = (int)(Math.random() * (100)) + 1;
		// calls the methods to get the values 
		int divByFour[] = findDivByFour( randomNums );
		int notDivByFour[] = findNotDivByFour( randomNums );
		// prints the result
		System.out.println("Array of random numbers that are divisible by 4:");
		display(divByFour);
		System.out.println();
		System.out.println();
		System.out.println("Array of random numbers that are not divisible by 4:");
		display(notDivByFour);
		System.out.println();
	}
	public static int[] findDivByFour( int a[] )
	{
		// this declares and initializes the two variables
		int arrayNum = 0;
		int arraySize = 0;
		// this for loop finds the size
		for ( int j = 0; j < 100; j++)
		{
			if (a[j] % 4 == 0)
			{
				arraySize++;
			}
		}
		// this for loop gets the values
		int divByFour[] = new int[arraySize];
		for ( int k = 0; k < 100; k++)
                {       
                        if (a[k] % 4 == 0)
                        {       
                                divByFour[arrayNum] = a[k];
				arrayNum++;
                        }
                }
		return divByFour;
	}
	public static int[] findNotDivByFour( int b[] )
        {
                // this declares and initializes the two variables
		int arrayNum = 0;
		int arraySize = 0;
		//the for loops are the same as the above one.
                for ( int j = 0; j < 100; j++)
                {
                        if (b[j] % 4 !=  0)
                        {
                                arraySize++;
                        }
                }
		int notDivByFour[] = new int[arraySize];
		for ( int k = 0; k < 100; k++)
                {
                        if (b[k] % 4 !=  0)
                        {
				notDivByFour[arrayNum] = b[k];
                                arrayNum++;
                        }
                }
                return notDivByFour;  
        }
	public static void display( int c[] )
	{	
		//displays the arrays with a for loop
		System.out.println();
		for( int j = 0; j < c.length; j++ )
			System.out.print( c[j] + " " );
	}
}
