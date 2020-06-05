import java.util.Scanner;

public class Assignment9
{
        public static void main(String[] args)
        {
		// creates the scanners that will recieve the data
		Scanner get_input_one = new Scanner (System.in);
		Scanner get_input_two = new Scanner (System.in);

		//the program then prompts the user for input and gets a string and an integer
		System.out.print("Enter a sentence: ");
		String sentence = new String(get_input_one.nextLine());
		System.out.print("Enter 1 to count characters, 2 to count words: ");

		int what_to_count = get_input_two.nextInt();

		//decides whether to count characters or words depending on what the user entered
		if (what_to_count == 1)
		{
			character_count(sentence);
		}
		else if (what_to_count == 2)
		{
			word_count(sentence);
		}
		//returns an error message if the user did not enter 1 or 2
		else
		{
			System.out.println("Please enter 1 or 2");
		}
	}

	public static void character_count(String s)
	{
		//finds the length of the string with the length method and stops the spaces from being counted with the replace method
		int num_of_chars = (s.replace(" ", "").length());

		//prints the length
		System.out.println("There are " + num_of_chars + " characters in the sentence");
	}

	public static void word_count(String s)
	{
		// creates a variable to keep track of the words and turns the string into a char array
		int word_count = 1;
		char a[] = s.toCharArray();
		/* iterates through the array and finds the white space in words. It counts them and stores them in word count.
		It only counts the spaces that do not have a space in front of them.*/
		for(int i = 0; i < a.length; i++ )
		{
			if ((a[i] == ' ') && (a[i-1] != ' '))
			{
				word_count++;
			}
		}

		// prints the amount of words
		System.out.println("There are " + word_count + " words in the sentence");
	} 
}
