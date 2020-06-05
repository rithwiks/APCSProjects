/**
* This program asks the user for three integers and states whether or not they form a triangle and which triangle is formed.
* @author Rithwik Seth
*/

import java.util.Scanner;

public class Unit3Lab1
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user
                Scanner input = new Scanner(System.in);

                System.out.println("Please type 3 integers that are the values of the sides of the triangle, seperated by a space");
		
                //gets 3 integers from user
                int a = (input.nextInt());
		int b = (input.nextInt());
		int c = (input.nextInt());

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//finds out if it is a valid triangle
		if (((a + b) > c) & ((c + b) > a) & ((c + a) > b) & (a > 0) & (b > 0) & (c > 0)) {
			
			//determines the type of triangle
			if (a == b & b  == c){
				System.out.println("It is an equilateral triangle.");
			}
			else if ((a == b) | (b == c) | (c == a)) {
				System.out.println("It is an isosceles triangle.");
			}
			else {
				System.out.println("It is a scalene triangle.");
			}
		}
		else {
			System.out.println("The values entered do not make a valid triangle.");
		}
	}
}
