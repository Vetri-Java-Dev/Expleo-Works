package strings;

import java.util.Scanner;

public class TrailingAndTailingSpace {
	public static String myTrim(String str) {
		
		String[] words=str.split(" ");
		
		String result="";
		
		for(int i=0;i<words.length-1;i++) {
			result+=words[i];
		}
		
		return result+words[words.length-1];
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String : ");
		
		System.out.println(myTrim(sc.nextLine()));
		
	}
}
