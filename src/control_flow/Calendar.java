package control_flow;
import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Month (1-12) : ");
		int month=sc.nextInt();
		
		System.out.print("Enter Start Day (1-7) : ");
		int day=sc.nextInt();
		
		if(month>12||month<1||
				day>7||day<1) {
			System.out.print("Invalid input.");
			return;
		}
		
		
		int days;
		switch(month) {
			case 1,3,5,7,8,10,12 : 
				days=31;
				break;
			case 2:
				System.out.print("28 or 29 : ");
				days=sc.nextInt();
				break;
			default:
				days=30;
				
		}
		
		System.out.println("Mon Tue Wed Thur Fri Sat Sun");
		
		int j;
		for(j=0;j<day;j++) {
			System.out.print("   ");
		}
		
		int startDate=1;
		for(int i=j;i<=days+j-1;i++) {
			if(startDate<10) {
				System.out.print("0"+(startDate++)+"  ");
			}
			else {
				System.out.print((startDate++)+"   ");
			}
			
			if(i%7==0) {
				System.out.println("");
			}
		}
		
	}
}
