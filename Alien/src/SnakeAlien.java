
public class SnakeAlien extends Alien {

	
	public SnakeAlien()
	{
		super();
		damage = 0;
	}
	
	public SnakeAlien(int theHealth, String theName)
	{
		super(theHealth, theName, 200);
		
	}
	
	public int getDamage()
	{
		return this.damage;
	}
	
	public void setDamage(int newDamage)
	{
		if(newDamage >= 0)
			damage = newDamage;
		else
		{
			System.out.println("The data can't be < 0 (damage)");
			System.exit(0);
		}
		
	}
	public String toString()
	{
		return (getName() +  " alien health:" + getHealth() + " damage: "+ damage );
	}
	
	public boolean equals(SnakeAlien other)
	{
		return (getName().equals(other.getName()) 
				&& health == other.getHealth()
				&& damage == other.getDamage()
				);
	}
}
