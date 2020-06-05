/**
* This program gets a month and a year and displays the entire calendar.
* @author Rithwik Seth
*/
import java.util.Scanner;

public class Unit5Lab2
{
        public static void main(String [] args)
        {
                //creates Scanner and prompts user
                Scanner input = new Scanner(System.in);
		System.out.println("Please type a month number, 1-12, and a year in yyyy format.");
		int m = input.nextInt();
		int y = input.nextInt();
		printMonthCalendar( m, y );
		System.out.println();
	}
	
	 /**
        * This method displays the calendar.
        * @params m and y are different ints for the month and the year.
        * precondition: m and y are intgers and m is in the range 1-12
        * postcondition: the calendar is printed
        * @author Rithwik Seth
        */
	public static void printMonthCalendar( int m, int y)
	{
		calls upon two other methods
		printMonthHeader( m, y );
		printMonthBody( m, y );
	}

	/**
        * This method displays the calendar body.
        * @params m and y are different ints for the month and the year.
        * precondition: m and y are intgers and m is in the range 1-12
        * postcondition: the calendar body is printed
        * @author Rithwik Seth
        */

	public static void printMonthBody( int m, int y )
	{
		//prints the first day in correct position
		int day = getStartDay( m, 1, y);
		switch (day) {
			case 1:
				System.out.print("       1");	
				break;
                        case 2:
                                System.out.print("           1");     
                                break;
                        case 3:
                                System.out.print("               1");     
                                break;
                        case 4:
                                System.out.print("                   1");     
                                break;
                        case 5:
                                System.out.print("                       1");     
                                break;
                        case 6:
                                System.out.print("                           1");     
                                break;
                        case 7:
                                System.out.print("   1");     
                                break;
		}
		//prints rest of days through loop
		for ( int i = 2; i < getNumDaysInMonth(m, y); i++ )
		{
			if (( getStartDay(m, i, y) == 6 ) & ( i < 10 )) {
				System.out.print("   " + i);
				System.out.println();
			}
			else if (( getStartDay(m, i, y) == 6 ) & ( i > 10 )) {
                                System.out.print("  " + i);
                                System.out.println();
			}
                        else if (( getStartDay(m, i, y) != 6 ) & ( i < 10 )) {
                                System.out.print("   " + i);
			}
			else {
				System.out.print("  " + i);
			}
		}
	}
	
	/**
        * This method displays the calendar header.
        * @params m and y are different ints for the month and the year.
        * precondition: m and y are intgers and m is in the range 1-12
        * postcondition: the calendar header is printed
        * @author Rithwik Seth
        */

	public static void printMonthHeader( int m, int y )
	{
		//prints header
		System.out.println("\t" + getMonthName(m) + "\t" + y);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	/**
        * This method gets the number of days in a month.
        * @params m and y are different ints for the month and the year.
	* @return the number of days in a month
        * precondition: m and y are intgers and m is in the range 1-12
        * postcondition: the number of days are given.
        * @author Rithwik Seth
        */

	public static int getNumDaysInMonth( int m, int y )
	{
		//determines wether or not is a leap year and then the number of days.
		int x = 0;
		if ( isLeapYear(y) == false ) {
			switch ( m ) {
	                        case 1:
        	                        x = 31;
                	                break;
                        	case 2:
                                	x = 28;
                       		        break;
                        	case 3:
                        	        x = 31;
                        	        break;
                        	case 4:
                        	        x = 30;
                        	        break;
                        	case 5:
                        	        x = 31;
                        	        break;
                        	case 6:
                        	        x = 30;
                        	        break;
                        	case 7:
                        	        x = 31;
                                	break;
                        	case 8:
                        	        x = 31;
                        	        break;
                        	case 9:
                        	        x = 30;
                        	        break;
                        	case 10:
                        	        x = 31;                        
                        	        break;
                       		case 11:
                       	         	x = 30;
                                	break;
                       		case 12:
                        	        x = 31;      
                        	        break; 
			}
		}
		else {
			switch ( m ) {
                                case 1:
                                        x = 31;
                                        break;
                                case 2:
                                        x = 29;
                                        break;
                                case 3:
                                        x = 31;
                                        break;
                                case 4:
                                        x = 30;
                                        break;
                                case 5:
                                        x = 31;
                                        break;
                                case 6:
                                        x = 30;
                                        break;
                                case 7:
                                        x = 31;
                                        break;
                                case 8:
                                        x = 31;
                                        break;
                                case 9:
                                        x = 30;
                                        break;
                                case 10:
                                        x = 31;       
                                        break;
                                case 11:
                                        x = 30;
                                        break;
                                case 12:
                                        x = 31;        
                                        break;
                        }
		}
		return x;
	}
	
	/**
        * This method gets the month name.
        * @params m is the month number from 1-12.
	* @return month name
        * precondition: m is in the range 1-12 and an integer
        * postcondition: the months name is returned
        * @author Rithwik Seth
        */
	public static String getMonthName( int m )
	{
		//gets the month name depending on the number
		String x = "Hello";
		switch ( m ) {
			case 1:
				x = "January";
                                break;
                        case 2:
                                x = "February";
                                break;
                        case 3:
                                x = "March";
                                break;
			case 4:
                                x = "April";
                                break;
                        case 5:
                                x = "May";
                                break;
                        case 6:
                                x = "June";
                                break;
                        case 7:
                                x = "July";
                                break;
                        case 8:
                                x = "August";
                                break;
                        case 9:
                                x = "September";
                                break;
                        case 10:
                                x = "October";
                                break; 
                       case 11:
                                x = "November";
                                break;
                       case 12:
                                x = "December";
                                break;
		}
		return x;
	}

	/**
        * This method determines if the year is a leap year.
        * @params y is an integer for a year.
	* @return boolean for whether y is a loop year or not
        * precondition: y is an integer
        * postcondition: determines if y was a leap year or not.
        * @author Rithwik Seth
        */	
	public static boolean isLeapYear(int y)
	{
		//determines if y was a leap year
		if ( (y/4) == 0 ) {
			return true;
		}
		else {
			return false;
		}
	}

	

 	/*
  	The method getStartDay() implements Zeller's Algorithm for determining the day of the
  	week the first day of a month is. The method adjusts Zeller's numbering scheme
  	for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
  	that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
  	
  	Pre-Conditions: The month value, m,  is 1-12
  	                      The day value, d, is 1-31, or 1-28, 1-29 for February
  	                      The year value, y, is the full year (e.g., 2012)
                  
 	Post-Conditions: A value of 1-7 is returned, representing the first day of the month
        	                1 = Monday, ..., 7 = Sunday
  	*/

  	public static int getStartDay( int m, int d, int y )
  	{
   		 // Adjust month number & year to fit Zeller's numbering system
    		if ( m < 3 ) 
    		{
      			m = m + 12;
      			y = y - 1;
    		}
    
    		int k = y % 100;      // Calculate year within century
    		int j = y / 100;      // Calculate century term
    		int h = 0;            // Day number of first day in month 'm'
    
    		h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
    
    		// Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
    		int dayNum = ( ( h + 5 ) % 7 ) + 1;     
    
    		return dayNum;
  	}
}
