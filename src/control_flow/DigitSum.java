package control_flow;
import java.util.Scanner;

public class DigitSum {
	public static int digitSum(int n) {
		
		n = Math.abs(n); //handles negative integer
		int sum=0;
		
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		System.out.print(digitSum(sc.nextInt()));
		
	}
}
