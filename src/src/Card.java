package src;

public class Card {

	private String suit;
	private String value;
	
	public Card(String Value, String Suit)
	{
		value = Value;
		suit = Suit;
	}
	
	public String getCardName()
	{
		String name = value + " of " + suit;
		return name;
	}
	
	public int getCardValue()
	{
		int cardValue;
		if((value.compareTo("King") == 0) || (value.compareTo("Queen") == 0) || (value.compareTo("Jack") == 0))
		{
			cardValue = 10;		}
		else if(value.compareTo("Ace") == 0)
		{
			cardValue = 11;
		}
		else
		{
			cardValue = Integer.valueOf(value);
		}
		
		return cardValue;
	}
}
