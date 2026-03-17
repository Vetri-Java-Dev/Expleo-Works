package collectionHandson;

import java.util.ArrayList;
import java.util.Scanner;

public class NameLength {
	
	public static void main(String[] args) {
		
		ArrayList<String> nameList=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many names do you want to input? ");
		int n=sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter name#"+(i+1)+" :");
			nameList.add(sc.nextLine());
		}
		
		System.out.println("Names longer than 5 characters :");
		
		for(String string : nameList) {
			if(string.length()>=5) {
				System.out.println(string);
			}
		}
		
	}
}
