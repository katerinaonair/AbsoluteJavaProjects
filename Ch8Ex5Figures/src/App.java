import figure.Rectangle;
import figure.Triangle;

public class App {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		
		// Test methods
		
		triangle.draw();
		triangle.erase();
		System.out.println("\n");
		triangle.center();
		System.out.println("\n************\n");
		rectangle.draw();
		rectangle.erase();
		System.out.println("\n");
		rectangle.center();
		

	}

}
