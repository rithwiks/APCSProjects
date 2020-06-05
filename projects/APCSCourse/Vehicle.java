public class Vehicle implements AllInterface
{
	//declares variables
        private String name;
	private int age;

	//creates setter and getter methods for variables
        public void setName( String s )
        {
                name = s;
        }

        public String getName()
        {
                return name;
        }
	
	public void setAge(int i)
	{
		age = i;
	}
	
	public int getAge()
	{
		return age;
	}

	//updates the methods from AllInterface with phrases with vehicle
	public void drawObject()
        {
                System.out.println("Drawing a Vehicle");
        }

        public void rotateObject()
        {
                System.out.println("Rotating a Vehicle");
        }

        public void resizeObject()
        {
                System.out.println("Resizing a Vehicle");
        }

        public void playSound()
        {
                System.out.println("Vehicle Sound");
        }

}


