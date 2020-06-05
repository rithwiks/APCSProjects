import java.util.Scanner;
public class Assignment6_part1
{
        public static void main(String[] args)
        {
                Scanner end_of_range  = new Scanner(System.in);
		int num_of_div = 0;
		int sum_of_div = 0;
		int num_of_not_div = 0;
		int sum_of_not_div = 0;
		System.out.println("This program calculates the sum of the integers in a range that are divisible by 3");
		System.out.print("Enter an upper bound for the range: ");
		int range_end = end_of_range.nextInt();
		if (range_end <= 1)
		{
			System.out.println("Number has to be greater than 1");
		}
		else
		{
			for (int i = 1; i <= range_end; i++)
			{
				if (i % 3 == 0)
				{
					num_of_div++;
					sum_of_div += i;
				}
				else
				{
					num_of_not_div++;
					sum_of_not_div += i;
				}
			}
			System.out.println(num_of_div + " numbers in the range 1 - " + range_end + " are divisible by 3 and their sum is " + sum_of_div);
                	System.out.println(num_of_not_div + " numbers in the range 1 - " + range_end + " are not divisible by 3 and their sum is " + sum_of_not_div);
		}
	}
}	
