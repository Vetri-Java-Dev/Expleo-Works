/*Program to find sum of odd and even numbers */

package functions;
import java.util.Scanner;

public class OddEvenSum {
	
	
	public static void oddEvenSum(int[] arr) {
		int evenSum=0;
		int oddSum=0;
		
		for(int e : arr) {
			if((e&1)==0)evenSum+=e;
			else oddSum+=e;
		}
		
		System.out.println("Even sum : "+evenSum);
		System.out.print("Odd sum : "+oddSum);
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		oddEvenSum(arr);
	}
}
