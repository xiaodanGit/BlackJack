package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import blackjack.BlackJackCard;



public class Deck
{
	List<Card> cards;
	private int dealIndex;
	
	public Deck(int setOfCards, GameName name)
	{
		cards = new ArrayList<Card>();
		dealIndex = 0;
		for(int i = 0; i < setOfCards; i++)
		{
			for(int j = 0; j < 52; j++)
			{
				Card c = null;
				switch(name)
				{
				case BlackJack: c = new BlackJackCard(j);
				}
				cards.add(c);
			} 
		}		
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	public Card deal()
	{
		Card ret = cards.get(dealIndex);
		dealIndex++;
		return ret;
	}
	
	public int getLeftCardsNumber()
	{
		return cards.size() - dealIndex;
	}

}
