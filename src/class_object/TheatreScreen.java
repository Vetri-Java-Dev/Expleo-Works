//code for theatre ticket booking system

package class_object;

public class TheatreScreen {
	
	private static int totalSeats=30;
	
	TheatreScreen() {
		System.out.println("Current seat availability : "+totalSeats);
	}
	
	public void displayAvailSeats() {
		System.out.println("Current seat availability : "+totalSeats);
	}
	
	public void bookSeats(int noOfSeats) {
		
		if(noOfSeats>totalSeats) {
			System.out.print("Invalid no of seats.");
			return;
		}
		
		totalSeats-=noOfSeats; 
		System.out.println(noOfSeats+" seats booked.");
	}
	
}
