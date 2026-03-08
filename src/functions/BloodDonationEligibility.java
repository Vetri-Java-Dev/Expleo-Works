/*Program to find whether his/her is eligible for donating blood*/

package functions;
import java.util.Scanner;

public class BloodDonationEligibility {
	
	public static boolean isEligible(int age,int weight) {
		
		if(age>=18 && age<=55 && weight>45)return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		
		System.out.print("Enter your weight : ");
		int weight=sc.nextInt();
		
		if(isEligible(age,weight)) {
			System.out.print("You are eligible for donating blood.");
		}
		else {
			System.out.print("You are no eligible for donating blood.");
		}
	}
}
