

public class Damage
{
	private double randomDamage;	//cannot be equal to 5
	private double conditionalDamage;
	
	public Damage(double randomDamage, double conditionalDamage)
	{
		this.randomDamage = randomDamage;
		this.conditionalDamage = conditionalDamage;
	}

	public double getRandomDamage()
	{
		return randomDamage;
	}

	public void setRandomDamage(double randomDamage)
	{
		this.randomDamage = randomDamage;
		if (this.randomDamage){
		
		}
	}
	
	public double getConditionalDamage()
	{
		return conditionalDamage;
	}
	
	public void setConditionalDamage(double conditionalDamage)
	{
		this.conditionalDamage = 0.5 * conditionalDamage;
	}

	public double calculateTotalDamage()
	{
		return randomDamage - conditionalDamage;
	}

}
