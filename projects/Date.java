public class Date
{
	//initializes variables
  	private int month;
  	private int day;
  	private int year;
 	//creates constructers for different inputs
	//precondition: all values need to be int and only 3 can be submitted at max
 	public Date() 
	{
	month = 0;
	day = 0; 
	year = 0; 
	}
  
	public Date(int m)
        {
        month = m; 
        day = 0; 
        year = 0;
        }
	
	public Date(int m, int d)
        {
        month = m; 
        day = d; 
        year = 0;
        }
	
	public Date(int m, int d, int y)
        {
        month = m; 
        day = d; 
        year = y;
        }
	//Setter methods for variables and Date that take input
	////precondition: all values need to be int
	public void setMonth(int m)
	{
		month = m;
	}
	
	public void setDay(int d)
        {
                day = d;
        }
	
	public void setYear(int y)
        {
                year = y;
        }
	
  	public void setDate( int m, int d, int y )
  	{
  		month = m; 
		day = d; 
		year = y;
  	}
  	//returns a string that shows the date in the correct format
  	public String getDateString()
  	{
  		return month + "/" + day + "/" + year;
  	}
}
