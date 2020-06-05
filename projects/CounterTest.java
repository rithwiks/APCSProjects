public class CounterTest
{
	public static void main(String [] args)	
	{
		//creates new CounterConsoleMenu object and the input variable
		CounterConsoleMenu cC1 = new CounterConsoleMenu();
		char input = ' ';
		
		//loops as long as input is not q
		do{
			//shows the menu then gets input. checks to see if they quit then changes count and shows the new count
			cC1.displayMenu();
			input = cC1.getInput();
			if (input == 'q')
			{
				break;
			}
			else {
				cC1.changeCount();
				cC1.displayCount();
			}
		} while (input != 'q');
	}
}
