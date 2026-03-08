package abstraction;
import java.util.Scanner;

abstract class Shape{
	void draw() {
		System.out.println("Drawing...");
	}
	
	public abstract void displayArea();
	public abstract void displayPerimeter();
}
class Rectangle extends Shape{
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	 public void displayArea() {
		System.out.println("Area of rectangle is "+(length*breadth));
	}

	@Override
	public void displayPerimeter() {
		System.out.println("Perimeter of rectangle is "+(2*(length+breadth)));
	}
	
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	public void displayArea() {
		System.out.println("Area of circle is "+(Math.PI*radius*radius));
	}

	@Override
	public void displayPerimeter() {
		System.out.println("Perimeter of circle is "+((2*Math.PI)*radius));
	}
	
}

class Square extends Shape{

	int side;
	
	public Square(int side) {
		this.side=side;
	}
	@Override
	public void displayArea() {
		System.out.println("Area of square is "+(side*side));
	}

	@Override
	public void displayPerimeter() {
		System.out.println("Area of square is "+(4*side));
	}
	
}

public class ShapeDemo {
	
	public static void main(String[] args) {
		
		Shape shape=new Rectangle(10,20);
		
		shape.displayArea();
		shape.displayPerimeter();
		
		System.out.println("");
		
		shape=new Circle(10);
		
		shape.displayArea();
		shape.displayPerimeter();
		
		System.out.println("");
		
		shape=new Square(10);
		
		shape.displayArea();
		shape.displayPerimeter();
	}
}
