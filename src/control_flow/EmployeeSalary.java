package control_flow;
import java.util.*;

public class EmployeeSalary {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Employee ID : ");
		int empId=sc.nextInt();
		
		System.out.print("Enter Employee Name : ");
		String empName=sc.nextLine();
		sc.nextLine();
		
		System.out.print("Enter per day wages : ");
		float wages=sc.nextFloat();
		
		System.out.print("Enter no of days worked : ");
		int daysWorked=sc.nextInt();
		
		System.out.print("Salary : "+(daysWorked*wages));
	}
}
