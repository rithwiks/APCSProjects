public class Assignment11
{
	public static void main(String[] args)
        {
		int array_num = Input.getInt( "Please enter how many superheroes you want to create." );
		Superhero [] heroArray = new Superhero[array_num];
		// finds out hamny superhero objects to create
		for( int i = 0; i < heroArray.length; i++ )
		{
			//loops through each superhero object and gets the input for the values.
			heroArray[i] = new Superhero();
			String name = Input.getString( "Please enter the name of superhero " + (i + 1));
			String suit = Input.getString( "Please enter 'does' or 'doesn't' to tell us if superhero " + (i + 1) + " is wearing his supersuit." );
			if ( suit.equals( "does" ))
			{	
				String suit_descript = Input.getString( "Please enter the description of the suit that is worn by superhero " + (i + 1));
				heroArray[i].SetHeroDescript( suit_descript );
			}
			String cape = Input.getString( "Please enter does or doesn't to tell us if superhero " + (i + 1) + " is wearing his cape." );
			String power = Input.getString( "Please enter does or doesn't to tell us if superhero " + (i + 1) + " is using his superpower." );
			if ( power.equals( "does" ))
                        {
			        String super_power = Input.getString( "Please describe the superpower that is being used by superhero " + (i + 1));
			        heroArray[i].SetSuperPower( super_power );
			}
			int byear = Input.getInt( "Please enter the birth year of superhero " + (i + 1));
			int bmonth = Input.getInt( "Please enter the birth month of superhero " + (i + 1));
			int bday = Input.getInt( "Please enter the birth day of superhero " + (i + 1));
			//Sets all the attributes for each superhero
			heroArray[i].SetHeroName( name );
			heroArray[i].SetHeroSuit( suit );
			heroArray[i].SetHeroCape( cape );
			heroArray[i].SetPower( power );
			heroArray[i].SetDate( bmonth, byear, bday );
			//prints all the attributes depending on some of the attributes for all the superheroes.
			if ((power.equals( "does" )) && (( suit.equals( "does" ))))
				System.out.println( "This superhero's name is " + heroArray[i].hero_name + ", has a suit which is described as " + heroArray[i].suit_descript + ", " + heroArray[i].cape + " have a cape, is using his superpwer, which is " + heroArray[i].super_power + " and the superhero's birhtday is " + heroArray[i].GetDateString() );
			else if (( power != "does") && ( suit != "does" ))
                                System.out.println( "This superhero's name is " + heroArray[i].hero_name + ", does not have a suit, " + heroArray[i].cape + " have a cape, is not using his superpwer, and the superhero's birhtday is " + heroArray[i].GetDateString() );
			else if ((power.equals( "does" )) && ( suit != "does" ))
                                System.out.println( "This superhero's name is " + heroArray[i].hero_name + ", does not have a suit, " + heroArray[i].cape + " have a cape, is using his superpwer, which is " + heroArray[i].super_power + " and the superhero's birhtday is " + heroArray[i].GetDateString() );
			else if (( power != "does") && (( suit.equals( "does" ))))
                                System.out.println( "This superhero's name is " + heroArray[i].hero_name + ", has a suit which is described as " + heroArray[i].suit_descript + ", " + heroArray[i].cape + " have a cape, is not using his superpower, and the superhero's birhtday is " + heroArray[i].GetDateString() );
		}
	}
}
