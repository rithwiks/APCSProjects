/**
* This program prints a random number.
* @author Rithwik Seth
*/
import java.lang.Math;

public class Unit5Activity1Q3
{
        public static void main(String [] args)
        {
		//loops to print the random numbers
		for(int i = 0; i < 20; i++) {
			System.out.println(1+(Math.random()*5));
		}
	}
}
