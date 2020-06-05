import java.io.*;
public class MyFileReader
{
	//Creates a file assigned to the same file as the file writer, a bufferedreader, and a string
	File file = new File("/Users/rithwikseth/Documents/rithwik/projects/myClass.txt");
	BufferedReader br;
	private String st;
	
	//when the object filereader is created, it creates the buffered reader
	public MyFileReader()
	{
		try {
			br = new BufferedReader(new FileReader(file));
		}catch(Exception e){}
	}
	
	//reads the file and prints what it reads
	public void printFile()
	{
		try{
			while ((st = br.readLine()) != null) 
    				System.out.println(st); 
		}catch(Exception e){}
	}
}
