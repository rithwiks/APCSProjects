import java.util.*;
public class Unit12Lab2
{
        public static void main( String args[] )
        {
		//creates a linked list with type jon, variables, a scanner object. Then prompts user and stores value
		LinkedList<Job> queue = new LinkedList<Job>();
		char input;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to add a job (type a) or quit the program (type q)");
		input = sc.next().charAt(0);
		//loops everytime input equals a to add a job
		while(input == 'a')
		{
			//creates a job, gives it a job number, sets a random time, adds the job to queue, increases the count, and prompts the user for a value which is stored
			Job j1 =  new Job();
			j1.setNumber(count);
			j1.setTime();
			queue.addLast(j1);
			count++;
			System.out.println("Would you like to add a job (type a) or quit the program (type q)");
                	input = sc.next().charAt(0);
		}
		
		//prints a line then loops through the list and prints the list
		System.out.println();
		for(int i = 0; i < queue.size(); i++)
		{
			System.out.println("Job number: " + queue.get(i).getNumber() + " Print Time: " +  queue.get(i).getTime());
		}
	}
}
			
