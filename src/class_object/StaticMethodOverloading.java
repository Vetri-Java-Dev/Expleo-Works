package class_object;

class Mathametic{
	static int add(int a,int b) {
		return a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
}
public class StaticMethodOverloading {
	
	public static void main(String[] args) {
		
		System.out.println("Adding integer : "+Mathametic.add(10, 20));
		System.out.println("Adding double : "+Mathametic.add(10.0, 20.0));
	}

}
