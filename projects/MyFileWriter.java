import java.io.FileWriter;
public class MyFileWriter 
{
	initializes a string and a file writer	
	private String date_string;
	private FileWriter fw;

	//When the filewriter object is created, the file myClass.txt is assigned to it
	public MyFileWriter()
	{
		try{
			fw = new FileWriter("/Users/rithwikseth/Documents/rithwik/projects/myClass.txt");
		}catch(Exception e){}
	}
	
	//writes a date in the file
	public void addDate( Date d1 )
	{
		try{
			date_string = d1.getDateString();
			fw.write(date_string);
			fw.write("    ");
		}catch(Exception e){}
	}
	
	//closes the file writer
	public void close()
	{
		try{
			fw.close();
		}catch(Exception e){}
	}
	
} 
