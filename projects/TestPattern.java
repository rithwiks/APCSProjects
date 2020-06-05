public class TestPattern
{
	public static void main(String [] args)
	{
		//creates 3 my subscriber objects and one mypublisher object
		MySubscriber s1 = new MySubscriber();
		MySubscriber s2 = new MySubscriber();
		MySubscriber s3 = new MySubscriber();
		MyPublisher p1 = new MyPublisher(5);
		
		//registers the subscriber objects
		p1.register(s1);
		p1.register(s2);
		p1.register(s3);
		
		//increments the count, resulting in the subscribers being notified
		p1.increment();
		p1.increment();
		p1.increment();
	}
}
