public class Account
{
	//declares all variables
	int account_number;
	double balance;
	float interest_rate;
	Date creation = new Date();
	int limit;
	
	//creates setter and getter variables
	public void setNumber(int x)
	{
		account_number = x;
	}
	
	public void setBalance(double d)
	{
		balance = d;
	}
	
	public void setInterest(float f)
	{
		interest_rate = f;
	}
	
	public void setCreation(int a, int b, int c)
	{
		creation.setDate(a, b, c);
	}
	
	public void setLimit(int z)
	{
	}
	
	public void deposit(int e)
	{
	} 
	
	public void withdraw(int h)
	{
	} 
	
	public int getNumber()
	{
		return account_number;	
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public float getInterest()
	{
		return interest_rate;
	}
	
	public String getCreation()
	{
		return creation.getDateString();
	}
}
