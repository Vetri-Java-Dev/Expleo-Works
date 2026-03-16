package collection;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<String> list=new LinkedList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("C++");
		list.add("C#");
		list.add("Java script");
		
		System.out.println("List size : "+list.size());
		System.out.println("Linked list : "+list);
		
		list.remove(0);
		list.remove("Python");
		
		System.out.println("List size now : "+list.size());
		System.out.println("Linked list : "+list);
		
	}
}
