/*Program to find whether his/her is eligible for voting*/

package functions;
import java.util.Scanner;

public class VotingSystem {
	
	public static boolean isEligible(int age) {
		if(age<18)return false;
		else if(age>100)return false;
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		
		if(isEligible(age)) {
			System.out.print("You are eligible for voting.");
		}
		else {
			System.out.print("You are no eligible for voting.");
		}
	}
}
