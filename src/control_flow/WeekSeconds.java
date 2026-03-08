package control_flow;
import java.util.Scanner;

public class WeekSeconds {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int seconds=86400;
		int daysInWeek=7;
		
		int secondsPerWeek=seconds*daysInWeek;
		
		System.out.print(secondsPerWeek);
	}
}
