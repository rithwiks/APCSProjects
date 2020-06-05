public class Hand
{
	//creates a card array and other variables
	Card hand[] = new Card[52];
	private int cards_in_hand;
	int hand_value = 0;
	//adds a card to the array
	public void AddCard( Card new_card )
	{
		hand[cards_in_hand] = new_card;
		cards_in_hand++;
		
	}
	//displays all the cards in the array
	public void DisplayHand()
	{
		for( int i = 0; i < cards_in_hand; i++ )
		{
			System.out.print(hand[i].name + " ");
		}
		System.out.println();
	}
	//displays the value of the hand and uses a strategy to set the aces.
	public int HandValue()
	{
		int hand_value = 0;
		int ace_counter = 0;
		for(int i = 0; i < cards_in_hand; i++)
		{
			if( hand[i].face_value.equals("A"))
				ace_counter++;
			else
				hand_value += hand[i].bj_value;
		}
		//loops to make the aces 11 or 1 to depending if it makes the sum go above 21
		for(int j = 0; j < ace_counter; j++)
		{
			if(hand_value + 11 <= 21)
				hand_value += 11;
			else
				hand_value += 1;
		}
		return hand_value;	
	}
}
