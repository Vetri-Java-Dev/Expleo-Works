/*program to find over time salary calculation */

package functions;
import java.util.Scanner;

public class EmployeeOverTimeSalaryCalculation {
	
	public static int overTimePay(int hour) {
		if(hour>40)return (hour-40)*15;
		return 0;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] workHours=new int[5];
		
		for(int i=1;i<=5;i++) {
			System.out.print("Enter Employee "+i+" work hour : ");
			workHours[i]=sc.nextInt();
			
			int overTimePay=overTimePay(workHours[i]);
			
			if(overTimePay!=0) {
				System.out.println("Over time pay of Employee "+i+" : "+overTimePay);
			}
			else {
				System.out.println("No over time pay for Employee "+i);
			}
			System.out.println("");
		}
		
	}
}
