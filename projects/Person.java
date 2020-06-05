public class Person
{
	//initializes the variables
	public String name;
	public String address;
	public String email_address;
	public String phone_number;
	public Date birth_date = new Date();
	
	//creates setter methods for the variables
	public void setName(String s)
	{
		name = s;
	}
	
	public void setAddress(String a)
	{
		address = a;
	}
	
	public void setEmailAddress(String b)
	{
		email_address = b;
	}
	
	public void setPhoneNumber(String d)
	{
		phone_number = d;
	}
	
	public void setBirthDate(int day, int month, int year)
	{
		birth_date.setMonth(month);
		birth_date.setDay(day);
		birth_date.setYear(year);
	}
	
	//creates getter methods for the variables
	public String GetName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getEmailAddress()
	{
		return email_address;
	}
	
	public String getPhoneNumber()
	{
		return phone_number;
	}
	
	public String getBirthDate()
	{
		return birth_date.getDateString();
	}
}
	
