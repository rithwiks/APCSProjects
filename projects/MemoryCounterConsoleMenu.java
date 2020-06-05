public class MemoryCounterConsoleMenu extends CounterConsoleMenu
{
	//displays the menu options for memory
	public void displayMenu2()
	{
		System.out.println("Add to memory \t reset memory \t nothing");
	}
	
	//gets input for what to do to memory
	public void getInput2()
	{
		input = Input.getChar("Please type a character (a for add to memory, n for nothing, or r for reset memory)");
	}
	
	//changes the memory based on input
	public void changeMem()
	{
		//sets memory to counter's value
		if (input == 'a') {
			c1.addMem();
		}
		
		//resets memory's value
		else if (input == 'r') {
			c1.resetMem();
		}
		
		//does nothing to memory
		else if (input == 'n'){
			
		}
		
		//prints a message telling user to input one of the mentioned options
		else {
                        System.out.println("You need to type one of the given characters");
                }
	}
	
	//displays the value of the memory
	public void displayMem()
	{
		System.out.println("Memory: " + c1.getMem());
	}
}
