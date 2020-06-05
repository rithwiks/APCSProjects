public class Staff extends Employee
{
	//initializes 2 additional variables
	private String job_title;
	private String total;
	
	//creates setter and getter methods
	public void setJobTitle(String s)
	{
		job_title = s;
	}
	
	public String getJobTitle()
	{
		return job_title;
	}
	
	//creates a method that returns a string with all of the Staff member's information.
	public String toString()
        {
                total = "Name: " + name + "; Address " + address + "; Email address: " + email_address + "; Phone number: " + phone_number + "; Birth date: " + birth_date.getDateString() + "; Salary: " + salary + "; Hire date: " + hire_date.getDateString() + "; Job Title: " + job_title;
	
		return total;
        }

}
