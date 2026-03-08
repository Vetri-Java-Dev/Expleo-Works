package control_flow;
import java.util.Scanner;

public class GrossSalary {
	public static float percentage(float n,int percentage) {
		return n*percentage/100;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		float salary=sc.nextFloat();
		
		float grossSalary;
		
		if(salary<=10000) {
			
			float hra=percentage(salary,20);
			float da=percentage(salary,80);
			
			grossSalary=salary+hra+da;
		}
		else if(salary<20000) {
			
			float hra=percentage(salary,25);
			float da=percentage(salary,90);
			
			grossSalary=salary+hra+da;
		}
		else {
			
			float hra=percentage(salary,30);
			float da=percentage(salary,90);
			
			grossSalary=salary+hra+da;
		}
		
		System.out.print("Gross Salary : "+grossSalary);
	}
}
