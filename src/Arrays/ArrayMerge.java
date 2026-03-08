/*Merge two array into a third array*/

package Arrays;
import java.util.*;

public class ArrayMerge {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter number of elements Array1: ");
		int n=sc.nextInt();
		
		int[] arr1=new int[n];
		
		System.out.print("Enter elements (Array 1) : ");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		
		
		System.out.print("Enter number of elements Array 2 : ");
		int m=sc.nextInt();
		
		int[] arr2=new int[m];
		
		System.out.print("Enter elements (Array 2) : ");
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[] result=new int[n+m];
		
		for(int i=0;i<n+m;i++) {
			if(i<n) {
				result[i]=arr1[i];
			}
			else {
				result[i]=arr2[i-m];
			}
		}
		
		System.out.print(Arrays.toString(result));
	}
}
