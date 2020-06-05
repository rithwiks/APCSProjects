public class MemoryCounterTest
{
        public static void main(String [] args)
        {
                //creates new MemoryCounterConsoleMenu object and the input variable
                MemoryCounterConsoleMenu cC1 = new MemoryCounterConsoleMenu();
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
			//displays memory menu and gets input to decide what to do to memory
			cC1.displayMenu2();
			cC1.getInput2();
			cC1.changeMem();
			cC1.displayMem();
                } while (input != 'q');
        }
}
