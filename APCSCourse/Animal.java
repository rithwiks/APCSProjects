public class Animal implements AllInterface
{
	//declares variables
	private String name;
	private int n;
	
	//creates setter and getter methods for variables
	public void setName( String s )
	{
		name = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int n){}
	public int getAge(){ return n; }
	
	//updates methods from AllInterface to print phrases
	public void drawObject()
	{
		System.out.println("Drawing an Animal");
	}
	
	public void rotateObject()
        {
                System.out.println("Rotating an Animal");
        }
	
	public void resizeObject()
        {
                System.out.println("Resizing an Animal");
        }
	
	public void playSound()
        {
                System.out.println("Animal Sound");
        }
	
}
