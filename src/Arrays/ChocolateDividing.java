/* Calculating whether existing chocolates can be shared equally*/
package Arrays;
import java.util.Scanner;

public class ChocolateDividing {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter No of friends : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter No of choloates they had : ");
		
		int sumChocolates=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sumChocolates+=arr[i];
		}
		
		if(sumChocolates%n==0) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		
	}
}
