//program to print prime from the interval lb to ub

package functions;
import java.util.Scanner;

public class PrimeInterval {
	public static boolean isPrime(int n) {
		
		if(n==1)return false;
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
		
	}
	
	public static void printPrime(int start,int end) {
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Lower bound : ");
		int lb=sc.nextInt();
		
		System.out.print("Enter Upper bound : ");
		int ub=sc.nextInt();
		
		if(lb>ub) {
			System.out.print("Invalid input.");
		}
		
		printPrime(lb,ub);
		
	}
}
