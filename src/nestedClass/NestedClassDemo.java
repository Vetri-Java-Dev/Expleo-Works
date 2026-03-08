package nestedClass;

class Outer1{
	void greet() {
		System.out.println("Hello....");
	}
	
	class Inner{
		void Thank() {
			System.out.println("Thank you....");
		}
	}
}

public class NestedClassDemo {
	public static void main(String[] args) {
		
		Outer1 outer=new Outer1();
		
		outer.greet();
		
		Outer1.Inner inner=outer.new Inner();
		
		inner.Thank();
	}
}
