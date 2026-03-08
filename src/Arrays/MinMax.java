/*Finding min and max value in array*/

package Arrays;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		System.out.print("Enter elements : ");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			min=Math.min(min,arr[i]);
			max=Math.max(max, arr[i]);
		}
		
		System.out.println("Max : "+max);
		System.out.print("Min : "+min);
	}
}
