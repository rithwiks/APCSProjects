import java.util.*;
import java.io.*;
public class Unit12Lab3
{
        public static void main( String args[] )
        {
		//creates a tree map, scanner object, and variables. It prompts user for file name
		TreeMap<String, Contact> contacts = new TreeMap<String, Contact>();
		Scanner sc = new Scanner(System.in);
                System.out.println("What would you like to name the file (end in txt)");
                String input1 = sc.next();
		char input2;
		String first;
		String last;
		String number;
		String email;
			
		try{
			//creates a file, filewriter, and bufferedreader object
			File file = new File("/Users/rithwikseth/Documents/rithwik/projects/" + input1);
			FileWriter fw = new FileWriter("/Users/rithwikseth/Documents/rithwik/projects/" + input1);
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			//prompts the user for the first time and stores value
			System.out.println("Would you like to add a contact (a) delete a contact (d) or show the contacts (s)");
			input2 = sc.next().charAt(0);

			//loops until the user wants to see the file
			while (input2 != 's') 
			{
				//creates contact object and distinguishes between adding and deleting with if-else block
				Contact c1 = new Contact();
				if (input2 == 'a')
				{
					//prompts user and stores values
					System.out.println("Please type a first name");
					first = sc.next();
                                        System.out.println("Please type a last name");
                                        last = sc.next();
                                        System.out.println("Please type a phone number");
o                                        number = sc.next();
                                        System.out.println("Please type an email address");
                                        email = sc.next();
					
					//stores values in c1 object
					c1.setFirst(first);	
					c1.setLast(last);
					c1.setNumber(number);
					c1.setEmail(email);
					
					//puts last name and contact in treemap
					contacts.put(c1.getLast(), c1);
				}
				
				else if (input2 == 'd')
				{
					//prompts user, stores value, and removes from treemap
					System.out.println("Who do you want to remove (type their last name)");
					last = sc.next();
					contacts.remove(last);
				}
				//prompts user again
				System.out.println("Would you like to add a contact (a) delete a contact (d) or show the contacts (s)");
                        	input2 = sc.next().charAt(0);
			}
			
			//loops through treemap and writes everything in file. When loop is done, the file is closed
			for (Map.Entry contact : contacts.entrySet())
			{
				Contact c = contacts.get(contact.getKey());
				fw.write(contact.getKey() + ", " + c.getFirst() + ": " + c.getNumber() + ", " + c.getEmail() + "\t"); 
			}
			fw.close();
			
			//creates a variable to store each line from file and uses buffered reader to read the file. Prints out st every line
			String st; 
  			while ((st = br.readLine()) != null) 
    				System.out.println(st);
		} catch(Exception e){}   

	}
}
