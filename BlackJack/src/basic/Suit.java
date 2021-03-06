package basic;

public enum Suit 
{
	Club(0), Heart(1), Spade(2), Diamond(3);
	
	private int value;
	
	Suit(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static Suit createSuit(int value)
	{
		if(value == 0)
		{
			return Suit.Club;
		}
		else if(value == 1)
		{
			return Suit.Heart;
		}
		else if(value == 2)
		{
			return Suit.Spade;
		}
		else if(value == 3)
		{
			return Suit.Diamond;
		}
		else
		{
			return null;
		}
	}

}
