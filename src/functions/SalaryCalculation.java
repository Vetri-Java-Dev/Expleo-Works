/*Program to find salary after hike*/

package functions;
import java.util.Scanner;

public class SalaryCalculation {
	
	public static double calculateSalary(double salary,int hike) {
		return salary+(salary*hike/100);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter old salary per month : ");
		double oldSalary=sc.nextDouble();
		
		System.out.print("Enter hike (%) : ");
		int hike=sc.nextInt();
		
		System.out.print("New Salary after hike : "+calculateSalary(oldSalary,hike));
		
	}
}
