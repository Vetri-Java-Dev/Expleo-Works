package interfaces;

class Circle implements Shape{
	
	private double radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	Circle(){
		this.radius=DEFAULT_VALUE;
	}

	@Override
	public void getArea() {
		System.out.println("Area of circle is "+(Math.PI*radius*radius));
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of circle is "+((2*Math.PI)*radius));
	}
	
	@Override
	public void getDescription() {
		System.out.println("This is circle.");
	}


}
