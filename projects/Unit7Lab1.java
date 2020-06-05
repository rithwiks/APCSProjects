/**
* This program gets a file and counts the number of chars, words, sentences, and paragraphs in it.
* @author Rithwik Seth
*/
import java.util.*;
import java.io.*;
public class Unit7Lab1 {
    	public static void main(String[] args) throws IOException {
		//determines if any conditions were added	
		if (args[0].charAt(0) == '-') {
			//creates new objects to help read the file
			File file = new File(args[1]);
                        FileInputStream fileStream = new FileInputStream(file);
                        InputStreamReader input = new InputStreamReader(fileStream);
                        BufferedReader reader = new BufferedReader(input);
			//initializes variables
			String line;
                        int character = 0;
                        int wordCount = 2;
                        int sentenceCount = 0;
                        int paragraphCount = 1;
			//loops through lines in file and counts the chars, words, sentences, and paragraphs depending on user input.
			while((line = reader.readLine()) != null)
                        {
                                if(line.equals("")) {
					if (args[0].contains("p")) {
                                        	paragraphCount++;
					}
                                }
                                if(!(line.equals(""))) {
					if (args[0].contains("c")) {
                                        	character += line.length();
					}
                                        for ( int i = 0; i < line.length(); i++ ) {
                                                if (args[0].contains("w")) {
							if(line.charAt(i) == ' ') {
                                                        	wordCount++;
                                                	}
						}
						if (args[0].contains("s")) {
                                                	if (line.charAt(i) == '.') {
                                                        	sentenceCount++;
                                                	}
						}
                                        }
				}	
			}
               		//prints what was asked for
			if (args[0].contains("c")) {
				System.out.println("There are " + character + " chars");
			}
			
			if (args[0].contains("w")) {	
				System.out.println("There are " + wordCount + " words");
			}
			
			if (args[0].contains("s")) {
				System.out.println("There are " + sentenceCount + " sentences");
			}
			
			if (args[0].contains("p")) {
				System.out.println("There are " + paragraphCount + " paragraphs");
			}
		}
		
		else {
			//creates new objects to help read the file
			File file = new File(args[0]); 
        		FileInputStream fileStream = new FileInputStream(file); 
        		InputStreamReader input = new InputStreamReader(fileStream); 
        		BufferedReader reader = new BufferedReader(input);
			//initializes variables
			String line;
			int character = 0;
			int wordCount = 2;
			int sentenceCount = 0;
			int paragraphCount = 1;
			//loops through lines in file and counts the chars, words, sentences, and paragraphs
			while((line = reader.readLine()) != null)
			{
				if(line.equals("")) {
	
					paragraphCount++;
				}
				if(!(line.equals(""))) {
					character += line.length();
					for ( int i = 0; i < line.length(); i++ ) {
						if(line.charAt(i) == ' ') {
							wordCount++;
						}
						else if (line.charAt(i) == '.') {
							sentenceCount++;
						}
					}
				}
			}
			//prints the number of each item
			System.out.println("There are " + character + " chars");
			System.out.println("There are " + wordCount + " words");
			System.out.println("There are " + sentenceCount + " sentences");	
			System.out.println("There are " + paragraphCount + " paragraphs");
		}
	}
}
