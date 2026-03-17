package collectionHandson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StringSet {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Set<String> set=new HashSet<>();
		
		set.add("Java ");
		set.add("Hello ");
		set.add("Programming ");
		set.add("World ");
		
		Iterator<String> itr=set.iterator();
		
		StringBuilder result=new StringBuilder();
		
		while(itr.hasNext()) {
			
			String value=itr.next();
			
			System.out.print("Elements in the Set : "+value);
			result.append(value);
			
			System.out.println("");
		}
		
		System.out.println(result);
	}
}
