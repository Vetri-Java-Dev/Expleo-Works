/*Ticket Status using Multi Dimensional Array*/

package Arrays;

public class TicketBooking {
	public static void main(String[] args) {
		
		String[][] seats= {{"A","B","A","B"}, //VIP
				{"B","B","A","B"}, //Premium
				{"A","A","A","B"}, //Premium
				{"A","A","A","A"}}; //regular
		
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
