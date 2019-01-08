package figure;

public class Triangle extends Figure{
	double ribe1; 
	double ribe2;
	double base;
	double center;
	
	@Override
	public void erase() {
		 System.out.println("Triangle's class erase method.");
		
	}

	@Override
	public void draw() {
		 System.out.println("Triangle's class draw method.");
		
	}

	@Override
	public void center() {
		 System.out.println("Triangle's class center method.");
		 erase();
	     draw();
	}

}
