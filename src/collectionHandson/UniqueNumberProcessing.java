package collectionHandson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UniqueNumberProcessing {
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		Scanner sc=new Scanner(System.in);
		
		TreeSet<Integer> set=new TreeSet<>();
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		int sum=0;
		
		while(true){
			String num=sc.next();
			
			if(num.equalsIgnoreCase("done"))break;
			
			try {
				int n=Integer.parseInt(num);
				set.add(n);
				
				sum+=n;
				
				min=Math.min(min, n);
				max=Math.max(max, n);
				
			}
			catch(Exception e) {
				System.out.println("Invalid input.");
				break;
			}
			
			System.out.println("");
			
		}
		
		System.out.println("Sorted unique numbers : "+set);
		System.out.println("Average : "+(sum/set.size()));
		System.out.println("Lowest : "+min);
		System.out.println("Highest : "+max);
		
		System.out.println("Odd numbers : ");
		for(int e : set) {
			if((e&1)==1)System.out.print(e+" ");
		} 
	}
}
