package control_flow;
import java.util.Scanner;

public class CharInterpretation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Character : ");
		char c=sc.next().charAt(0);
		
		if(Character.isAlphabetic(c)) {
			System.out.print("Its an Alphabet.");
		}
		else if(Character.isDigit(c)) {
			System.out.print("Its a Digit.");
		}
		else {
			System.out.print("Its a Special character.");
		}
	}
}
