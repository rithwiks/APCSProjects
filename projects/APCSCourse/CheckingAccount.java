public class CheckingAccount extends Account
{
	//setter and getter methods to make it possible for user to set and get limit
        public void setLimit(int g)
        {
                limit = g;
        }

        public int getLimit()
        {
                return limit;
        }
	
	//creates deposit and withdraw methods that change the value of balance
        public void deposit(int i)
        {
                balance += i;
        }

        public void withdraw(int n)
        {
		//makes sure customer doesn't take more money than the limit or the amount in the account
                if (n > limit) {
                        System.out.println("You can't take more money than the overdraft limit!");
		}
                else if ((balance - n) < 0) {
                        System.out.println("Your account does not have enough money!");
                }
		else {
                        balance -= n;
		}
        }
}
                                        
