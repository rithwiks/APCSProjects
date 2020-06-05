import java.util.*;
public class Job
{
	//declares variables and a random object
	private int number;
	private int time;
	Random rnGenerator = new Random();
	
	//creates setter and getter methods, but for setTime gets a random number
	public void setNumber(int i)
	{
		number = i;
	}
	
	public void setTime()
	{
		time = rnGenerator.nextInt(1000) + 10;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getTime()
	{
		return time;
	}
} 
