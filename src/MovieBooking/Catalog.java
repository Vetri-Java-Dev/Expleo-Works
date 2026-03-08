package MovieBooking;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Catalog implements SearchByGenre,SearchByTitle{

	private static LocalDate date;
	private List<Movie> movieList=new ArrayList<>();
	
	@Override
	public void searchByTitle(String title) {
		
		boolean isFound=false;
		
		for(Movie movie : movieList) {
			if(movie.getTitle().equalsIgnoreCase(title)) {
				System.out.println(movie.getMovieDetails());
				System.out.println("");
				
				isFound=true;
			}
		}
		
		if(!isFound)System.out.println("Movie with this title not found.");
	}

	@Override
	public void searchByGenre(String genre) {
		
		boolean isFound=false;
		
		for(Movie movie : movieList) {
			if(movie.getGenre().equalsIgnoreCase(genre)) {
				System.out.println(movie.getMovieDetails());
				System.out.println("");
				
				isFound=true;
			}
		}
		if(!isFound)System.out.println("Movie with this genre not found.");
	}
	
	public void addMovie(Movie movie) {
		movieList.add(movie);
	}

}
