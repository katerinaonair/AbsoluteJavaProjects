
public abstract class Alien {

	protected int damage,health;
	protected String name;
	
	public Alien()
	{
		health = 0;
		name = "";
	}
	
	public Alien(int theHealth, String theName, int theDamage)
	{
		if( theName == null || theHealth == 0)
		{
			System.out.println("The data can't be null (name or type or health)");
			System.exit(0);
		}
		
		this.health = theHealth;
		this.name = theName;
		this.damage = theDamage;
	}
	
	public abstract int getDamage();
	
	
	public Alien(Alien originalObject)
	{
		name = originalObject.name;
		health = originalObject.health;
	}
	
	
	public int getHealth()
	{
		return health;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setHealth(int theHealth)
	{
		if(theHealth == 0)
		{
			System.out.println("The data can't be null (health)");
			System.exit(0);
		}
		else health = theHealth;
	}
	public void setName(String theName)
	{
		if(theName == null )
		{
			System.out.println("The data can't be null (name)");
			System.exit(0);
		}
		else name = theName;
	}
	public String toString()
	{
		return (name +  " alien health:" + health);
	}
	
	public boolean equals(Alien otherAlien)
	{
		return (name.equals(otherAlien.name)
				&& (health  == otherAlien.health)
				);
	}
	
	
	
}
