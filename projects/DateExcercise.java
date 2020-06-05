import javax.swing.JOptionPane;
public class DateExcercise
{
	public static void main( String [] args)
	{
		//gets user input using input boxes
		int m = Input.getInt("Please enter a value for the month");	
		int d = Input.getInt("Please enter a value for the day");
		int y = Input.getInt("Please enter a value for the year");
		//creates date object with constructer
		Date d1 = new Date(m, d, y);
		//Creates string with date string
		String dateString = "The date is " + d1.getDateString();
		//displays message on display box
		JOptionPane.showMessageDialog(null, dateString);
	}
}	
