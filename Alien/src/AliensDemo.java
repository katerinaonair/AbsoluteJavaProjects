
public class AliensDemo {

	public static void main(String[] args) {
		AlienPack ap  =new AlienPack(3);
		
		ap.addAlien(new OgreAlien(10,"Mark"),0);
		ap.addAlien(new SnakeAlien(10,"Peter"),1);
		ap.addAlien(new MarshmallowManAllien(10,"John"),2);
		
		System.out.println("Total damages="+ap.calculateDamage());

	}

}
