public class MyPublisher extends Publisher
{
	//initializes an int variable
	private int count;
	
	//creates a contructor that intitializes the count as well.
	public MyPublisher(int mx)
	{
		super(mx);
		count = 0;
	}
	
	//adds one to the count and, if count is greater than or equal to three, notifies 3 subscribers
	public void increment()
	{
		count++;
		
		if (count >= 3)
			notifySubscribers(3);
	}
}
