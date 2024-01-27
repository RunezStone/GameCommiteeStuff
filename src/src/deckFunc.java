package src;

import java.util.ArrayList;
import java.util.Random;

public class deckFunc
{
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public Card drawCard()
	{
		Random rand = new Random();
		
		Card card = (deck.get(rand.nextInt(deck.size())));
		deck.remove(card);
		
		return card;
	}
	
	public void populateDeck()
    {
        String tempVal;

        for(int y = 0; y < 4; y++)
        {

        	for(int x = 1; x <= 13; ++x)
        	{
            tempVal = "";

            if((x == 1) || (x > 10))
            {
               tempVal = getWord(x);
            }
            else
            {
               tempVal = String.valueOf(x);
            }


            deck.add(new Card(tempVal, getSuit(x,y)));

        }

        }
    }

    private static String getWord(int x)
    {
        String word = "";
         if(x == 1)
         {
             word = "Ace";
         }
         else if(x == 11)
         {
             word = "Jack";
         }
         else if(x == 12)
         {
             word = "Queen";
         }
         else if(x == 13)
         {
             word = "King";
         }


        return word;
    }
    private static String getSuit(int x, int i)
    {
        String suit = "";


   if(i == 0)
   {
       suit = "clubs";
   }
   else if (i == 1)
   {
       suit = "diamonds";
   }
   else if (i == 2)
   {
       suit = "hearts";
   }
   else // i == 3
   {
       suit = "spades";
   }



   return suit;
    }

}