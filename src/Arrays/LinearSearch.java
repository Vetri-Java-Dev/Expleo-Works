/*Finding the target exists in the array or not*/

package Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static boolean isExist(int[] arr,int target) {
		for(int e : arr) {
			if(e==target)return true;
		}
		return false;
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
		
		System.out.print("Enter Target element : ");
		int target=sc.nextInt();
		
		System.out.print(isExist(arr,target));
	}

}
