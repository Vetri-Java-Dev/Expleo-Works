//program to find sum of all odd and even numbers from lb to ub and difference
package functions;
import java.util.Scanner;

public class OddEvenSumDifference {
	
	public static int evenSum(int start,int end) {
		int evenSum=0;
		for(int i=start;i<=end;i++) {
			if((i&1)==0)evenSum+=i;
		}
		
		return evenSum;
	}
	
	public static int oddSum(int start,int end) {
		int oddSum=0;
		for(int i=start;i<=end;i++) {
			if((i&1)!=0)oddSum+=i;
		}
		
		return oddSum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Lower bound : ");
		int lb=sc.nextInt();
		
		System.out.print("Enter Upper bound : ");
		int ub=sc.nextInt();
		
		System.out.println("Even sum : "+evenSum(lb,ub));
		System.out.println("Odd sum : "+oddSum(lb,ub));
		
		System.out.println("Differencen of even and odd sum : "
		+(Math.abs(evenSum(lb,ub)-oddSum(lb,ub))));
	}
}
