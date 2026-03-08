package control_flow;
import java.util.Scanner;

public class SeriesSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of i : ");
		int i=sc.nextInt();
		
		int index=1;
		int sum=0;
		
		do {
			sum+=index++;
		} while(index<=i);
		
		System.out.print("Sum of series : "+sum);
	}
}
