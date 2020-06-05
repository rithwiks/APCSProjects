public class Unit16Lab1
{
	public static boolean isPalindrome(String j)
	{
		//turns string to lowercase and turns it into a char array
		String s = j.toLowerCase();
		char[] a = s.toCharArray();
		//intializes the variables needed for the for loop
		int semi_length = (int) (a.length / 2);
		int front_num = 0;
		int back_num = a.length - 1;
		boolean output = true;
		
		//for loop loops through half of the array and compares it with the back half
		for (int i = 0; i < semi_length; i++)
		{
			//if there is a space, it skips it by adding or subtracting 1
			if (a[front_num] == ' ')
			{
				front_num++;
			}
			
			if(a[back_num] == ' ')
			{
				back_num--;
			}
			
			//compares values and if they do not match it sets output to false and breaks. if they match, it adds or subtracts 1
			if(a[front_num] != a[back_num])
			{
				output = false;
				break;
			}
			else
			{
				front_num++;
				back_num--;
			}
		}
		//returns output
		return output;
	}
			
			
	
	public static void main (String [] args)
	{
		//calls isPalindroms for 2 strings and shows wether they are palindromes or not
		System.out.println("May a moody baby doom a yam: " + isPalindrome("May a moody baby doom a yam"));
		System.out.println("May a moody big baby doom a yam: " + isPalindrome("May a moody big baby doom a yam"));	
	}
}
