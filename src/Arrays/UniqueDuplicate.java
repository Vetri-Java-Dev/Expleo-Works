/*Finding no of duplicate and unique*/

package Arrays;
import java.util.*;

public class UniqueDuplicate {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		
		HashSet<Integer> set=new HashSet<>();
		
		int uniqueCount=0;
		int duplicateCount=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			if(set.contains(arr[i])) {
				duplicateCount++;
			}
			else {
				uniqueCount++;
			}
			set.add(arr[i]);
		}
		
		System.out.println("Unique element count : "+uniqueCount);
		System.out.print("Duplicate element count : "+duplicateCount);
		
		
		
	}

}
