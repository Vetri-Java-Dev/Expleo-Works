package generics;

class Demo<T>{
	private T t;
	
	public void set(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	
}
public class GenericDemo {
	
	public static void main(String[] args) {
		
		Demo<Integer> intObj=new Demo<>();
		
		intObj.set(25);
		
		Demo<String> strObj=new Demo<>();
		
		strObj.set("Hello");
		
		System.out.println(intObj.get());
		System.out.println(strObj.get());
		
	}
}
