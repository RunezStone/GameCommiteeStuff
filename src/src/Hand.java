package src;

import java.util.ArrayList;


public class Hand {

	public int getCardPoints(ArrayList<Card> hand)
	{
		int points = 0;

		for(Card currCard: hand)
		{
			
			points = points + currCard.getCardValue();				
		}

		return points;
	}
		
	}
	
	
