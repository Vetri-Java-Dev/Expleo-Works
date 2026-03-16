package collection;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
	
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		
		stack.push(50);
		
		stack.remove(2);
		
		stack.add(2,7);
		
		System.out.println("Stack : "+stack);
		System.out.println("Capacity : "+stack.capacity());
		
	}
}
