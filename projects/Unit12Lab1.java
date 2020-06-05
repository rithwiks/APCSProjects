import java.util.*;
public class Unit12Lab1
{
	public static void main( String args[] )
	{
		//creates 2 array list with a grocery item type, and variables. Also creates a gorcery item and random object
		ArrayList<GroceryItem> groceryUnder = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> groceryOver = new ArrayList<GroceryItem>();
		int value;
		GroceryItem g1 = new GroceryItem();
		Random rnGenerator = new Random(12345678);
		
		//loops 50 times to give a grocery item a random value and number, and decides whether the value is less than or equal to 7 or greater. It is then added to an arraylist.
		for(int i=0; i<50; i++)
		{
			value = rnGenerator.nextInt(30) + 1;
			g1 = new GroceryItem(i+1, value);
			if (value <= 7)
				groceryUnder.add(g1);
			else if (value > 7)
				groceryOver.add(g1);	
		}
		
		//prints the number of items in each array list and loops to print each items code
		System.out.println("Number of items with shelf lives that are 7 or less: " + groceryUnder.size());
		
		for (int k = 0; k < groceryUnder.size(); k++)
		{
			g1 = groceryUnder.get(k);
			System.out.println(g1.getCode());
		}
		
		System.out.println("Number of items with shelf lives that are greater than 7 and less than or equal to 30: " + groceryOver.size());

                for (int j = 0; j < groceryOver.size(); j++)
                {
                        g1 = groceryOver.get(j);
                        System.out.println(g1.getCode());
                }
		
	}
}
		
