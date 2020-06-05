public class TestAccount
{
	public static void main (String[] args)
	{
		//creates an array with a savings account and a checking account
		Account [] accountObjects = { new SavingsAccount(), new CheckingAccount()};
		
		//loops to assign values to variables
		for(int i = 0; i < accountObjects.length; i++)
		{
			accountObjects[i].setNumber(1+i);
			accountObjects[i].setBalance(500);
			accountObjects[i].setInterest(0.05F);
			accountObjects[i].setCreation(1, 5, 2000);
		}
		//adds a limit value
		accountObjects[1].setLimit(250);
		
		//loops to withdraw and deposit values. Uses nested loop to do it twice.
		for(int k = 0; k < 2; k++)
		{
			for(int n = 0; n < accountObjects.length; n++)
			{
				accountObjects[n].deposit(50*(n+1));
				accountObjects[n].withdraw(75*(n+1));
				System.out.println("Account " + (n+1) + " balance: " + accountObjects[n].getBalance());
			}
		}
	}
}	
		
