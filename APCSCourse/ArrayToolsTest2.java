/**
* This program creates test arrays to test the created methods.
* @author Rithwik Seth
*/

	import java.util.Arrays;

public class ArrayToolsTest2
{
	public static void main( String args[] )
        {
		//intializes test arrays
                char testChar1[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
                int testInt1[] = { 1, 2, 3, 4, 5, 6 };
                double testDoub1[] = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
                char testChar2[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
                int testInt2[] = { 1, 2, 3, 4, 5, 6 };
                double testDoub2[] = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
		//prints the methods after they take the arrays as input.
		System.out.println("The arrays are equal - " + equals(testChar1, testChar2));
		System.out.println("The arrays are equal - " + equals(testInt1, testInt2));
		System.out.println("The arrays are equal - " + equals(testDoub1, testDoub2));
		System.out.println("a is in the array, index " + find(testChar1, 'a'));
		System.out.println("3 is in the array, index " + find(testInt1, 3));
		System.out.println("1.4 is in the array, index " + find(testDoub1, 1.4));
		sort(testChar1);
		sort(testInt1);
		sort(testDoub1);
        }
	//This method determines if two arrays are equal
	//@params are two char arrays
	//@return whether or not the arrays are equal 
	//precondition the arrays are char
	//postcondition returns whether or not the arrays are equal
	//@author Rithwik Seth		
	public static boolean equals(char a1[], char a2[])
	{
		//uses Arrays.equals
		return Arrays.equals(a1, a2);
	}
	
	//This method determines if two arrays are equal
        //@params are two int arrays
        //@return whether or not the arrays are equal 
        //precondition the arrays are int
        //postcondition returns whether or not the arrays are equal
        //@author Rithwik Seth
	public static boolean equals(int a1[], int a2[])
        {
		//uses Arrays.equals
                return Arrays.equals(a1, a2);
        }

	//This method determines if two arrays are equal
        //@params are two double arrays
        //@return whether or not the arrays are equal
        //precondition the arrays are double
        //postcondition returns whether or not the arrays are equal
        //@author Rithwik Seth
	public static boolean equals(double a1[], double a2[])
        {
		//uses Arrays.equals
                return Arrays.equals(a1, a2);
        }
	
	//This method determines which index a key is located
        //@params are a char array and a key
        //@return which index the key is in
        //precondition the array is a char and the key is a char
        //postcondition returns which index the key is in
        //@author Rithwik Seth
	public static int find(char array[], char key)
	{
		//uses Arrays.binarySearch
		return Arrays.binarySearch(array, key);
	}
	
	//This method determines which index a key is located
        //@params are a int array and a key
        //@return which index the key is in
        //precondition the array is a int and the key is a int
        //postcondition returns which index the key is in
        //@author Rithwik Seth
	public static int find(int array[], int key)
        {
		//uses Arrays.binarySearch
                return Arrays.binarySearch(array, key);
        }
	
	//This method determines which index a key is located
        //@params are a double array and a key
        //@return which index the key is in
        //precondition the array is a double and the key is a double
        //postcondition returns which index the key is in
        //@author Rithwik Seth
	public static int find(double array[], double key)
        {
		//uses Arrays.binarySearch
                return Arrays.binarySearch(array, key);
        }
	
	//This method sorts the array in ascending order and prints it
        //@params are a char array
        //precondition the array is a char array
        //postcondition prints a sorted array
        //@author Rithwik Seth
	public static void sort(char array[])
	{
		//uses Arrays.sort and then loops to display it
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();	
	}
	
	//This method sorts the array in ascending order and prints it
        //@params are an int array
        //precondition the array is an int array
        //postcondition prints a sorted array
        //@author Rithwik Seth
	public static void sort(int array[])
        {
		//uses Arrays.sort and then loops to display it
                Arrays.sort(array);     
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
                System.out.println();
        }
	
	//This method sorts the array in ascending order and prints it
        //@params are a double array
        //precondition the array is a double array
        //postcondition prints a sorted array
        //@author Rithwik Seth
	public static void sort(double array[])
        {
		//uses Arrays.sort and then loops to display it
                Arrays.sort(array);     
                for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                }
                System.out.println();
        }
}
