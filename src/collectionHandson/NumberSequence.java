package collectionHandson;

import java.util.ArrayList;
import java.util.Scanner;

import functions.BloodDonationEligibility;

public class NumberSequence {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String num="";
		
		ArrayList<Integer> list=new ArrayList<>();
		
		while(!num.toLowerCase().equals("done")) {
			System.out.print("Enter a number (or type 'done' to finish) : ");
			
			try {
				list.add(Integer.parseInt(num));
			}
			catch(Exception exception) {}
		}
	}
}
