public class Counter
{
	//initializes count variable
	public int count = 0;
	
	//creates methods to add one, take one, or reset the count
	public void increment()
	{
		count++;
	}
	
	public void decrement()	
	{
		count--;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	//method that returns count
	public int getCount()
	{
		return count;
	}
}
	
