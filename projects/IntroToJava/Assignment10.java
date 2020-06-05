public class Assignment10
{

        public static void main(String[] args)
        {
		//intializes two variables and creates two dogs
		String dog1_fleas;
		String dog2_fleas;
		Dog d1 = new Dog();
		Dog d2 = new Dog();

		//Gets all the information from the user
		String name1 = Input.getString("Please enter a name for the first dog");
		String name2 = Input.getString("Please enter a name for the second dog");

		String breed1 = Input.getString("Please enter a breed for the first dog");
		String breed2 = Input.getString("Please enter a breed for the second dog");

		String gender1 = Input.getString("Please enter either male or female for the gender of the first dog");
		String gender2 = Input.getString("Please enter either male or female for the gender of the second dog");

		int age1 = Input.getInt("Please enter an age for the first dog");
		int age2 = Input.getInt("Please enter an age for the second dog");

		double weight1 = Input.getDouble("Please enter a weight for the first dog");
		double weight2 = Input.getDouble("Please enter a weight for the second dog");

		char fleas1 = Input.getChar("Please enter y or n to show if the first dog has fleas or not");
		char fleas2 = Input.getChar("Please enter y or n to show if the second dog has fleas or not");
		
		//sets all the attributes for the dogs
		d1.setName( name1 );
		d2.setName( name2 );
		d1.setBreed( breed1 );
		d2.setBreed( breed2 );
		d1.setGender( gender1 );
		d2.setGender( gender2 );
		d1.setAge( age1 );
		d2.setAge( age2 );
		d1.setWeight( weight1 );
		d2.setWeight( weight2 );
		d1.setFleas( fleas1 );
		d2.setFleas( fleas2 );

		//translates the character to see if the dog has fleas or not
		if (d1.fleas == 'y'){
			dog1_fleas = "does have";
		}
		else{
			dog1_fleas = "doesn't have";
		}

		if (d2.fleas == 'm'){
                        dog2_fleas = "does have";
                }
                else{
                        dog2_fleas = "doesn't have";
                }
		//prints out all the attributes
		System.out.println("The first dog's name is " + d1.name + ", breed is " + d1.breed + ", gender is " + d1.gender + ", age is " + d1.age + ", weight is " + d1.weight + ", and " + dog1_fleas + " fleas.");
		System.out.println("The second dog's name is " + d2.name + ", breed is " + d2.breed + ", gender is " + d2.gender + ", age is " + d2.age + ", weight is " + d2.weight + ", and " + dog2_fleas + " fleas.");
		//prints out the behaviors
		System.out.print(d1.name + ": "); d1.eat();
		System.out.print (d2.name + ": "); d2.eat();
		System.out.print(d1.name + ": "); d1.bark();
		System.out.print(d2.name + ": "); d2.bark();
		//finds out if the dog scratches or not
		if (d1.fleas == 'y'){
			System.out.print(d1.name + ": "); d1.scratching();
		}
		if (d2.fleas == 'y'){
                        System.out.print(d2.name + ": "); d2.scratching();
                }
	}

}
