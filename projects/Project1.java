import java.util.Scanner;
public class Project1
{
        public static void main(String[] args)
        {
		// creates the two scanners that will get the input
		Scanner input_one = new Scanner (System.in);
		Scanner input_two = new Scanner (System.in);
		// prompts the user for input and stores the data
		System.out.println("Enter 1 if you want to encode the sentence and 2 if you want to decode it");
		int decision = input_one.nextInt();
		System.out.println("Enter the sentence you want encoded or decoded");
		String sentence = input_two.nextLine();
		//makes the decision to encode or decode and returns an error message if not 1 or 2 is chosen
		if (decision == 1)
		{
			encoder(sentence);
		}
		else if (decision == 2)
		{
			decoder(sentence);
		}
		else
		{
			System.out.println("Please enter 1 or 2");
		}
	}
	public static void encoder(String a)
	{
		//creates two char arrays with every alphabet, one normal and one reversed
		char list_one [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char list_two [] = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H','G', 'F', 'E', 'D', 'C', 'B', 'A'};
		//turns the string into a char array
		char str_as_array [] = a.toCharArray();
		//cycles through the char array that was a string and switches the letters to their counterpart
		for (int i = 0; i < str_as_array.length; i++)
		{
			for (int j = 0; j < list_one.length; j++)
			{
				if (str_as_array[i] == list_one[j])
				{
					str_as_array[i] = list_two[j];
					break;
				}
			}
		}
		//creates a new string to store the new array and prints it out
		String b = new String(str_as_array);
		System.out.println(b);
	}
	public static void decoder(String a)
        {
                //creates two char arrays with every alphabet, one normal and one reversed
                char list_one [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                char list_two [] = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a', 'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H','G', 'F', 'E', 'D', 'C', 'B', 'A'};
                //turns the string into a char array
                char str_as_array [] = a.toCharArray();
                //cycles through the char array that was a string and switches the letters to their counterpart
                for (int i = 0; i < str_as_array.length; i++)
                {       
                        for (int j = 0; j < list_one.length; j++)
                        {       
                                if (str_as_array[i] == list_one[j])
                                {       
                                        str_as_array[i] = list_two[j];
                                        break;
                                }
                        }
                }
                //creates a new string to store the new array and prints it out
                String b = new String(str_as_array);
                System.out.println(b);
        }

}
