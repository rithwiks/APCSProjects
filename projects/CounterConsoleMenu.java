public class CounterConsoleMenu
{
	//creates MemoryCounter object and input character
	MemoryCounter c1 = new MemoryCounter();
	public char input = ' ';
	
	//displays the menu by printing it
	public void displayMenu()
	{
		System.out.println("Increment \t Decrement \t reset \t quit");
	}
	
	//gets input with Input.getChar
	public char getInput()
	{
		input = Input.getChar("Please type a character (i for increment, d for decrement, r for reset, or q for quit)");
		return input;
	}
	
	//Displays the count
	public void displayCount()
	{
		System.out.println("Count: " + c1.getCount());
	}
	
	//Changes the count depending on if i, d, or r was inputted. 
	public void changeCount()
	{
		if (input == 'i') {
			c1.increment();
		}
		
		else if (input == 'd') {
			c1.decrement();
		}
		
		else if (input == 'r') {
			c1.reset();
		}
		
		//if wrong character is inputted, prints statement to inform user
		else {
			System.out.println("You need to type one of the given characters");
		}
	}
}
