public class Unit16Lab2
{
	public static int[] bubbleSort(int[] a)
	{
		//initializes two interger variables to store values from the array
		int value1;
		int value2;
		
		//sets up a loop nested loop to compare each value to the previous one an x amount of times
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 1; j < a.length; j++)
			{
				//finds out if the previous value is greater than the next one. If so, it switches the values
				value1 = a[j-1];
				value2 = a[j];
				
				if (value1 > value2)
				{
					a[j] = value1;
					a[j-1] = value2;
				}
			}
		}
		
		//returns the new array
		return a;
	}
 	
	public static void main (String [] args)
        {
		//sets up an out of order array and sorts it
		int[] arr = { 6, 8, 2, 4, 6, 7, 19, 15 };
		int[] arr2 = bubbleSort(arr);
		//displays sorted array
		for (int c = 0; c < arr2.length; c++)
		{
			System.out.println(arr2[c]);
		}
	}
}
	
	
	
