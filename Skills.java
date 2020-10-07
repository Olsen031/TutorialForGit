
public enum Skills
{
	ROCK_THROW,
	SCISSORS_POKE,
	PAPER_CUT;
	
	@Override
	public String toString()
	{		
		return Utils.convertEnumString(this.name());
	}

}
