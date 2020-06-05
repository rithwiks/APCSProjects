public class SavingsAccount extends Account
{
	//creates a deposit and withdraw method that changes the value of balance
        public void deposit(int i)
        {
                balance += i;
        }

        public void withdraw(int n)
        {
		//makes sure customer doesn't take more moeny than possible
                if ((balance - n) < 0)
                        System.out.println("Your account does not have enough money!");
                else
                        balance -= n;
        }
}
	
