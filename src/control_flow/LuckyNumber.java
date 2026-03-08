package control_flow;
import java.util.Scanner;

public class LuckyNumber {
	
	public static boolean isDivisible(int n,int dividant) {
		return n%dividant==0;
	}
	
	public static int sum(int n) {
		int sum=0;
		
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 4-Digit number : ");
		int n=sc.nextInt();
		
		if(n<1000||n>9999) {
			System.out.print(n+" is not a valid number.");
			return;
		}
		
		int sum=sum(n);
		
		if(isDivisible(sum,3)||isDivisible(sum,5)
				||isDivisible(sum,7)) {
			System.out.print("Lucky number.");
		}
		
		else {
			System.out.print("Sorry it’s not my lucky number");
		}
		
		
	}
}
