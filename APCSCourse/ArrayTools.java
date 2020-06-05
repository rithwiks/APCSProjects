/**
* This program creates methods and tests them with arrays.
* @author Rithwik Seth
*/

public class ArrayTools
{
	public static void main( String args[] )
        {
		//creates test arrays
                char testChar[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
                int testInt[] = { 1, 2, 3, 4, 5, 6 };
                double testDoub[] = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
		//Prints out the methods' result
                System.out.println(" The minimum is " + minimum(testChar));
                System.out.println(" The minimum is " + minimum(testInt));
                System.out.println(" The minimum is " + minimum(testDoub));
                System.out.println(" The maximum is " + maximum(testChar));
                System.out.println(" The maximum is " + maximum(testInt));
                System.out.println(" The maximum is " + maximum(testDoub));
		System.out.println(" The minimum is at " + minimumAt(testChar));
                System.out.println(" The minimum is at " + minimumAt(testInt));
                System.out.println(" The minimum is at " + minimumAt(testDoub));
                System.out.println(" The maximum is at " + maximumAt(testChar));
		System.out.println(" The maximum is at " + maximumAt(testInt));
		System.out.println(" The maximum is at " + maximumAt(testDoub));
		System.out.println(" The average is " + average(testInt));
		System.out.println(" The average is " + average(testDoub));
        }
	
	//These methods determine the minimum value in an array (all minimum)
        //@param is an array of either char, int or double
        //@return the smallest value
        //precondition the array is either int, double, or char
        //postcondition returns the smallest value
        //@author Rithwik Seth	
	public static char minimum(char array[]) 
	{
		//(for all methods) create a minimum variable and loops to find the smallest value
		char minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if ( minimum > array[i] )
				minimum = array[i];
		}
		//returns minimum
		return minimum;
	}
	
	public static int minimum(int array[]) 
        {
                int minimum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( minimum > array[i] )
                                minimum = array[i];
                }
                return minimum;
        }
	
	public static double minimum(double array[]) 
        {
                double minimum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( minimum > array[i] )
                                minimum = array[i];
                }
                return minimum;
        }
	
	//These methods determine the maximum value in an array (all maximum)
        //@param is an array of either char, int or double
        //@return the largest value
        //precondition the array is either int, double, or char
        //postcondition returns the largest value
        //@author Rithwik Seth
	public static char maximum(char array[]) 
        {
		//creates maximum variable, loops to find maximum value, then returns that value
                char maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum < array[i] )
                                maximum = array[i];
                }
                return maximum;
        }
	
	public static int maximum(int array[])
        {
                int maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum < array[i] )
                                maximum = array[i];
                }
                return maximum;
        }
	
	public static double maximum(double array[])
        {
                double maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum < array[i] )
                                maximum = array[i];
                }
                return maximum;
        }

	//These methods determine where the minimum value in an array is (all minimumAt)
        //@param is an array of either char, int or double
        //@return the smallest value's location
        //precondition the array is either int, double, or char
        //postcondition returns the smallest value's location
        //@author Rithwik Seth
	public static int minimumAt(char array[])
        {
		//creates minimum_location and minimum variable, loops to find minimum variable and returns its location
		int minimum_location = 0;
		char minimum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( minimum > array[i] ) {
                                minimum = array[i];
				minimum_location = i;
			}
                }
                return minimum_location;
        }
	
	public static int minimumAt(int array[])
        {
                int minimum_location = 0;
                int minimum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( minimum > array[i] ) {
                                minimum = array[i];
                                minimum_location = i;
			}
                }
                return minimum_location;
        }
	
	public static int minimumAt(double array[])
        {
                int minimum_location = 0;
                double minimum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( minimum > array[i] ) {
                                minimum = array[i];
                                minimum_location = i;
			}
                }
                return minimum_location;
        }
	
	//These methods determine where the maximum value in an array is (all maximumAt)
        //@param is an array of either char, int or double
        //@return the largest value's location
        //precondition the array is either int, double, or char
        //postcondition returns the largest value's location
        //@author Rithwik Seth
	public static int maximumAt(char array[])
        {
		//creates maximum_location and maximum variable, loops to find maximum value, and returns its location
                int maximum_location = 0;
                char maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum > array[i] )
                                maximum = array[i];
                                maximum_location = i;
                }
                return maximum_location;
        }
	
	public static int maximumAt(int array[])
        {
                int maximum_location = 0;
                int maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum > array[i] )
                                maximum = array[i];
                                maximum_location = i;
                }
                return maximum_location;
        }
	
	public static int maximumAt(double array[])
        {
                int maximum_location = 0;
                double maximum = array[0];
                for (int i = 0; i < array.length; i++) {
                        if ( maximum > array[i]) {
                                maximum = array[i];
                                maximum_location = i;
			}
                }
                return maximum_location;
        }
	
	//These methods averages all values in an array (all average)
        //@param is an array that is either int or double
        //@return the average
        //precondition the array is either int or double
        //postcondition returns the average
        //@author Rithwik Seth
	public static double average(int array[])
        {
		//adds all the values with a loop then divides with the length of the array
                double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
                }
                double average = sum / array.length;
		return average;
        }
	
	public static double average(double array[])
        {
                double sum = 0;
                for (int i = 0; i < array.length; i++) {
                        sum += array[i];
                }
                double average = sum / array.length;
                return average;
        }
}
