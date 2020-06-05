import java.util.Scanner;
public class Assignment4
{
        public static void main(String[] args)
        {
                Scanner score = new Scanner(System.in);
		System.out.print("Enter a value for the first test score: ");
		float score1 = score.nextFloat();
		System.out.print("Enter a value for the second test score: ");
                float score2 = score.nextFloat();
		System.out.print("Enter a value for the third test score: ");
                float score3 = score.nextFloat();
		float average = (score1 + score2 + score3)/3;
		if ((average <= 100) && (average >= 97.5))
		{
			System.out.println( "Average is " + average + " Grade is A+");
		}        
		else if ((average <= 97.49) && (average >= 93.5))
		{
                        System.out.println( "Average is " + average + " Grade is A");
               	}
		else if ((average <= 93.49) && (average >= 89.5))
		{
                        System.out.println( "Average is " + average + " Grade is A-");
                }
		else if ((average <= 89.49) && (average >= 86.5))
		{
                        System.out.println( "Average is " + average + " Grade is B+");
                }
		else if ((average <= 86.49) && (average >= 82.5))
		{
               	        System.out.println( "Average is " + average + " Grade is B");
               	}
		else if ((average <= 82.49) && (average >= 79.5))
		{
                        System.out.println( "Average is " + average + " Grade is B-");
                }
		else if ((average <= 79.49) && (average >= 69.5))
		{
                	System.out.println( "Average is " + average + " Grade is C");
		}
		else
		{
			System.out.println( "Average is " + average + " Grade is F");
		}
        }

}        
