package control_flow;
import java.util.Scanner;

public class PerfectFactorial {
	
	public static int isPerfectFact(int n) {
		int i=2;
		
		while(n>1) {
			if(n%i!=0) {
				return 0;
			}
			n/=i++;
		}
		
		return i-1;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a Factorial Number : ");
		int fact=sc.nextInt();
		
		if(fact<=0) {
			System.out.print("Invalid.");
			return;
		}
		
		int result=isPerfectFact(fact);
		
		if(result!=0) {
			System.out.print("Result : "+result);
		}
		else {
			System.out.print("It is not a Perfect Factorial.");
		}
		
	}
}
