/**
* This program displays the chars A-Z, a-z, 0-9, and a handful of special chars like < and ! as well as their integer values.
* @author Rithwik Seth
*/

public class Unit2Lab1
{
	public static void main(String [] args)
	{
		//for loop to loop through integer values of 0-9
		for( int i = 48; i <= 57; i++){		
		System.out.printf("The character %c has the value %d\n", (char) i, i);
		}
		//for loop to loop through integer values of A-Z
		for( int i = 65; i <= 90; i++){
                System.out.printf("The character %c has the value %d\n", (char) i, i);
                }
		//for loop to loop through integer values of a-z
		for( int i = 97; i <= 122; i++){
                System.out.printf("The character %c has the value %d\n", (char) i, i);
                }
		//prints each special character
		System.out.printf("The character %c has the value %d\n", (char) 32, 32);
		System.out.printf("The character %c has the value %d\n", (char) 43, 43);
		System.out.printf("The character %c has the value %d\n", (char) 45, 45);
		System.out.printf("The character %c has the value %d\n", (char) 95, 95);
		System.out.printf("The character %c has the value %d\n", (char) 61, 61);
		System.out.printf("The character %c has the value %d\n", (char) 38, 38);
		System.out.printf("The character %c has the value %d\n", (char) 64, 64);
		System.out.printf("The character %c has the value %d\n", (char) 35, 35);
		System.out.printf("The character %c has the value %d\n", (char) 36, 36);
		System.out.printf("The character %c has the value %d\n", (char) 63, 63);
		System.out.printf("The character %c has the value %d\n", (char) 60, 60);
		System.out.printf("The character %c has the value %d\n", (char) 62, 62);
		System.out.printf("The character %c has the value %d\n", (char) 124, 124);
		System.out.printf("The character %c has the value %d\n", (char) 33, 33);
		System.out.printf("The character %c has the value %d\n", (char) 126, 126);

	}
}
