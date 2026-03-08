/*Max sum of two arrays*/

package Arrays;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] arun=new int[10];
		int[] naveen=new int[10];
		
		int arunSum=0;
		int naveenSum=0;
		
		System.out.print("Enter Arun points : ");
		for(int i=0;i<10;i++) {
			arun[i]=sc.nextInt();
			
			arunSum+=arun[i];
		}
		
		System.out.print("Enter Naveen points : ");
		for(int i=0;i<10;i++) {
			naveen[i]=sc.nextInt();
			
			naveenSum+=naveen[i];
		}
		
		if(naveenSum>arunSum) {
			System.out.print("Naveen winss !!");
		}
		else if(naveenSum<arunSum){
			System.out.print("Arun winss !!");
		}
		else {
			System.out.print("Tie !!");
		}
		
	}
}
