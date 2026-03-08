package MovieBooking;
import java.time.LocalDate;

public class MovieBookingSystem {
	public static void main(String[] args) {
		
		Catalog catalog=new Catalog();
		
		catalog.addMovie(new Movie("Fight club","Individual starts club.",
	                10,"English",LocalDate.parse("2005-03-17"),
	                "America","Crime"));
		
		catalog.addMovie(new Movie("The Dark Knight","Batman faces the Joker.",
		                10,"English",LocalDate.parse("2008-07-18"),
		                "America","Action"));
		
		catalog.searchByTitle("Fight club");
	}
}
