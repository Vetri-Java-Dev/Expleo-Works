package control_flow;
import java.util.Scanner;

public class BrowsingBill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Hour : ");
		int hour=sc.nextInt();
		
		System.out.print("Enter the Minute : ");
		int minute=sc.nextInt();
		
		if(hour>7) {
			System.out.print("Browsing more than 7 hour is not allowed.");
			return;
		}
		
		float total;
		
		if(hour<5) {
			total=(hour*50)+(minute*1);
		}
		else {
			total=((hour-5)*50)+(minute*1)+200;
		}
		
		System.out.print("Total amount : "+total);

	}
}
