package interfaces;

public class Rectangle implements Shape{

	private double length;
	private double breadth;
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	public Rectangle() {
		this.length=DEFAULT_VALUE;
		this.breadth=DEFAULT_VALUE;
	}
	
	@Override
	 public void getArea() {
		System.out.println("Area of rectangle is "+(length*breadth));
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of rectangle is "+(2*(length+breadth)));
	}
	
	@Override
	public void getDescription() {
		System.out.println("This is rectangle.");
	}

}
