public class MemoryCounter extends Counter
{
	//initializes integer variable for memory
	private int memory;
	
	//sets memory equal to count
	public void addMem()
	{
		memory = count;
	}
	
	//resets memory to 0
	public void resetMem()
	{
		memory = 0;
	}
	
	//returns the memory to get value
	public int getMem()
	{
		return memory;
	}
}
