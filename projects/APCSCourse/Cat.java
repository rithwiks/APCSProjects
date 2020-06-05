public class Cat
{
	private String breed;
	private int age;
	private double weight;
	private char gender;
	private String name;
	
	public void setBreed( String dog_breed )
	{
		breed = dog_breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public void setAge( int dog_age )
        {
                age = dog_age;
        }
	
	public void setWeight( double dog_weight )
        {
                weight = dog_weight;
        }
	
	public void setGender( char dog_gender )
        {
                gender = dog_gender;
        }
	
	public void setName( String dog_name )
        {
                name = dog_name;
        }
	
	public int getAge()
        {
                return age;
        }
	
	public double getWeight()
        {
                return weight;
        }
	
	public char getGender()
        {
                return gender;
        }
	
	public String getName()
        {
                return name;
        }
	
	public String eat()
	{
		String a = "Munch Munch Munch";
		return a;
	}
	
	public String meow()
        {
                String b = "Meoooooooooooow";
                return b;
        }
}
