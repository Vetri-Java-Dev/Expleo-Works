/* Removing duplicates and creating new array*/

package Arrays;
import java.util.*;

public class RemovingDuplicates {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		
		HashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			set.add(arr[i]);
		}
		
		int[] result=new int[set.size()];
		
		int index=0;
		for(int e : set) {
			result[index++]=e;
		}
		
		System.out.print("After removing duplicate : "
						+Arrays.toString(result));
		
	}
}
