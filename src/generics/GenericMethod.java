package generics;

public class GenericMethod {
	static<T> void Display(T element) {
		
		System.out.println(element);
		System.out.println(element.getClass().getName()+" = "+element);
		
	}
	
	public static void main(String[] args) {
		
		Display(10);
		Display("Hello");
		Display(1.00);
		
	}
}
