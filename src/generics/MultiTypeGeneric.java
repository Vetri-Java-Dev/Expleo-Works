package generics;

class Test<T,U,V>{
	T object1;
	U object2;
	V object3;
	
	public Test(T object1, U object2, V object3) {
		this.object1 = object1;
		this.object2 = object2;
		this.object3 = object3;
	}
	
	public void display() {
		System.out.println("T type : "+object1);
		System.out.println("U type : "+object2);
		System.out.println("V type : "+object3);
	}
	
}
public class MultiTypeGeneric {
	public static void main(String[] args) {
		
		Test<Integer,String,Double> test=new Test<>(1,"test",1.0);
		
		test.display();
	}
}
