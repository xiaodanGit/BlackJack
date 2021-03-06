package basic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import blackjack.BlackJackCard;



public abstract class Deck
{
	protected List<ICard> cards;
	protected int dealIndex;
	
	public Deck(int setOfCards)
	{
		cards = new ArrayList<ICard>();
		dealIndex = 0;
	
	}
	
	public void shuffle()
	{
		Collections.shuffle(cards);
	}
	
	public ICard deal() throws NoEnoughCardException
	{
		if(dealIndex >= cards.size())
		{
			throw new NoEnoughCardException("there is no enough card in deck");
		}
		ICard ret = cards.get(dealIndex);
		dealIndex++;
		return ret;
	}
	
	public int getLeftCardsNumber()
	{
		return cards.size() - dealIndex;
	}
	
	abstract public List<ICard> dealHand() throws NoEnoughCardException;
	

}
