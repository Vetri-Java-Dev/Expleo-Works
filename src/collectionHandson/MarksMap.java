package collectionHandson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class MarksMap {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Map<String, Integer> markList=new HashMap<String, Integer>();
		
		markList.put("Mano", 85);
		markList.put("Shan", 85);
		markList.put("John", 55);
		markList.put("Anu", 60);
		markList.put("Aju", 90);
		markList.put("Frank", 80);
		
		Stack<String> stack=new Stack<>();
		
		for(String name : markList.keySet()) {
			stack.push(name);
		}
		
		System.out.println("Student Marks above 75 in the stack:"
				);
		while(!stack.isEmpty()) {
			
			String name=stack.pop();
			
			if(markList.get(name)>75) {
				System.out.println(name);
			}
		}
	}
}
