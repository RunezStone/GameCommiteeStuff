package src;

import java.util.Scanner;

public class TheTable {
public static void main(String[] args)
{
	deckFunc deckFunctions = new deckFunc();


	Scanner scn = new Scanner(System.in);

	deckFunctions.populateDeck();

	int numOfPlayers;
	
	System.out.println("How many players are there?");
	numOfPlayers = scn.nextInt();
	
	System.out.println("How many cards would you like each player to draw?");
	 int numOfCards = scn.nextInt();
	 
	 //if there isn't enough cards for everyone, the game won't initiate
	 if((numOfPlayers * numOfCards) > 52)
	 {
		 System.out.println("Sorry! We don't have enough cards for everyone!");
	 }
	 
	 
	 else
	 {
	// we create an array with the variable "Player"
	Player[] player = new Player[numOfPlayers];
	
	//Naming each Player
	for(int i = 0; i < numOfPlayers; i++)
	{
		String tempVal = "";
		System.out.println("Player " + (i + 1) + " please enter your name.");
		tempVal = scn.next();
		player[i] = new Player(tempVal);
		System.out.println(tempVal + " has been added");
	}
	
	// Round for each player to draw 1 card at a time
	for(int round = 0; round < numOfCards; round++)
	{
		System.out.println("ROUND " + (round + 1));
		for(Player Player : player)
		{
			Card currCard = deckFunctions.drawCard();
			// after drawing a card, the table will show everyone what the player received, 
			//then it places it into the players hand
			System.out.println(Player.getPlayerName() + " drew a " + currCard.getCardName());
			Player.setCardToHand(currCard);

		}
	}
	
	// After rounds are over, the player's hand will read the cards and add up it's total.
	for(Player playerName : player)
	{
		System.out.println(playerName.getPlayerName() + " recieved: " + playerName.getPoints());
	} 
}
	
}
	


}
