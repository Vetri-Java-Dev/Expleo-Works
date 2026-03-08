package control_flow;
import java.util.Scanner;

public class Divisor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		
		if(n!=0&&7%n==0) {
			System.out.print("Divisor of seven.");
		}
		else {
			System.out.print("Not a Divisor of seven.");
		}
	}
}
