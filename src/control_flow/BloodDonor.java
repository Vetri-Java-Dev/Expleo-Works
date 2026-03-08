package control_flow;
import java.util.Scanner;

public class BloodDonor {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//getting age
		System.out.print("Enter your Age : ");
		int age=sc.nextInt();
		
		//getting weight 
		System.out.print("Enter your Weight (kg) : ");
		float weight=sc.nextFloat();
		
		if((age > 18 && age < 55)
				&&weight > 45.0) {
			System.out.print("You are eligible.");
		}
		else {
			System.out.print("You are not eligible.");
		}
	}
}
