/*Searching and counting a element in an array*/
package Arrays;
import java.util.*;

public class SearchAndCount {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 25 numbers randomly : ");
		
		int[] arr=new int[25];
	
		for(int i=0;i<25;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter Target element : ");
		int target=sc.nextInt();
		
		int count=0;
		for(int e : arr) {
			if(e==target) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.print(target+" occured "+count+" times.");
		}
		else {
			System.out.print("Not exists.");
		}
	}
}
