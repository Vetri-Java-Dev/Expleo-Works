/*Finding duplicate element in an array*/

package Arrays;
import java.util.*;

public class DuplicateElement {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		HashSet<Integer> set=new HashSet<>();
		
		
		System.out.print("Duplicate elements : ");
		for(int e : arr) {
			if(set.contains(e)) {
				System.out.print(e+" ");
			}
			else {
				set.add(e);
			}
		}
		
		
	}
}
