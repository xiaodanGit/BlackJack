
public class Card implements Comparable<Card>
{
	private int value;
	Suit suit;
	
	public Card(int value, Suit suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	private int getValue()
	{
		return 13* suit.getValue() + value;
	}


	@Override
	public int compareTo(Card o) 
	{
		return this.getValue() - o.getValue();
	}

}
