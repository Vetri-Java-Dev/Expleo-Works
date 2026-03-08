//program to find greatest of three numbers

package functions;
import java.util.HashSet;
import java.util.Scanner;

public class GreatestOfThreeNumbers {
	
	public static int greatest(int a,int b,int c) {
		return Math.max(a, Math.max(b, c));
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter no of students placed in CS : ");
		int cs=sc.nextInt();
		
		System.out.print("Enter no of students placed in EC : ");
		int ec=sc.nextInt();
		
		System.out.print("Enter no of students placed in ME : ");
		int me=sc.nextInt();
		
		if(cs<0||ec<0||me<0) {
			System.out.print("Invalid input.");
			return;
		}
		
		if(cs==ec && ec==me) {
			System.out.print("None of the department has highest placements.");
		}
		else {
			int max=greatest(cs,ec,me);
			
			System.out.print("Highest Placement ");
			
			if(max==cs) {
				System.out.print("CS ");
			}
			if(max==ec) {
				System.out.print("EC ");
			}
			if(max==me) {
				System.out.print("ME ");
			}
			
			
		}
	}
}
