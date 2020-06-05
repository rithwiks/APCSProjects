public class Project2
{
	public static void main(String args[])
	{
		char play_again;
		//the do while loop lets us repeat the game as many times as the user wants
		do{
			//declares all the objects and shuffles the deck
			Deck card_deck = new Deck();
			Card holder;
			Hand player = new Hand();
			Hand dealer = new Hand();
			card_deck.shuffle(52);
			//adds the cards to the hand and shows them as well as the value
			for( int i = 0; i < 2; i++ )
			{
				holder = card_deck.PickCard();
				player.AddCard( holder );	
			}
			System.out.print("Your cards are ");
			player.DisplayHand();
			int hand_value = player.HandValue();
			//checks to see if there is a winner
			if( hand_value == 21 )
				System.out.println("You win! Your cards have a value of " + hand_value);
			else if(hand_value > 21)
				System.out.println("You lose! Your cards have a value of " + hand_value);
			else
			{
				//picks cards for the dealer
				System.out.println("Your card value is " + hand_value);
				holder = card_deck.PickCard();
				dealer.AddCard(holder);
				System.out.print("The dealer's card is ");
				dealer.DisplayHand();
				holder = card_deck.PickCard();
				dealer.AddCard(holder);
				//gets the input for hit or stay and loops until user stays, loses, or wins
				String to_play = Input.getString("Please enter whether you want to hit or stay");
				while(to_play.equals("hit"))
				{
					holder = card_deck.PickCard();
					player.AddCard(holder);
					System.out.print("Your cards are ");
					player.DisplayHand();
					hand_value = player.HandValue();
					if( hand_value == 21 )
						break;
                			else if(hand_value > 21)
						break;
                			else
                	        		System.out.println("Your card value is " + hand_value);
					to_play = Input.getString("Please enter whether you want to hit or stay");
				}
				//checks to see if anyone has won yet
				if( hand_value == 21 )
                                	System.out.println("You win! Your cards have a value of " + hand_value);
                        	else if(hand_value > 21)
                                	System.out.println("You lose! Your cards have a value of " + hand_value);
                        	else
                		{ 
					//dealer begins to play. Cards are added continue until >17
					int hand_value2 = dealer.HandValue();
					do{
						if(hand_value2 < 17)
						{
							holder = card_deck.PickCard();
                                			dealer.AddCard(holder);
                                			System.out.print("The dealer's cars are ");
							dealer.DisplayHand();
                                			hand_value2 = dealer.HandValue();
							//sees if there is a winner
                                			if( hand_value2 == 21 )
                                			{       
                                        			System.out.println("You lose! The dealer's cards have a value of " + hand_value2);
                                        			break;
                                			}
                                			else if(hand_value2 > 21)
                                			{       
                                        			System.out.println("You win! The dealer's cards have a value of " + hand_value2);
                                        			break;
                                			}
                                			else if(hand_value2 > 17)
							{
								//finds the winner if ther is no 21 or above
                                        			System.out.println("The dealer's card value is " + hand_value2);
								if(hand_value2 > hand_value)
                                                                        System.out.println("The dealer wins!");
                                                        	else if (hand_value2 < hand_value)
                                                                        System.out.println("The player wins!");
                                                        	else if (hand_value2 == hand_value)
                                                                        System.out.println("It is a tie");
							}
						}
						else
                                                {
							//shows the winner if the dealer starts above 17
							if( hand_value2 == 21 )
                                                        {       
                                                                System.out.println("You lose! The dealer's cards have a value of " + hand_value2);
                                                                break;
                                                        }
                                                        else if(hand_value2 > 21)
                                                        {       
                                                                System.out.println("You win! The dealer's cards have a value of " + hand_value2);
                                                                break;
                                                        }

                                                        System.out.println("The dealer's card value is " + hand_value2);
                                                        if(hand_value2 > hand_value)
                                                                        System.out.println("The dealer wins!");
                                                        else if (hand_value2 < hand_value)
                                                                        System.out.println("The player wins!");
                                                        else if (hand_value2 == hand_value)
                                                                        System.out.println("It is a tie");
                                                }
					} while( hand_value2 < 17 );
				}
			}
			//gets input to find out if the user wants to play again
			play_again = Input.getChar("Please enter y or n to tell us if you would like to play again");
			System.out.println();
		}while(play_again == 'y');	
	}
}
