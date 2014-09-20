


public class BlackJackCard extends Card
{
	
	public BlackJackCard(int cardNumber) 
	{
		super(cardNumber);
		
	}

	public int getMaxValue()
	{
		if(this.getValue() >= 10)
		{
			return 10;
		}
		else if(this.getValue() == 1)
		{
			return 11;
		}
		else
		{
			return this.getValue();
		}
	}
	
	public int getMidValue()
	{
		if(this.getValue() >= 10)
		{
			return 10;
		}
		else if(this.getValue() == 1)
		{
			return 10;
		}
		else
		{
			return this.getValue();
		}
	}
	
	public int getMinValue()
	{
		if(this.getValue() >= 10)
		{
			return 10;
		}
		else if(this.getValue() == 1)
		{
			return 1;
		}
		else
		{
			return this.getValue();
		}
	}
	
	

}
