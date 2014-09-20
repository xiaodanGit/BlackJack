package blackjack;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class BlackJackHand
{
	List<BlackJackCard> handCards;
	private static final int GOAL = 21;
	
	public BlackJackHand()
	{
		
	}
	
	
	public Set<Integer> getHandValue()
	{
		int max = 0, min = 0, mid = 0;
		Set<Integer> ret = new TreeSet<Integer>();
		for(int i = 0; i < handCards.size(); i++ )
		{
			max += handCards.get(i).getMaxValue();
			min += handCards.get(i).getMidValue();
			mid += handCards.get(i).getMidValue();
		}
		ret.add(max);
		ret.add(min);
		ret.add(mid);
		return ret;		
	}
	
	public boolean isBust()
	{
		boolean ret = true;
		Set<Integer> values = this.getHandValue();
		for(int i : values)
		{
			ret = ret && (i > 21);
		}
		return ret;
	}
	
	public void add(BlackJackCard card)
	{
		handCards.add(card);
	}
	

}
