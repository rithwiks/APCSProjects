public class MyFileProcessor
{
	public static void main(String [] args)
	{
		//creates a file writer anf file reader object
		MyFileWriter fileWriter = new MyFileWriter();
		MyFileReader fileReader = new MyFileReader();
		
		//creates 6 date objects with dates
		Date d1 = new Date(1, 1, 1999);
		Date d2 = new Date(2, 21, 2010);
		Date d3 = new Date(3, 25, 2012);
		Date d4 = new Date(4, 12, 2011);
		Date d5 = new Date(5, 14, 2014);
		Date d6 = new Date(6, 29, 2004);
		
		//writes the dates in a file and closes the file
		fileWriter.addDate(d1);
		fileWriter.addDate(d2);
		fileWriter.addDate(d3);
		fileWriter.addDate(d4);
		fileWriter.addDate(d5);
		fileWriter.addDate(d6);
		fileWriter.close();
		
		//prints out the dates in the file
		fileReader.printFile();
	}
}
