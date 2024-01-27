package src;

import java.util.ArrayList;

public class Player {
	private String playerName = "";
	private int points = 0;
	
	private ArrayList<Card> playerCards = new ArrayList<Card>();

	
	Hand handFunc = new Hand();
	
	public Player(String tempVal)
	{
		playerName = playerName.concat(tempVal);
		
	}

	public void setCardToHand(Card currCard)
	{
		playerCards.add(currCard);
	}
	
	
	// Hand Function receives the player's hand and adds it up, then returns it to the player who returns it to the table
	public int getPoints()
	{
		points = handFunc.getCardPoints(playerCards);
		return points;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
}
