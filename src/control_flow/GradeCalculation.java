package control_flow;
import java.util.Scanner;

public class GradeCalculation {
	
	public static boolean validate(double n) {
		return n>=0 && n<=10;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double sum=0;
		int count=0;
		
		double grade;
		
		while(true) {
			
			System.out.print("Enter Exercise grade : ");
			double exercise=sc.nextDouble();
			
			System.out.print("Enter Exam grade : ");
			double exam=sc.nextDouble();
			
			if(exam==-1 && exercise==-1) {
				break;
			}
			
			if(!validate(exam)&&!validate(exercise)) {
				System.out.print("Invalid input.\nTry again.");
				continue;
			}
			
			if(exam>=5 && exercise>=5) {
				grade=(exam*0.70)+(exercise*0.30);
			}
			else {
				grade=Math.min(exercise, exam);
			}
			
			count++;
			sum+=grade;
		}
		
		if(count>0){
			System.out.println("Average Grade : "+(sum/count));
		}
		else {
			System.out.println("No student data entered.");
		}
	}
}
