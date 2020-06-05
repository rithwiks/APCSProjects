public class Assignment7_part1
{
        public static void main(String[] args)
        {
		// the first four lines declare and get input for the four variables
		float earth_weight = Input.getFloat( "Please enter a weight on Earth" );
		float earth_weight2 = Input.getFloat( "Please enter another weight on Earth" );
		float moon_weight = Input.getFloat( "Please enter a weight on the moon" );
		float mars_weight = Input.getFloat( "Please enter a weight on Mars" );
		// the next four lines call the methods and use the variables as arguements
		earth_to_moon( earth_weight );
		earth_to_mars( earth_weight2 );
		moon_to_earth( moon_weight );
		mars_to_earth( mars_weight );
	}
	// this method calculates the weight of something on the moon given a weight from Earth	
	public static void earth_to_moon( float x )
	{
		double y = (x / 9.81) * 1.622;
		System.out.println(x + " pounds on Earth is equal to " + y + " pounds on the moon");
	}
	// this method calculates the weight of something on Mars given a weight from Earth
        public static void earth_to_mars( float x )
        {
                double y = (x / 9.81) * 3.711;
                System.out.println(x + " pounds on Earth is equal to " + y + " pounds on Mars");
        }
	// this method calculates the weight of something on Earth given a weight from the moon
        public static void moon_to_earth( float x )
        {
                double y = (x / 1.622) * 9.81;
                System.out.println(x + " pounds on the moon is equal to " + y + " pounds on Earth");
        }
	// this method calculates the weight of something on Earth given a weight from Mars
        public static void mars_to_earth( float x )
        {
                double y = (x / 3.711) * 9.81;
                System.out.println(x + " pounds on Mars is equal to " + y + " pounds on Earth");
        }
}	

