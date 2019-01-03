
public class AlienPack {
	private Alien[] aliens;
	
	public AlienPack(int numAliens)
	{
		aliens = new Alien[numAliens];
	}
	
	public void addAlien(Alien newAlien, int index)
	{
		aliens[index] = newAlien;
	}
	public Alien[] getAliens()
	{
		return aliens;
	}
	public int calculateDamage()
	{
		int d = 0;
		for(int i=0;i<aliens.length;i++)
			d += aliens[i].getDamage();
		return d;
	}
}
