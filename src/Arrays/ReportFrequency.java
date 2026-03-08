/*Finding frequency of each element in an array*/

package Arrays;

import java.util.*;

public class ReportFrequency {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("Enter elements : ");
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		
		
		for(int e : map.keySet()) {
			System.out.println(e+"->"+map.get(e));
		}
		
		
	}
}
