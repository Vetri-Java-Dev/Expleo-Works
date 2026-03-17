 package collection;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		
		Vector<Integer> vector=new Vector<>(8,10);
	
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		
		//Exceeds capacity
		vector.add(9);
		vector.add(10);
		
		System.out.println("Vector : "+vector);
		System.out.println("Capacity : "+vector.capacity());
	}
}
