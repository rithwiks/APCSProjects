public class Faculty extends Employee
{
	//initializes 3 additional vairables
	private String office_hours;
	private String rank;
	private String total;
	
	//creates setter and getter methods
	public void setOfficeHours(String s)
	{
		office_hours = s;
	}
	
	public void setRank(String a)
	{
		rank = a;
	}

	public String getOfficeHours()
	{
		return office_hours;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	//creates a method that returns a string with all of the Faculty member's information
	public String toString()
	{
		total = "Name: " + name + "; Address " + address + "; Email address: " + email_address + "; Phone number: " + phone_number + "; Birth date: " + birth_date.getDateString() + "; Salary: " + salary + "; Hire date: " + hire_date.getDateString() + "; Office Hours: " + office_hours + "; Rank: " + rank;
		
		return total;
	}
}
