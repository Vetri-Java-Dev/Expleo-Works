/*Checking divisibility of a number by 7 and 8*/

package Arrays;
import java.util.*;

public class BlackWhiteNumber {
	
	public static boolean isBlack(int n) {
		return n%7==0;
	}
	
	public static boolean isWhite(int n) {
		return n%8==0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.print("Enter elements (-1 to stop): ");
		while(true) {
			int element=sc.nextInt();
			
			if(element<0)break;
			
			list.add(element);
		}
		
		int[] arr=new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		
		for(int i=0;i<list.size();i++) {
			if(isWhite(arr[i]) && isBlack(arr[i])) {
				arr[i]=-6;
			}
			else if(isBlack(arr[i])) {
				arr[i]=-2;
			}
			else if(isWhite(arr[i])) {
				arr[i]=-9;
			}
		}
		
		System.out.print(Arrays.toString(arr));
		
	}
}
