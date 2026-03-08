package control_flow;
import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the character : ");
		char c=sc.next().charAt(0);
		
		switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Its Vowel.");
				break;
			default : 
				if(Character.isAlphabetic(c)) {
					System.out.print("Its Consonant.");
					break;
				}
				else if(Character.isDigit(c)) {
					System.out.print("Its Number.");
				}
				else{
					System.out.print("Its Symbol.");
				}
		}
	}
}
