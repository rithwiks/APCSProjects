public class Employee extends Person
{
	//initializes 2 additional variables
	public double salary;
	public Date hire_date = new Date();
	
	// ctreates setter and getter methods
	public void setSalary(double d)
	{
		salary = d;
	}
	
	public void setHireDate(int day, int month, int year)
        {
                hire_date.setMonth(month);
                hire_date.setDay(day);
                hire_date.setYear(year);
        }
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getHireDate()
        {
                return hire_date.getDateString();
        }
}
