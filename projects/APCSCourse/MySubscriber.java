public class MySubscriber extends Subscriber
{
	//changes the update method to take an integer and print out a message
	public void update(int i)
	{
		System.out.println("Subscriber " + i + " has been notified");
	}
}
