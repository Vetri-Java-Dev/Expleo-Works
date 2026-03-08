//program to find the increment based on their appraisal rating

package functions;
import java.util.Scanner;

public class SalaryIncrement {
	
	public static double increment(double salary,float rate) {
		
		if(rate<=4)return (salary*10)/100;
		else if(rate<=7)return (salary*25)/100;
		
		return (salary*30)/100;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Salary : ");
		double salary=sc.nextDouble();
		
		System.out.print("Enter Appraisal rating (1-10) : ");
		float rate=sc.nextFloat();
		
		if(salary<=0||(rate<1 && rate>10)) {
			System.out.print("Invalid input.");
			return;
		}
		
		System.out.print("Incremented salary : "+(salary+increment(salary,rate)));
	}
}
