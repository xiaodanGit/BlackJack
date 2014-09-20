package blackjack;

import basic.Card;
import basic.CardDeceroter;



public class BlackJackCard extends CardDeceroter implements Comparable<BlackJackCard>
{
	Card c;
	
	public BlackJackCard(int j) 
	{
		this.c = new Card(j);
		
	}

	public int getMaxValue()
	{
		if(c.getValue() >= 10)
		{
			return 10;
		}
		else if(c.getValue() == 1)
		{
			return 11;
		}
		else
		{
			return c.getValue();
		}
	}
	
	public int getMidValue()
	{
		if(c.getValue() >= 10)
		{
			return 10;
		}
		else if(c.getValue() == 1)
		{
			return 10;
		}
		else
		{
			return c.getValue();
		}
	}
	
	public int getMinValue()
	{
		if(c.getValue() >= 10)
		{
			return 10;
		}
		else if(c.getValue() == 1)
		{
			return 1;
		}
		else
		{
			return c.getValue();
		}
	}

	private Card getCard()
	{
		return c;
	}
	
	@Override
	public int compareTo(BlackJackCard o) 
	{
		return c.compareTo(o.getCard());
	}
	
	

}
