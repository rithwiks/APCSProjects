public class Student extends Person
{
	//initializes 2 additional variables
	private String class_status;
	private String total;
	
	//creates a setter and getter method for class_status
	public void setClassStatus( String s )
	{
		class_status = s;
	}
	
	public String getClassStatus()
	{
		return class_status;
	}
	
	//creates a method that reutrns a sting with all of the student's information.
	public String toString()
	{
		total = "Name: " + name + "; Address " + address + "; Email address: " + email_address+ "; Phone number: " + phone_number + "; Birth date: " + birth_date.getDateString() + "; Class Status " + class_status;
		
		return total;
	}
}
