
public class Card implements Comparable<Card>
{
	private int value;
	Suit suit;
	
	public Card(int value, Suit suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public Card(int cardNumber)
	{
		int suitNo = cardNumber / 13;
		value = cardNumber % 13;
		suit = Suit.createSuit(suitNo);
	}
	
	private int getCardNumber()
	{
		return 13* suit.getValue() + value;
	}

	public int getValue()
	{
		return value;
	}

	@Override
	public int compareTo(Card o) 
	{
		return this.getCardNumber() - o.getCardNumber();
	}
	
	

}
