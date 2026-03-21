package abstraction;
import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		
		int min=Integer.MAX_VALUE; //247768568
		int max=Integer.MIN_VALUE; //-24789689
		
		for(int n : arr) {
			min=Math.min(min, n);
			max=Math.max(max, n);	
		}
		
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}
	
}
