package control_flow;
import java.util.Scanner;

public class Armstrong {
	public static int len(int n) {
		int len=0;
		
		while(n>0) {
			len++;
			n/=10;
		}
		
		return len;
	}
	
	public static boolean isArmstrong(int n) {
		
		int sum=0;
		int temp=n;
		int len=len(n);
		
		while(temp>0) {
			sum+=(int)Math.pow(temp%10,len);
			temp/=10;
		}
		
		return sum==n;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		
		if(isArmstrong(n)) System.out.print("This is an Armstrong number.");
		
		else System.out.print("This is not an Armstrong number.");
	}
}
