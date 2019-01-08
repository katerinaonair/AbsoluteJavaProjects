package figure;

public class Rectangle extends Figure {
	//Variable intances
	double height;
	double width;
	double center;
	
	@Override
	public void erase() {
		 System.out.println("Rectangle's class erase method.");
		
	}

	@Override
	public void draw() {
		 System.out.println("Rectangle's class draw method.");
		
	}

	@Override
	public void center() {
		System.out.println("Rectangle's class center method.");
        erase();
        draw();
		
	}

}
