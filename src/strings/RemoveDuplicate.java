package strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {
	public static String remove(String str) {
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(char c : str.toCharArray())set.add(c);
		
		String result="";
		
		for(char c : set)result+=c;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		
		System.out.println("Distinct string : "+remove(str));
	}
}
