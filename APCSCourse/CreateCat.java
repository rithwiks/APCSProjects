public class CreateCat
{
	public static void main(String [] args)
	{
		Cat catOne = new Cat();
		Cat catTwo = new Cat();
		
		catOne.setName("Bob");
		catOne.setAge(8);
		System.out.println("Cat one is named " + catOne.getName() + " and is " + catOne.getAge() + " years old");

		catOne.setWeight(35.6);
                catOne.setAge(8);
                System.out.println("Cat one weighs " + catOne.getWeight() + " and is " + catOne.getAge() + " years old");
		System.out.println(catTwo.meow());	
	}
}
