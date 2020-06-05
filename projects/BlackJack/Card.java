public class Card
{
	//declares the variables
	boolean dealt;
	int bj_value;
	String face_value;
	char suite;
	String name;
	String suite_as_string = String.valueOf(suite);
	//creates constructor for card
	public Card( int a, String b, char c)
	{
		bj_value = a;
		face_value = b;
		suite = c;
		name = face_value + "-" + suite;
	}
	//Sets dealt
	public void SetDealt( boolean a )
	{
		dealt = a;
	}

}
