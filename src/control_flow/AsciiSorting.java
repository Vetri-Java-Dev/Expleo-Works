package control_flow;
import java.util.Arrays;
import java.util.Scanner;

public class AsciiSorting {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		
		char[] charArray=str.toCharArray();
		
		Arrays.sort(charArray);
		
		System.out.print(new String(charArray));
	}
}
