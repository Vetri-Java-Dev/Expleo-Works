/*Ticket Status using Multi Dimensional Array*/

package Arrays;

import java.util.Scanner;

public class TicketStatusJaggedArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String[][] seats= new String[3][]; 
		
		for(int i=0;i<seats.length;i++) {
			
			if(i==0) {
				System.out.print("Enter VIP seat column size : ");
			}
			else if(i==1) {
				System.out.print("\nEnter Premium seat column size : ");
			}
			else{
				System.out.print("\nEnter Regular seat column size : ");
			}
			
			int col=sc.nextInt();
			
			seats[i]=new String[col];
			
			System.out.print("Enter Seat status (A/B) : ");
			for(int j=0;j<col;j++) {
				seats[i][j]=sc.next().toUpperCase();
			}
		}
		
		
		for(int i=0;i<seats.length;i++) {
			if(i==0) {
				System.out.println("\n---------VIP--------");
			}
			else if(i==1) {
				System.out.println("\n-------Premium--------");
			}
			else{
				System.out.println("\n-------Regular--------");
			}
			
			int availSeats=0;
			int bookedSeats=0;
			
			for(int j=0;j<seats[i].length;j++) {
				if(seats[i][j].equalsIgnoreCase("A")) {
					availSeats++;
				}
				else if(seats[i][j].equalsIgnoreCase("B")) {
					bookedSeats++;
				}
				
			}
			
			System.out.println("");
			System.out.println("Booked Seats : "+bookedSeats);
			System.out.println("Available Seats : "+availSeats);
			System.out.println("Total Seats : "+seats[i].length);
		}
	}
}
