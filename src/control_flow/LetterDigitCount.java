package control_flow;
import java.util.Scanner;

public class LetterDigitCount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		
		int letter=0;
		int digit=0;
		int symbol=0;
		
		for(char c : str.toCharArray()) {
			
			if(Character.isAlphabetic(c))letter++;
			else if(Character.isDigit(c))digit++;
			else symbol++;
			
		}
		
		
		System.out.print("Letter : "+letter);
		System.out.print("Digit : "+digit);
		System.out.print("Symbol : "+symbol);
	}
}
