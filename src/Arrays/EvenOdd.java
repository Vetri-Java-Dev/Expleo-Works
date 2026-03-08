/*Sum of all even number and all odd numbers*/

package Arrays;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int evenSum=0;
		int oddSum=0;
		
		for(int e : arr) {
			if((e&1)==0) {
				evenSum+=e;
			}
			else {
				oddSum+=e;
			}
		}
		
		System.out.print("Even sum : "+evenSum);
		System.out.print("\nOdd sum : "+oddSum);
	}
}
