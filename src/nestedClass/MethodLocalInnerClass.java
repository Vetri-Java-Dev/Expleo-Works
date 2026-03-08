package nestedClass;

class Outer{
	
	int num=10;
	
	void displayOuter() {
		System.out.println("Outer class method.");
		
		class Inner{
			
			void displayInner() {
				System.out.println("Inner class method.");
				System.out.println("Accesing outer class value = "+num);
			}
		}
		
		Inner inner=new Inner();
		inner.displayInner();
	}
	
}
public class MethodLocalInnerClass {
	
	public static void main(String[] args) {
		
		Outer outer=new Outer();
		
		outer.displayOuter();
	}
	
}
