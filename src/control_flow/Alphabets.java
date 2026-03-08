package control_flow;
import java.util.Scanner;

public class Alphabets {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		char start='a';
		
		for(int i=0;i<=26;i++) {
			
			//First letter
			System.out.print((char)(start+i));
			
			//Last letter
			System.out.print((char)(start+26-i-1));
			
			System.out.print(" ");
		}
	}
}
