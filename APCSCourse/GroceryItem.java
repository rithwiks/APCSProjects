public class GroceryItem
{
	//declares variables, creates 2 constructors, and setter and getter methods
	private int shelf_life;
	
	private int item_code;
	
	public GroceryItem() {}

	public GroceryItem(int k, int j)
	{
		item_code = k;
		shelf_life = j;
	}
	
	public void setLife(int i)
	{
		shelf_life = i;
	}
	
	public void setCode(int n)
	{
		item_code = n;
	}
	
	public int getLife()
	{
		return shelf_life;
	}
	
	public int getCode()
	{
		return item_code;
	}
}
