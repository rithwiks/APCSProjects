public class ManipulateObjects
{
	public static void main( String[] args )
	{
		//creates a array with 2 animal objects and 2 vehicle objects
		AllInterface [] objects = { new Animal(), new Animal(), new Vehicle(), new Vehicle() };
		
		//uses setter methods to set values for variables
		objects[0].setName("Blue Whale");
		objects[1].setName("Polar Bear");
		objects[2].setAge(1);
		objects[2].setName("Tesla Cybertruck");
		objects[3].setName("BMW i8");
		objects[3].setAge(3);
		
		//uses a for loop to call the methods for all the objects in the array
		for(int i = 0; i < objects.length; i++)
		{
			objects[i].drawObject();	
			objects[i].resizeObject();
			objects[i].rotateObject();
			objects[i].playSound();
		}
	}
}
