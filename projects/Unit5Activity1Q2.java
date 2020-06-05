/**
* This program gets a number in degrees and turns it into radians and finds the sin, cos, and tan.
* @author Rithwik Seth
*/
import java.util.Scanner;
import java.lang.Math;

public class Unit5Activity1Q2
{
        public static void main(String [] args)
        {
                //creates Scanner, prompts user, and gets input
                Scanner input = new Scanner(System.in);
                System.out.println("Please type a degree value");
		Float degree = input.nextFloat();
		//prints everything with all of its adjustments done using Math
		System.out.println(degree);
		System.out.println(Math.toRadians(degree));
		System.out.println(Math.sin(degree));
		System.out.println(Math.cos(degree));
		System.out.println(Math.tan(degree));
	}
}
