public class Publisher
{
	//initializes a mysubscriber object, and two ints
	private MySubscriber [] subscriberList;
	private int maximumSubscribers;
	private int nextIndex;
	
	//creates a constructer that takes an integer
	public Publisher(int max)
	{
		maximumSubscribers = max;
		subscriberList = new MySubscriber[maximumSubscribers];
		nextIndex = 0;
	}
	
	//creates a method that adds a subscriber to an array if the array is not full
	public void register(MySubscriber s)
	{
		if (nextIndex < maximumSubscribers)
			subscriberList[nextIndex++] = s;
		else
			System.out.println("ERROR: Subscriber List is full");
	}
	
	//invokes the update method of a given amount of subscribers using a for loop 
	public void notifySubscribers(int m)
	{
		int n = 0;
		for(int i = 0; i < m; i++)
		{	
			n = i + 1;
			subscriberList[i].update(n);
		}
	}
		
}	
